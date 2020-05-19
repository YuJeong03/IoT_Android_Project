package com.example.iot_android_project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this, login.class));
        finish();
    }

}
