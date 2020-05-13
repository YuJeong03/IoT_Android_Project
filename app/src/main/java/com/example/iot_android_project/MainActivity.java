package com.example.iot_android_project;
import android.app.TabActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("CARE").setIndicator("애완견 맡기기");
        tabSpecSong.setContent(R.id.care);
        tabHost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("SHARE").setIndicator("정보공유");
        tabSpecArtist.setContent(R.id.share);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("MANAGE").setIndicator("애완견 관리");
        tabSpecAlbum.setContent(R.id.manage);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);
    }
}