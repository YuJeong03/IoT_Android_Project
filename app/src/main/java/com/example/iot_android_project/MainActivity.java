package com.example.iot_android_project;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    NavigationView listview = null ;
    ImageButton menu;
    View v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager)findViewById(R.id.pager);
        final Button btn_first = (Button)findViewById(R.id.btn_first);
        Button btn_second = (Button)findViewById(R.id.btn_second);
        menu = (ImageButton)findViewById(R.id.menu1);

        v1 = (View) findViewById(R.id.view2);
        v2 = (View) findViewById(R.id.view4);

        pager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        pager.setCurrentItem(0);

        View.OnClickListener movePageListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                int tag = (int)view.getTag();
                pager.setCurrentItem(tag);

            }
        };

        btn_first.setOnClickListener(movePageListener);
        btn_first.setTag(0);
        btn_second.setOnClickListener(movePageListener);
        btn_second.setTag(1);

        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setBackgroundColor(Color.rgb(121, 134, 203));
                v2.setBackgroundColor(Color.parseColor("#00FFFFFF"));
            }
        });

        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2.setBackgroundColor(Color.rgb(121, 134, 203));
                v1.setBackgroundColor(Color.parseColor("#00FFFFFF"));
            }
        });



        final String[] items = {"WHITE", "RED", "GREEN", "BLUE", "BLACK"} ;
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items) ;

        listview = (NavigationView) findViewById(R.id.nav_view) ;
        listview.getMenu();


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
//        listview.setOnItemClickListener(new ListView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView parent, View v, int position, long id) {
//
//
//                switch (position) {
//                    case 0: // WHITE
//                        contentTextview.setBackgroundColor(Color.rgb(0xFF, 0xFF, 0xFF));
//                        contentTextview.setTextColor(Color.rgb(0x00, 0x00, 0x00));
//                        contentTextview.setText("WHITE");
//                        break;
//                    case 1: // RED
//                        contentTextview.setBackgroundColor(Color.rgb(0xFF, 0x00, 0x00));
//                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF));
//                        contentTextview.setText("RED");
//                        break;
//                    case 2: // GREEN
//                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0xFF, 0x00));
//                        contentTextview.setTextColor(Color.rgb(0x00, 0x00, 0x00));
//                        contentTextview.setText("GREEN");
//                        break;
//                    case 3: // BLUE
//                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0x00, 0xFF));
//                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF));
//                        contentTextview.setText("BLUE");
//                        break;
//                    case 4: // BLACK
//                        contentTextview.setBackgroundColor(Color.rgb(0x00, 0x00, 0x00));
//                        contentTextview.setTextColor(Color.rgb(0xFF, 0xFF, 0xFF));
//                        contentTextview.setText("BLACK");
//                        break;
//                }
//            }
//        });


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
