package com.example.iot_android_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    NavigationView listview = null ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager)findViewById(R.id.pager);
        final Button btn_first = (Button)findViewById(R.id.btn_first);
        Button btn_second = (Button)findViewById(R.id.btn_second);
        Button btn_third = (Button)findViewById(R.id.btn_third);

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
        btn_third.setOnClickListener(movePageListener);
        btn_third.setTag(2);

        final String[] items = {"WHITE", "RED", "GREEN", "BLUE", "BLACK"} ;
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items) ;

        listview = (NavigationView) findViewById(R.id.nav_view) ;
        listview.getMenu();

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
                case 2:
                    return new Fragment3();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // total page count
            return 3;
        }
    }
}
