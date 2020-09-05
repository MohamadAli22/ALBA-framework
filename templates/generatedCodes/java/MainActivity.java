package com.yourdomain.appname;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.yourdomain.appname.dbClasses.DaoMaster;
import com.yourdomain.appname.dbClasses.DaoSession;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ALBA.
 */
public class MainActivity extends AppCompatActivity {

    static Drawer drawer;
    static AccountHeader headerResult;
    static int toolbarWidth = 0 ;
    static DaoSession daoSession = null;
    static DaoSession daoSessionRead = null;
    
    static Menu menu;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        
        
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        toolbarWidth = size.x;

        setSupportActionBar(toolbar);
    
    	FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment, new CategoryFragment(), "CategoryFragment").commit();
    



		PrimaryDrawerItem categoryNavItem = new PrimaryDrawerItem().withIdentifier(2).withName("catFrg").withIcon(FontAwesome.Icon.faw_list).withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
            @Override
            public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new CategoryFragment(), "category").commit();
                return false;
            }
        });
		PrimaryDrawerItem mapNavItem = new PrimaryDrawerItem().withIdentifier(3).withName("locFrg").withIcon(FontAwesome.Icon.faw_map).withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
            @Override
            public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new MapFragment(), "maps").commit();
                return false;
            }
        });
        

        TextView ver = new TextView(this);
        ver.setText("designed by MDD approach");
        ver.setTextColor(Color.BLACK);


        headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.color.colorPrimaryDark)
                .withTextColorRes(R.color.md_white_1000)
//                .addProfiles(def_profileDrawerItem)
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .withSelectionListEnabled(false)
                .build();

        drawer = new DrawerBuilder().withActivity(this)
                .withToolbar(toolbar)
                .withDrawerGravity(Gravity.RIGHT)
                .withOnDrawerListener(new Drawer.OnDrawerListener() {
                    @Override
                    public void onDrawerOpened(View drawerView) {
                        View view = getCurrentFocus();
                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        if (view != null)
                            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {

                    }

                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {

                    }
                })
                .addDrawerItems(  
        categoryNavItem,
        mapNavItem,
        locNavItem
        		)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, final IDrawerItem drawerItem) {
                        return false;
                    }
                })
                .withAccountHeader(headerResult)
                .withFooter(ver)
                .withFooterDivider(true)
                .build();
    			


    			


		DaoSession[] ds = startDB();
        daoSession = ds[0];
        daoSessionRead = ds[1];
        getAllData();


    }
    
    public DaoSession[] startDB(){
        DatabaseOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db", null);
        Database db = helper.getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession[] daoSession = new DaoSession[2];
        daoSession[0] = daoMaster.newSession();
        Database db2 = helper.getReadableDb();
        DaoMaster daoMaster2 = new DaoMaster(db2);
        daoSession[1] = daoMaster2.newSession();
        return daoSession;
    }
    
    
    public void getAllData(){
    	//todo get data from server and save it in DB for offline usage
    }
    
    
    @Override
    public void onBackPressed(){
        if (getSupportFragmentManager().getBackStackEntryCount() == 1){
            super.onBackPressed();
        }
        else {
            getSupportFragmentManager().popBackStack();
        }
    }


    /**
     *
     * @param requestCode code that you used when you send the request for permition
     * @param permissions the permissions that we wanted to grant
     * @param grantResults result of permissions
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        if (requestCode == 12) {
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                    || ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                if(MapFragment.gmap != null)
                    MapFragment.gmap.setMyLocationEnabled(true);

            } else {
                AlertDialog alert;
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                        dialog.dismiss();
                        finish();
                    }
                });
                builder.setTitle("sorry, we have to close the program");
                alert = builder.create();
                alert.show();
            }
        }

        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Intent intent = new Intent(Intent.ACTION_CALL);
            Bundle bundle = new Bundle();
            bundle.putString("mobilePhone", LocationsFragment.phoneNumber);
            intent.setData(Uri.parse("tel:" + bundle.getString("mobilePhone")));
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            startActivity(intent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.app_bar_list){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment, new MapLocationFragment(), "map2").addToBackStack("FB2").setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
        }else  if(item.getItemId()==R.id.app_bar_map){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment, new MapFragment(), "map2").addToBackStack("FB2").setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
        }else if (item.getItemId() == R.id.app_bar_back){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.search , menu);
        this.menu = menu;
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        GoogleApiAvailability gIsAvailable = GoogleApiAvailability.getInstance();
        int error = gIsAvailable.isGooglePlayServicesAvailable(getApplicationContext());
        if(gIsAvailable.getErrorDialog(this,error,error)!=null)
            gIsAvailable.getErrorDialog(this,error,error).show();
    }
    
    
}
