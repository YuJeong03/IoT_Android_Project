package com.example.iot_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class fragment1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1_1);

        RadioGroup RG1 = (RadioGroup)findViewById(R.id.RG1);
        RadioGroup RG2 = (RadioGroup)findViewById(R.id.RG2);
        RadioGroup RG3 = (RadioGroup)findViewById(R.id.RG3);
        RadioButton RB1 = (RadioButton)findViewById(R.id.checkBox1);
        RadioButton RB2 = (RadioButton)findViewById(R.id.checkBox2);
        RadioButton dog_RB1_1 = (RadioButton)findViewById(R.id.dogbox_1_1);
        RadioButton dog_RB1_2 = (RadioButton)findViewById(R.id.dogbox_1_2);
        RadioButton dog_RB1_3 = (RadioButton)findViewById(R.id.dogbox_1_3);
        CheckBox dog_ch3 = (CheckBox)findViewById(R.id.dogbox_3);
        CheckBox dog_ch4 = (CheckBox)findViewById(R.id.dogbox_4);
        CheckBox dog_ch5 = (CheckBox)findViewById(R.id.dogbox_5);
        CheckBox dog_ch6 = (CheckBox)findViewById(R.id.dogbox_6);
        RadioButton dog_RB_4 = (RadioButton)findViewById(R.id.dogbox_7);
        RadioButton dog_RB_5 = (RadioButton)findViewById(R.id.dogbox_8);
        RadioButton cat_ch1 = (RadioButton)findViewById(R.id.catbox_1);
        RadioButton cat_ch2 = (RadioButton)findViewById(R.id.catbox_2);


        final LinearLayout dog = (LinearLayout)findViewById(R.id.dog);
        final LinearLayout cat = (LinearLayout)findViewById(R.id.cat);

       RB1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               dog.setVisibility(View.VISIBLE);
               cat.setVisibility(View.GONE);
           }
       });

        RB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cat.setVisibility(View.VISIBLE);
                dog.setVisibility(View.GONE);
            }
        });

    }
}
