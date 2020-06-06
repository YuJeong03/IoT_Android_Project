package com.example.iot_android_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    public Fragment2()
    {
        // required
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment2, container, false);

        Spinner spinner = (Spinner) layout.findViewById(R.id.spinner);

        final String[] s = { "전체보기", "Tip", "일상", "제보"};

        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(getContext(), R.layout.activity_spinner_item, s);

        spinner.setAdapter(adapter);

        return layout;
    }
}
