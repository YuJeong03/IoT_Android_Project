package com.example.iot_android_project;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Dialog_java extends Dialog {
    TextView address, type, count, size, date, time;
    static Button btn, btn1;
    LinearLayout size_1;
    public Dialog_java( final Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);   //다이얼로그의 타이틀바를 없애주는 옵션입니다.
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));  //다이얼로그의 배경을 투명으로 만듭니다.
        setContentView(R.layout.activity_dialog1);     //다이얼로그에서 사용할 레이아웃입니다.
        address = (TextView)findViewById(R.id.address_value);
        type = (TextView)findViewById(R.id.type_value);
        count = (TextView)findViewById(R.id.count_value);
        size_1 = (LinearLayout)findViewById(R.id.size_1);
        size = (TextView)findViewById(R.id.size_value);
        date = (TextView)findViewById(R.id.date_value);
        time = (TextView)findViewById(R.id.time_value);

        btn = (Button) findViewById(R.id.chatting);
        btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dismiss();   //다이얼로그를 닫는 메소드입니다.
            }
        });


    }

}
