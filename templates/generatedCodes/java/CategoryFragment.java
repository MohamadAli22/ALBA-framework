package com.yourdomain.appname;




import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.internal.LinkedTreeMap;
import com.yourdomain.appname.dbClasses.LocationCategory;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;
import com.yourdomain.appname.dbClasses.LocationCategory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ALBA.
 */

public class CategoryFragment extends Fragment {
    View root;
    private RecyclerView recyclerView_category;
    private GridLayoutManager gridLayoutManager;
    private CategoryAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_category, null);
        MainActivity.drawer.setSelection(2);
        recyclerView_category = (RecyclerView) root.findViewById(R.id.recycler_view);
        load_data_from_server();
        
        gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView_category.setLayoutManager(gridLayoutManager);
        
        return root;
    }


    private void load_data_from_server() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://hiiranco.ir/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        getCategories categoriesFromApi = retrofit.create(getCategories.class);
        Call<Object> callCategories;
        //todo: send request with your prefered values
        callCategories = categoriesFromApi.getFeed("1","1","1",1);
        
        callCategories.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                
                if (response.isSuccessful()) {
                    LinkedTreeMap<String, Object> res = (LinkedTreeMap<String, Object>) response.body();
                    List<LinkedTreeMap<String, Object>> list = (List<LinkedTreeMap<String, Object>>) res.get("result");
                    adapter = new CategoryAdapter(getContext(),list);
                    recyclerView_category.setAdapter(adapter);
                }
            }
            
            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                //load_data_from_local();
            }
        });
    }



	
    public interface getCategories {
        @GET("API/hiIranApi/public/getCategories" + "/{email}/{mobile}/{pass}/{id}")
        Call<Object> getFeed(@Path("email") String email, @Path("mobile") String mobile, @Path("pass") String pass, @Path("id") int id);
    }


    class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
        private List<LinkedTreeMap<String,Object>> category_data;
        Context context;
        int properWidth;
        int properHeight;
        boolean fTime;
        final String imageBaseUrl = "http://hiiranco.ir//img/";

        public CategoryAdapter(Context context, List<LinkedTreeMap<String,Object>> category_data) {
            this.category_data = category_data;
            this.context = context;
        }
        public CategoryAdapter(Context context, List<LocationCategory> h , int m) {
            List<LinkedTreeMap<String,Object>> category_data = new ArrayList<>(h.size());
            for (LocationCategory child:h){
                LinkedTreeMap<String,Object> ltm = new LinkedTreeMap<>();
                ltm.put("link" , child.getLink());
                ltm.put("name" , child.getName());
                ltm.put("id" , child.getId());
                category_data.add(ltm);
            }

            this.category_data = category_data;
            this.context = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_category_list_item, parent, false);

            if(!fTime) {
                properWidth = (int) (MainActivity.toolbarWidth
                        - dp2px(itemView.getContext(),32 ));
                properHeight = (int)dp2px(itemView.getContext(),130);
                fTime = true;
            }

            CardView.LayoutParams lp = new CardView.LayoutParams(properWidth/3,properHeight);
            lp.setMargins((int)(dp2px(itemView.getContext() ,8)) ,
                    (int)(dp2px(itemView.getContext() ,8)) ,
                    (int)(dp2px(itemView.getContext() ,8)) ,
                    (int)(dp2px(itemView.getContext() ,8)));
            itemView.setLayoutParams(lp);
            return new ViewHolder(itemView);
        }
        
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Picasso.with(context).load(imageBaseUrl + category_data.get(position).get("link")).into(holder.category_image);
            holder.txt_category.setText(category_data.get(position).get("name")+"");
        
        }

        @Override
        public int getItemCount() {
            return category_data.size();
        }


        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        
	    public ImageView category_image ;
	    public TextView txt_category ;
            

            public ViewHolder(View itemView) {
                super(itemView);
                
	        category_image = (ImageView) itemView.findViewById(R.id.category_image);                
	        txt_category = (TextView) itemView.findViewById(R.id.txt_category);	        
                itemView.setOnClickListener(this);
            }
            
            @Override
            public void onClick(View v) {
            	MapFragment.category_id = category_data.get(getPosition()).get("id").toString();
            	FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new MapFragment(), "map").addToBackStack("FB").setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
        
            }
        }

        public float dp2px(final Context context, final float dp) {
            return dp * context.getResources().getDisplayMetrics().density;
        }
    }
    
    private void load_data_from_local() {
        List<LocationCategory> cats = MainActivity.daoSessionRead.getLocationCategoryDao().
                queryBuilder().list();
        adapter = new CategoryAdapter(getContext(),cats , 0);
        recyclerView_category.setAdapter(adapter);
    }
    
    
    public static class Global extends Application {
        @Override
        public void onCreate() {
            super.onCreate();

            Picasso.Builder builder = new Picasso.Builder(this);
            builder.downloader(new OkHttpDownloader(this,Integer.MAX_VALUE));
            Picasso built = builder.build();
            //built.setIndicatorsEnabled(true);
            //built.setLoggingEnabled(true);
            Picasso.setSingletonInstance(built);

        }

    }
}
