package com.example.iot_android_project;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager pager;
    NavigationView listview ;
    ImageButton menu;
    View v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager)findViewById(R.id.pager);
        final Button btn_first = (Button)findViewById(R.id.btn_first);
        final Button btn_second = (Button)findViewById(R.id.btn_second);
        menu = (ImageButton)findViewById(R.id.menu1);

        v1 = (View) findViewById(R.id.view2);
        v2 = (View) findViewById(R.id.view4);

        pager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        pager.setCurrentItem(0);

        final View.OnClickListener movePageListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                int tag = (int)view.getTag();
                if(tag==0){
                    v1.setBackgroundColor(Color.rgb(121, 134, 203));
                    v2.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                }
                else if(tag==1){
                    v2.setBackgroundColor(Color.rgb(121, 134, 203));
                    v1.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                }
                pager.setCurrentItem(tag);

            }
        };

        btn_first.setOnClickListener(movePageListener);
        btn_first.setTag(0);
        btn_second.setOnClickListener(movePageListener);
        btn_second.setTag(1);

        listview = (NavigationView) findViewById(R.id.nav_view) ;

        final DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawer);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
                listview.getMenu();
            }
        });

        listview.setNavigationItemSelectedListener(this);


    }

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.profile) {

        } else if (id == R.id.chatting) {

        } else if (id == R.id.logout) {
            Intent intent = new Intent(getApplicationContext(), login.class);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private class pagerAdapter extends FragmentPagerAdapter
    {
        public pagerAdapter(FragmentManager fm )
        {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position)
            {
                case 0:
                    return new Fragment1();
                case 1:
                    return new Fragment2();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // total page count
            return 2;
        }
    }
}
