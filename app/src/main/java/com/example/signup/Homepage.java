package com.example.signup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Homepage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
//    ActionBarDrawerToggle actionBarDrawerToggle;


//    @Override
//    public boolean onOptionsItemSelected( MenuItem item) {
//        if (actionBarDrawerToggle.onOptionsItemSelected(item))  {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView.bringToFront();

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.menu_Open,R.string.menu_Close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                switch (item.getItemId()) {
//
//                    case R.id.nav_home:
//                        Log.i("MENU_DRAWER_TAG", "Home item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_search:
//                        Log.i("MENU_DRAWER_TAG", "Search item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_Users:
//                        Log.i("MENU_DRAWER_TAG", "Users item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_profiles:
//                        Log.i("MENU_DRAWER_TAG", "Profiles item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_settings:
//                        Log.i("MENU_DRAWER_TAG", "settings item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_share:
//                        Log.i("MENU_DRAWER_TAG", "share item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_rate_us:
//                        Log.i("MENU_DRAWER_TAG", "Rate us item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_about_us:
//                        Log.i("MENU_DRAWER_TAG", "About us item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_logout:
//                        Log.i("MENU_DRAWER_TAG", "Logout item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.nav_privacy_policy:
//                        Log.i("MENU_DRAWER_TAG", "Privacy policy item is clicked");
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//                }
//
//
//
//                return true;
//            }
//        });

    }
    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}