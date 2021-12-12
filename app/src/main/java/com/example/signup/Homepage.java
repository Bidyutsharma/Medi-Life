package com.example.signup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Homepage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button blood;
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
        navigationView= findViewById(R.id.nav_view);
        blood= (Button) findViewById(R.id.bloodBtn2);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView.bringToFront();

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.menu_Open,R.string.menu_Close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);



        navigationView.setCheckedItem((R.id.nav_home));

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
        blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Homepage.this,"Item Clicked",Toast.LENGTH_SHORT).show();
                Intent intentBlood = new Intent(Homepage.this,Diagnosis.class);
                startActivity(intentBlood);
            }
        });

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

        switch (item.getItemId()) {

            case R.id.nav_home:
                Toast.makeText(this, "HomePage", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Homepage.this,Home.class);
                startActivity(intent);
                break;

            case R.id.nav_search:
                Toast.makeText(this, "searching", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_Users:
                Toast.makeText(this, "Users", Toast.LENGTH_SHORT).show();
                Intent intentt = new Intent(Homepage.this,Users.class);
                startActivity(intentt);
                break;

            case R.id.nav_profiles:
                Toast.makeText(this, "WELCOME TO YOUR PROFILE", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_settings:
                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_share:
                Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_rate_us:
                Toast.makeText(this, "Rate Us", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_about_us:
                Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_logout:
                Toast.makeText(this, "LogOut", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_privacy_policy:
                Toast.makeText(this, "Privacy", Toast.LENGTH_SHORT).show();
                break;



        }


        drawerLayout.closeDrawer(GravityCompat.START);


        return true;
    }

}