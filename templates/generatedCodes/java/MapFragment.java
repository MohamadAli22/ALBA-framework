
package com.yourdomain.appname; 



import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.location.Location;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
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

/**
 * Created by Alba.
 */
 
public class MapFragment extends Fragment {
    View root;

    static GoogleMap gmap;
    RecyclerView recycler ;
    AdapterPlacesOnMap adapter;
    float startX=0;
    LinearLayoutManager lm ;

    static String category_id = "-1";
    static int subCategory_id = -1;
    static int location_id = -1;
    static boolean barmigardam = false;
    static double myLat = -1;
    static double myLon = -1;


    ArrayList<Marker> markers ;
    TabLayout tabLayout;
    static ArrayList<String> listOfSubCategories = new ArrayList<>();
    static ArrayList<Integer> listOfSubCategoriesId = new ArrayList<>();

    SupportMapFragment mapFragment;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        
        barmigardam = false;
        if (root != null) {
            ViewGroup parent = (ViewGroup) root.getParent();
            if (parent != null)
                parent.removeView(root);
        }
        try {
            root = inflater.inflate(R.layout.fragment_map, null);
        } catch (Exception e) {
        }
        
        makeItReady();
        

        return root;
    }
    
    public void makeItReady(){
    
    
        listOfSubCategories.clear();
        listOfSubCategoriesId.clear();
    
        View view = getActivity().getCurrentFocus();
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (view != null && imm != null)
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);


        if(category_id!=null && category_id.equals("-1")){
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment, new CategoryFragment(), "category").commit();
        }

        lm = new LinearLayoutManager(root.getContext(), LinearLayoutManager.HORIZONTAL, true);
        recycler = (RecyclerView) root.findViewById(R.id.rec_shops);
        adapter = new AdapterPlacesOnMap(new ArrayList<LinkedTreeMap<String, Object>>());

        recycler.setLayoutManager(lm);
        recycler.setAdapter(adapter);

        lm.setSmoothScrollbarEnabled(true);

		MainActivity.drawer.setSelection(3);
        
        recycler.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

                try {

                    if (e.getAction() == MotionEvent.ACTION_DOWN) {
                        startX = e.getX();
                    }

                    if (e.getAction() == MotionEvent.ACTION_UP) {
                        if ((e.getX() - startX) > 0) {

                            if ((e.getX() - startX) > MainActivity.toolbarWidth / 10) {
                                recycler.smoothScrollToPosition(lm.findFirstVisibleItemPosition());

                                gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                        new LatLng(Double.valueOf(adapter.result.get(lm.findFirstVisibleItemPosition()).get("latitude")+""),
                                                Double.valueOf(adapter.result.get(lm.findFirstVisibleItemPosition()).get("longitude")+"")), 16.0f));


                                Marker m = findMarkerByPos(Double.valueOf(adapter.result.get(lm.findFirstVisibleItemPosition()).get("latitude")+""),
                                        Double.valueOf(adapter.result.get(lm.findFirstVisibleItemPosition()).get("longitude")+""));
                                m.showInfoWindow();


                            } else if( (e.getX() - startX) > dp2px(getContext(),20)){
                                recycler.smoothScrollToPosition(lm.findLastVisibleItemPosition());


                                gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                        new LatLng(Double.valueOf(adapter.result.get(lm.findLastVisibleItemPosition()).get("latitude")+""),
                                                Double.valueOf(adapter.result.get(lm.findLastVisibleItemPosition()).get("longitude")+"")), 16.0f));

                                Marker m = findMarkerByPos(Double.valueOf(adapter.result.get(lm.findLastVisibleItemPosition()).get("latitude")+""),
                                        Double.valueOf(adapter.result.get(lm.findLastVisibleItemPosition()).get("longitude")+""));
                                m.showInfoWindow();
                            }

                        } else {
                            if ((startX - e.getX()) > MainActivity.toolbarWidth / 10) {
                                recycler.smoothScrollToPosition(lm.findLastVisibleItemPosition());

                                gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                        new LatLng(Double.valueOf(adapter.result.get(lm.findLastVisibleItemPosition()).get("latitude")+""),
                                                Double.valueOf(adapter.result.get(lm.findLastVisibleItemPosition()).get("longitude")+"")), 16.0f));

                                Marker m = findMarkerByPos(Double.valueOf(adapter.result.get(lm.findLastVisibleItemPosition()).get("latitude")+""),
                                        Double.valueOf(adapter.result.get(lm.findLastVisibleItemPosition()).get("longitude")+""));
                                m.showInfoWindow();

                            } else if( (startX - e.getX()) > dp2px(getContext(),20)) {
                                recycler.smoothScrollToPosition(lm.findFirstVisibleItemPosition());

                                gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                        new LatLng(Double.valueOf(adapter.result.get(lm.findFirstVisibleItemPosition()).get("latitude")+""),
                                                Double.valueOf(adapter.result.get(lm.findFirstVisibleItemPosition()).get("longitude")+"")), 16.0f));


                                Marker m = findMarkerByPos(Double.valueOf(adapter.result.get(lm.findFirstVisibleItemPosition()).get("latitude")+""),
                                        Double.valueOf(adapter.result.get(lm.findFirstVisibleItemPosition()).get("longitude")+""));
                                m.showInfoWindow();
                            }
                        }
                    }
                }catch (Exception ee){
                    ee.printStackTrace();
                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }

            public float dp2px(final Context context, final float dp) {
                return dp * context.getResources().getDisplayMetrics().density;
            }

        });



        mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {

                gmap = googleMap;
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(32.635591,51.637743),10f ));
                gmap.setMaxZoomPreference(20.0f);
                gmap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker) {
                        if(markers.indexOf(marker)!=-1)
                        recycler.smoothScrollToPosition( markers.indexOf(marker) );
                        return false;
                    }
                });
                
                googleMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
                    @Override
                    public void onMyLocationChange (Location location) {
                            myLat = location.getLatitude();
                            myLon = location.getLongitude();
                            if(adapter!=null)
                                adapter.notifyDataSetChanged();
                            if(MapLocationFragment.adapter!=null)
                                MapLocationFragment.adapter.notifyDataSetChanged();
                        Log.d("myPos", "onMyLocationChange: " + myLon +"  "+ myLat);
                    }
                });


                if (ActivityCompat.checkSelfPermission(root.getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(getActivity(),
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                            12);
                    return;
                }
                googleMap.setMyLocationEnabled(true);
            }
        });

        getDataFunction(root.getContext(),true,subCategory_id);
        tabLayout = (TabLayout) root.findViewById(R.id.tabs);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = listOfSubCategoriesId.get(tab.getPosition());
                getDataFunction(root.getContext(),false,position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            	int position = listOfSubCategoriesId.get(tab.getPosition());
                getDataFunction(getContext(),false,position);
            }
        });
       try {
            MainActivity.menu.getItem(0).setVisible(false);
            MainActivity.menu.getItem(1).setVisible(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    
    }

    
    /**
     * @param context the context of application
     * @param getTabs if true, gets tabs items
     */
    private void getDataFunction(final Context context , final boolean getTabs , final int subCatId) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://hiiranco.ir/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Call<Object> call;
        getDate sender = retrofit.create(getDate.class);
        call = sender.getFeed("1","1","3",subCatId+"","1");



        final getCategories subCategoriesFromApi = retrofit.create(getCategories.class);
        Call<Object> callSubCategories;

        callSubCategories = subCategoriesFromApi.getFeed("1", "1", "1", category_id,"1");


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
                    if(category_id!=null && category_id.equals("-1")){
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment, new CategoryFragment(), "category").commit();
                    }
                    else {
                            //get_data_from_local(getTabs , subCatId);
                    }


                }
            });
        }



        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                if(response.isSuccessful()){
                    if(gmap==null)return;


                    LinkedTreeMap<String , Object> res = (LinkedTreeMap<String, Object>) response.body();
                    ArrayList<LinkedTreeMap<String, Object>> list = (ArrayList<LinkedTreeMap<String, Object>>) res.get("result");

                    if (!list.isEmpty()) {
                        adapter.result.clear();
                    }

                    adapter.result = list;
                    recycler.setAdapter(adapter);

                    showMarksOnMap();

                    adapter.notifyDataSetChanged();

                    if(adapter.result.size()!=0){
                        gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                new LatLng(Double.valueOf(adapter.result.get(0).get("latitude")+""),
                                        Double.valueOf(adapter.result.get(0).get("longitude")+"")),16.0f ));
                        Marker m = findMarkerByPos(Double.valueOf(adapter.result.get(0).get("latitude")+""),
                                Double.valueOf(adapter.result.get(0).get("longitude")+""));
                        m.showInfoWindow();
                    }

                    try{
                        if(location_id ==-1)
                            recycler.smoothScrollToPosition(0);
                        else{
                            String s = location_id + "";
                            int c=0;
                            int po = 0;
                            for (LinkedTreeMap i : adapter.result){
                                if(i.get("id").toString().equals(s) || i.get("id").toString().equals(s+".0")){
                                    po = c;
                                }
                                c++;
                            }
                            recycler.smoothScrollToPosition(po);
                            gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                    new LatLng(Double.valueOf(adapter.result.get(po).get("latitude")+""),
                                            Double.valueOf(adapter.result.get(po).get("longitude")+"")), 16.0f));

                            Marker m = findMarkerByPos(Double.valueOf(adapter.result.get(po).get("latitude")+""),
                                    Double.valueOf(adapter.result.get(po).get("longitude")+""));
                            m.showInfoWindow();
                        }

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }else{
                    Toast.makeText(getContext(),"there is a problem" ,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                //get_data_from_local(false , subCatId);
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
            Toast.makeText(getContext(),"no location found" ,Toast.LENGTH_LONG).show();

        adapter.result.clear();

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
        }


        showMarksOnMap();

        adapter.notifyDataSetChanged();

        if(adapter.result.size()!=0){

            gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                    new LatLng(Double.valueOf(adapter.result.get(0).get("latitude")+""),
                            Double.valueOf(adapter.result.get(0).get("longitude")+"")),16.0f ));

            Marker m = findMarkerByPos(Double.valueOf(adapter.result.get(0).get("latitude")+""),
                    Double.valueOf(adapter.result.get(0).get("longitude")+""));
            m.showInfoWindow();

        }

        try{
            if(location_id ==-1)
                recycler.smoothScrollToPosition(0);
            else{
                String s = location_id + "";
                int c=0;
                int po = 0;
                for (LinkedTreeMap i : adapter.result){
                    if(i.get("id").toString().equals(s) || i.get("id").toString().equals(s+".0")){
                        po = c;
                    }
                    c++;
                }
                recycler.smoothScrollToPosition(po);
                gmap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                        new LatLng(Double.valueOf(adapter.result.get(po).get("latitude")+""),
                                Double.valueOf(adapter.result.get(po).get("longitude")+"")), 16.0f));

                Marker m = findMarkerByPos(Double.valueOf(adapter.result.get(po).get("latitude")+""),
                        Double.valueOf(adapter.result.get(po).get("longitude")+""));
                m.showInfoWindow();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public interface getDate {
        @GET("API/hiIranApi/public/getLocations" + "/{email}/{pass}/{mobile}/{subCatId}/{langId}")
        Call<Object> getFeed(@Path("email") String email, @Path("pass") String pass, @Path("mobile") String mobile, @Path("subCatId") String subCatId, @Path("langId") String langId); 
    }

    public interface getCategories {
    	@GET("API/hiIranApi/public/getSubCategories" + "/{email}/{pass}/{mobile}/{categoryId}/{langId}")
        Call<Object> getFeed(@Path("email") String email, @Path("pass") String pass, @Path("mobile") String mobile, @Path("categoryId") String categoryId, @Path("langId") String langId);
    }

    public Marker findMarkerByPos(double lat , double lon){
        for(int i =0 ; i<markers.size() ; i++){
            if(markers.get(i).getPosition().latitude == lat &&
                    markers.get(i).getPosition().longitude == lon){
                return markers.get(i);
            }
        }
        return null;
    }

    public void showMarksOnMap(){
        markers = new ArrayList<>(adapter.result.size());
        if(gmap==null)return;
        gmap.clear();
        for(int i = 0; i< adapter.result.size() ; i++){
                Marker m = gmap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_blue_positionmark))
                        .anchor(0.5f, 1.0f)
                        .position(new LatLng( Double.valueOf(adapter.result.get(i).get("latitude")+""), Double.valueOf(adapter.result.get(i).get("longitude")+"") ))
                        .title(adapter.result.get(i).get("title")+"")
                );
                markers.add(m);
        }
        
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

    @Override
    public void onStop() {
        if(!barmigardam) {
            location_id = -1;
            subCategory_id = -1;
        }
        if(mapFragment != null) {
            try {
                FragmentManager fM = getChildFragmentManager();
                fM.beginTransaction().remove(mapFragment).commit();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        super.onStop();
        if(adapter!=null)
            adapter.fTime = false;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    class AdapterPlacesOnMap extends RecyclerView.Adapter<AdapterPlacesOnMap.ViewHolderr>{


        private ArrayList<LinkedTreeMap<String , Object>> result ;

        boolean fTime = false;
        boolean ffTime = false;
        float properWidth = 0;
        float properHeight = 0;

        public AdapterPlacesOnMap(ArrayList<LinkedTreeMap<String , Object>> res){
            result = res;
        }

        @Override
        public ViewHolderr onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_locations_on_map, parent, false);

            if(!ffTime){
                properWidth = recycler.getWidth() - dp2px(v.getContext(),32);
                properHeight = recycler.getHeight();
                ffTime = true;
            }

            CardView.LayoutParams lp = new CardView.LayoutParams((int)properWidth,(int)properHeight);
            lp.setMargins((int)(dp2px(v.getContext() ,6)) , 0 , (int)(dp2px(v.getContext() ,6)) , 0);
            v.setLayoutParams(lp);
            return  new ViewHolderr(v);
        }

        @Override
        public void onBindViewHolder(ViewHolderr holder, int position) {
        
            holder.title.setText( result.get(position).get("title")+"" );
            holder.address.setText( result.get(position).get("address")+"" );
            Picasso.with(holder.title.getContext())
                    .load("http://hiiranco.ir//img/"+result.get(position).get("picLink"))
                    .error(R.drawable.ic_error_web)
                    .into(holder.imageView_card);
            //holder.title.setText( result.get(position).get("title")+"" );
            //holder.address.setText(result.get(position).get("address")+"");
        }

        @Override
        public int getItemCount() {
            return result.size();
        }

        public float dp2px(final Context context, final float dp) {
            return dp * context.getResources().getDisplayMetrics().density;
        }


        class ViewHolderr extends RecyclerView.ViewHolder{
	    public TextView title ;
	    public TextView address ;
	    public ImageView imageView_card ;
        
        
            //TextView title ;
            //ImageView iv;
            //TextView address;
            

            public ViewHolderr(View itemView) {
                super(itemView);
	    		title = (TextView)itemView.findViewById(R.id.title);
	    		address = (TextView)itemView.findViewById(R.id.address);
	    		imageView_card = (ImageView)itemView.findViewById(R.id.imageView_card);
                
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