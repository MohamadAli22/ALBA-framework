

package com.yourdomain.appname;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.gson.internal.LinkedTreeMap;
import com.yourdomain.appname.dbClasses.LocationDao;
import com.yourdomain.appname.dbClasses.LocationSubCategory;
import com.yourdomain.appname.dbClasses.LocationSubCategoryDao;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import static com.yourdomain.appname.MapFragment.category_id;
import static com.yourdomain.appname.MapFragment.listOfSubCategories;
import static com.yourdomain.appname.MapFragment.listOfSubCategoriesId;
import static com.yourdomain.appname.MapFragment.subCategory_id;

/**
 * Created by Alba.
 */

public class MapLocationFragment extends Fragment {
    View v;
    RecyclerView recyclerView;
    static AdapterPlaces adapter ;
    public static ArrayList<LinkedTreeMap<String , Object>> result = new ArrayList<>();
    TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_map_location,null);
		makeItReady();
        return v;
    }
    
    public void makeItReady(){
    recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_mf);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        adapter = new AdapterPlaces(result);
        recyclerView.setAdapter(adapter);
        tabLayout = (TabLayout) v.findViewById(R.id.tabs2);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = listOfSubCategoriesId.get(tab.getPosition());
                getDataFunction(v.getContext(),false,position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        getDataFunction(getContext(),true,subCategory_id);
        
        MainActivity.menu.getItem(1).setVisible(false);
        MainActivity.menu.getItem(0).setVisible(true);
    }

    private void getDataFunction(final Context context , final boolean getTabs , final int subCatId) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://hiiranco.ir/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        final MapFragment.getCategories subCategoriesFromApi = retrofit.create(MapFragment.getCategories.class);
        Call<Object> callSubCategories;

        callSubCategories = subCategoriesFromApi.getFeed("1", "1", "1", category_id,"1");


        Call<Object> call;
        MapFragment.getDate sender = retrofit.create(MapFragment.getDate.class);
        call = sender.getFeed("1","1","3",subCatId+"","1");


        if(getTabs) {
            callSubCategories.enqueue(new Callback<Object>() {
                @Override
                public void onResponse(Call<Object> call, Response<Object> response) {

                    if (response.isSuccessful()) {

                        LinkedTreeMap<String, Object> res = (LinkedTreeMap<String, Object>) response.body();
                        List<LinkedTreeMap<String, Object>> list = (List<LinkedTreeMap<String, Object>>) res.get("result");
						listOfSubCategories.clear();
                        listOfSubCategoriesId.clear();
                        
                        for (LinkedTreeMap<String, Object> child : list) {
							listOfSubCategoriesId.add(Double.valueOf(child.get("id").toString()).intValue());
							listOfSubCategories.add((String)child.get("name"));
                        }
                        setTabs(listOfSubCategories, getActivity());

                    }
                }

                @Override
                public void onFailure(Call<Object> call, Throwable t) {
                try {
                       if(category_id.equals("-1")){
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment, new CategoryFragment(), "category").commit();
                        
                    }
                    else {
                            //get_data_from_local(getTabs , subCatId);
                    }

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                
                
                    
                }
            });
        }

        call.enqueue(new Callback<Object>() {

            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                if(response.isSuccessful()) {

                    LinkedTreeMap<String, Object> res = (LinkedTreeMap<String, Object>) response.body();
                    ArrayList<LinkedTreeMap<String, Object>> list = (ArrayList<LinkedTreeMap<String, Object>>) res.get("result");

                    adapter.result.clear();
                    MapLocationFragment.result.clear();

                    adapter.result = list;
                    MapLocationFragment.result = list;
                    
                    adapter.notifyDataSetChanged();
                }
                }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
               // get_data_from_local(false , subCatId);
            }
        });

    }

    private void get_data_from_local(boolean getTabs , int subCatId) {

        if(getTabs) {
            List<LocationSubCategory> subCats = MainActivity.daoSessionRead.getLocationSubCategoryDao().queryBuilder()
                    .where(LocationSubCategoryDao.Properties.CategoryId.eq(category_id)).list();
            listOfSubCategories.clear();
            listOfSubCategoriesId.clear();

            for (LocationSubCategory child : subCats) {
                listOfSubCategories.add(child.getName());
                listOfSubCategoriesId.add(Long.valueOf(child.getId()).intValue());
            }
            setTabs(listOfSubCategories, getActivity());        }

        List<com.yourdomain.appname.dbClasses.Location> locs = MainActivity.daoSessionRead.getLocationDao()
                .queryBuilder()
                .where(LocationDao.Properties.SubCatId.eq(subCatId)).list();


        if(locs.isEmpty() && subCatId!=1)
            Toast.makeText(getContext(),"no location to show" ,Toast.LENGTH_LONG).show();

        adapter.result.clear();
        MapLocationFragment.result.clear();

        for (com.yourdomain.appname.dbClasses.Location child : locs){
            LinkedTreeMap<String,Object> temp = new LinkedTreeMap<>();
            temp.put("id",child.getId()+"");
            temp.put("latitude",child.getLatitude());
            temp.put("longitude",child.getLongitude());
            temp.put("title",child.getTitle());
            temp.put("note",child.getNote());
            temp.put("link",child.getLink());
            temp.put("address",child.getAddress());
            temp.put("phoneNumber",child.getPhoneNumber());
            adapter.result.add(temp);
            MapLocationFragment.result.add(temp);
        }

        adapter.notifyDataSetChanged();


    }

    private void setTabs(final ArrayList listOftabs ,final Activity a) {
        for (Object tab : listOftabs) {
            tabLayout.addTab(tabLayout.newTab().setText((String)tab));
        }
        try {
            tabLayout.setSmoothScrollingEnabled(true);
            new Handler().postDelayed(
                    new Runnable() {
                        @Override
                        public void run() {
                        try {
                                a.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (tabLayout.getTabAt(0) != null && subCategory_id == -1) {
                                            tabLayout.getTabAt(0).select();

                                        } else if (subCategory_id != -1) {
                                            tabLayout.getTabAt(listOfSubCategoriesId.indexOf(subCategory_id)).select();

                                        } else {
                                            Toast.makeText(getContext(), "no value to show", Toast.LENGTH_LONG).show();
                                        }
                                    }
                                });
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                       }
                    }, 10);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    class AdapterPlaces extends RecyclerView.Adapter<AdapterPlaces.ViewHolderr>{

        public ArrayList<LinkedTreeMap<String , Object>> result ;

        public AdapterPlaces(ArrayList<LinkedTreeMap<String , Object>> res){
            result = res;
        }

        @Override
        public AdapterPlaces.ViewHolderr onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_locations_on_map, parent, false);
            return  new AdapterPlaces.ViewHolderr(v);
        }

        @Override
        public void onBindViewHolder(AdapterPlaces.ViewHolderr holder, int position) {
        
            holder.title.setText( result.get(position).get("title")+"" );
            holder.address.setText( result.get(position).get("address")+"" );
            Picasso.with(holder.title.getContext())
                    .load("http://hiiranco.ir//img/"+result.get(position).get("picLink"))
                    .error(R.drawable.ic_error_web)
                    .into(holder.imageView_card);
        
            
        }

        @Override
        public int getItemCount() {
            return result.size();
        }

        class ViewHolderr extends RecyclerView.ViewHolder{
        
	    	public TextView title ;
	    	public TextView address ;
	    	public ImageView imageView_card ;
        
            public ViewHolderr(View itemView) {
                super(itemView);
                
	        title = (TextView) itemView.findViewById(R.id.title);                
	        address = (TextView) itemView.findViewById(R.id.address);                
	        imageView_card = (ImageView) itemView.findViewById(R.id.imageView_card);                //title = (TextView) itemView.findViewById(R.id.title);
                //address = (TextView) itemView.findViewById(R.id.address);
                //iv = (ImageView) itemView.findViewById(R.id.imageView_card);
                
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LocationsFragment.phoneNumber = result.get(getAdapterPosition()).get("phoneNumber")+"";
                        LocationsFragment.st_title = result.get(getAdapterPosition()).get("title")+"";
                        LocationsFragment.st_pic = result.get(getAdapterPosition()).get("link")+"";
                        LocationsFragment.st_note = result.get(getAdapterPosition()).get("note")+"";
                        LocationsFragment.st_address = result.get(getAdapterPosition()).get("address")+"";
                        LocationsFragment.lat = Double.valueOf(result.get(getAdapterPosition()).get("latitude")+"");
                        LocationsFragment.lon = Double.valueOf(result.get(getAdapterPosition()).get("longitude")+"");
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment, new LocationsFragment(), "map2").addToBackStack("FB2").setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
                        
                    }
                });
            }
        }
    }
}
