package com.example.iot_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class sub1 extends AppCompatActivity {

    static EditText editText;
    static ListView list;
    static ArrayList<String> list11;
    static ArrayAdapter<String> adapter;
    static Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
        btn = (Button)findViewById(R.id.submit);
        editText = (EditText)findViewById(R.id.edit);
        list = (ListView)findViewById(R.id.list2);

        list11 = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list11);
        list.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list11.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

    }
}
