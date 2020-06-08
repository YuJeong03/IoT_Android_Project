package com.example.iot_android_project;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class nav_view extends AppCompatActivity {
    TextView id;
    TextView address;
    String id1;
    String address1;
    nav_view(String id, String address){
        id1 = id;
        address1 = address;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navi_header);

        id = (TextView)findViewById(R.id.id1111);
        address = (TextView)findViewById(R.id.address);

        id.setText("ll");
        address.setText(address1);

    }
}
