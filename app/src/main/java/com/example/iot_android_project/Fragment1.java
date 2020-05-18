package com.example.iot_android_project;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    private Object Button;
    static TextView location;

    public Fragment1()
    {
        // required
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment1,container, false);
        Button btn1 = (Button)layout.findViewById(R.id.btn_second);
        location = (TextView)layout.findViewById(R.id.location);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), fragment1_1.class);
                startActivity(intent);
            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog_a dlg;
                dlg = new Dialog_a(container.getContext());
                dlg.show();

            }

        });

        return layout;
    }
}
