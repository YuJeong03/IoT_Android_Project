package com.example.iot_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class fragment1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1_1);

        CheckBox ch1 = (CheckBox)findViewById(R.id.checkBox1);
        CheckBox ch2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox dog_ch1 = (CheckBox)findViewById(R.id.dogbox_1_2);
        CheckBox dog_ch2 = (CheckBox)findViewById(R.id.dogbox_1_2);
        CheckBox dog_ch3 = (CheckBox)findViewById(R.id.dogbox_3);
        CheckBox dog_ch4 = (CheckBox)findViewById(R.id.dogbox_4);
        CheckBox dog_ch5 = (CheckBox)findViewById(R.id.dogbox_5);
        CheckBox dog_ch6 = (CheckBox)findViewById(R.id.dogbox_6);
        CheckBox cat_ch1 = (CheckBox)findViewById(R.id.catbox_1);
        CheckBox cat_ch2 = (CheckBox)findViewById(R.id.catbox_2);

        LinearLayout dog = (LinearLayout)findViewById(R.id.dog);
        LinearLayout cat = (LinearLayout)findViewById(R.id.cat);

        if(ch1.setChecked(true)){
            cat.setVisibility(View.GONE);
        }
        else if(ch2.isChecked()==true){
            cat.setVisibility(View.VISIBLE);
            dog.setVisibility(View.GONE);
        }
    }
}
