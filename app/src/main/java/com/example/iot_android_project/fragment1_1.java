package com.example.iot_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class fragment1_1 extends AppCompatActivity {


    Button btn;
    RadioGroup RG1, RG2, RG3;
    RadioButton RB1, RB2, dog_RB1_1, dog_RB1_2, dog_RB1_3, dog_RB_4, dog_RB_5, cat_ch1, cat_ch2;
    CheckBox dog_ch3, dog_ch4, dog_ch5, dog_ch6;
    TextView date1, date2, date3, date4;
    TextView time1, time2, time3, time4;
    LinearLayout dog, cat, dog_date, cat_date;
    final Calendar cal = Calendar.getInstance();
    String d = "";
    String Dog = "강아지", Cat, Count = "1마리", Size = " ", Service, Date=" ", Time, b = "0";
    int a = 0;
    String id1, address1;

    DatePickerDialog.OnDateSetListener myDatePicker = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month);
            cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            d = updateLabel();
            if (a == 1) {
                date1.setText(d);
                Date += d + " ~ ";
            } else if (a == 2) {
                date2.setText(d);
                Date += d;
            } else if (a == 3) {
                date3.setText(d);
                Date += d+ " ~ ";
            } else if (a == 4) {
                date4.setText(d);
                Date += d;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1_1);

        Intent intent = getIntent();
        id1 = intent.getStringExtra("id");
        address1 = intent.getStringExtra("address");

        RG1 = (RadioGroup) findViewById(R.id.RG1);
        RG2 = (RadioGroup) findViewById(R.id.RG2);
        RG3 = (RadioGroup) findViewById(R.id.RG3);
        RB1 = (RadioButton) findViewById(R.id.checkBox1);
        RB2 = (RadioButton) findViewById(R.id.checkBox2);
        dog_RB1_1 = (RadioButton) findViewById(R.id.dogbox_1_1);
        dog_RB1_2 = (RadioButton) findViewById(R.id.dogbox_1_2);
        dog_RB1_3 = (RadioButton) findViewById(R.id.dogbox_1_3);
        dog_ch3 = (CheckBox) findViewById(R.id.dogbox_3);
        dog_ch4 = (CheckBox) findViewById(R.id.dogbox_4);
        dog_ch5 = (CheckBox) findViewById(R.id.dogbox_5);
        dog_ch6 = (CheckBox) findViewById(R.id.dogbox_6);
        dog_RB_4 = (RadioButton) findViewById(R.id.dogbox_7);
        dog_RB_5 = (RadioButton) findViewById(R.id.dogbox_8);
        cat_ch1 = (RadioButton) findViewById(R.id.catbox_1);
        cat_ch2 = (RadioButton) findViewById(R.id.catbox_2);
        date1 = (TextView) findViewById(R.id.textView6);
        date2 = (TextView) findViewById(R.id.textView7);
        date3 = (TextView) findViewById(R.id.textView8);
        date4 = (TextView) findViewById(R.id.textView9);
        time1 = (TextView) findViewById(R.id.textView10);
        time2 = (TextView) findViewById(R.id.textView11);
        time3 = (TextView) findViewById(R.id.textView12);
        time4 = (TextView) findViewById(R.id.textView13);
        dog = (LinearLayout) findViewById(R.id.dog);
        cat = (LinearLayout) findViewById(R.id.cat);
        dog_date = (LinearLayout) findViewById(R.id.dog_date);
        cat_date = (LinearLayout) findViewById(R.id.cat_date);
        btn = (Button) findViewById(R.id.button5);

        RB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog.setVisibility(View.VISIBLE);
                cat.setVisibility(View.GONE);
                Dog = "강아지";
                Cat = " ";

            }
        });

        dog_RB1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count = "1마리";
            }
        });
        dog_RB1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count = "2마리";
            }
        });
        dog_RB1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count = "3마리 이상";
            }
        });

        dog_ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                b += "1 ";
            }
        });
        dog_ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                b += "2 ";
            }
        });
        dog_ch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                b += "3 ";
            }
        });
        dog_ch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                b = "4 ";
            }
        });

        RB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cat.setVisibility(View.VISIBLE);
                dog.setVisibility(View.GONE);
                Dog = " ";
                Cat = "고양이";
                Count = " ";
                Size = " ";
            }
        });

        date1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(fragment1_1.this, myDatePicker, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show();
                a = 1;

            }
        });

        date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(fragment1_1.this, myDatePicker, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show();
                a = 2;
            }
        });

        date3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(fragment1_1.this, myDatePicker, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show();
                a = 3;
            }
        });

        date4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(fragment1_1.this, myDatePicker, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show();
                a = 4;
            }
        });

        time1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(fragment1_1.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        String state = "AM";
                        // 선택한 시간이 12를 넘을경우 "PM"으로 변경 및 -12시간하여 출력 (ex : PM 6시 30분)
                        if (selectedHour > 12) {
                            selectedHour -= 12;
                            state = "PM";
                        }
                        // EditText에 출력할 형식 지정
                        time1.setText(state + " " + selectedHour + "시 " + selectedMinute + "분");
                    }
                }, hour, minute, false); // true의 경우 24시간 형식의 TimePicker 출현
                mTimePicker.setTitle("Select Time");
                mTimePicker.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                mTimePicker.show();
            }
        });

        time2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(fragment1_1.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        String state = "AM";
                        // 선택한 시간이 12를 넘을경우 "PM"으로 변경 및 -12시간하여 출력 (ex : PM 6시 30분)
                        if (selectedHour > 12) {
                            selectedHour -= 12;
                            state = "PM";
                        }
                        // EditText에 출력할 형식 지정
                        time2.setText(state + " " + selectedHour + "시 " + selectedMinute + "분");
                    }
                }, hour, minute, false); // true의 경우 24시간 형식의 TimePicker 출현
                mTimePicker.setTitle("Select Time");
                mTimePicker.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                mTimePicker.show();
            }
        });

        time3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(fragment1_1.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        String state = "AM";
                        // 선택한 시간이 12를 넘을경우 "PM"으로 변경 및 -12시간하여 출력 (ex : PM 6시 30분)
                        if (selectedHour > 12) {
                            selectedHour -= 12;
                            state = "PM";
                        }
                        // EditText에 출력할 형식 지정
                        time3.setText(state + " " + selectedHour + "시 " + selectedMinute + "분");
                    }
                }, hour, minute, false); // true의 경우 24시간 형식의 TimePicker 출현
                mTimePicker.setTitle("Select Time");
                mTimePicker.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                mTimePicker.show();
            }
        });

        time4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(fragment1_1.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        String state = "AM";
                        // 선택한 시간이 12를 넘을경우 "PM"으로 변경 및 -12시간하여 출력 (ex : PM 6시 30분)
                        if (selectedHour > 12) {
                            selectedHour -= 12;
                            state = "PM";
                        }
                        // EditText에 출력할 형식 지정
                        time4.setText(state + " " + selectedHour + "시 " + selectedMinute + "분");
                    }
                }, hour, minute, false); // true의 경우 24시간 형식의 TimePicker 출현
                mTimePicker.setTitle("Select Time");
                mTimePicker.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                mTimePicker.show();
            }
        });

        dog_RB_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date1.setVisibility(View.GONE);
                date2.setVisibility(View.GONE);
                dog_date.setVisibility(View.VISIBLE);
                Service = "단기간";
                Date = " ";
            }
        });

        dog_RB_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date1.setVisibility(View.VISIBLE);
                date2.setVisibility(View.VISIBLE);
                dog_date.setVisibility(View.VISIBLE);
                Service = "장기간";
            }
        });

        cat_ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date3.setVisibility(View.GONE);
                date4.setVisibility(View.GONE);
                Service = "단기간";
                Date = " ";
                cat_date.setVisibility(View.VISIBLE);
            }
        });
        cat_ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date3.setVisibility(View.VISIBLE);
                date4.setVisibility(View.VISIBLE);
                Service = "장기간";
                cat_date.setVisibility(View.VISIBLE);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b.contains("0")) {
                    Size += " ";
                }
                if (b.contains("1")) {
                    Size += "미니(1.5kg ~ 4kg) ";
                }
                if (b.contains("2")) {
                    Size += "일반(5kg ~ 8kg) ";
                }
                if (b.contains("3")) {
                    Size += "중형(9kg ~ 20kg) ";
                }
                if (b.contains("4")) {
                    Size += "대형(20kg ~ 40kg) ";
                }

                if (Dog.equals("강아지")) {
                    Time = time1.getText() + " ~ " + time2.getText();
                    insert(v, Dog);
                } else if (Cat.equals("고양이") && Dog.equals(" ")) {
                    Time = time3.getText() + " ~ " + time4.getText();
                    insert(v, Cat);
                }
            }
        });
    }

    private String updateLabel() {
        String myFormat = "yyyy. MM. dd";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat);
        return sdf.format(cal.getTime());
    }

    public void insert(View view, String a) {
        String id = id1;
        String type = a;
        String count = Count;
        String size = Size;
        String service = Service;
        String date = Date;
        String time = Time;
        String address = address1;

        insertoToDatabase(id, type, count, size, service, date, time, address);
    }

    private void insertoToDatabase(final String id, final String type, final String count, final String size, final String service, final String date, final String time, final String address) {
        class InsertData extends AsyncTask<String, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(fragment1_1.this, "Please Wait", null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_LONG).show();

//                Intent intent = new Intent(signup.this, map_plan2_2.class);
//
////                intent.putExtra("trip_area", trip_name);
////                intent.putExtra("date_y", date_y);
////                intent.putExtra("date_m", date_m);
////                intent.putExtra("date_d", date_d);
//
//                startActivity(intent);
                finish();
            }

            @Override
            protected String doInBackground(String... params) {

                try {
                    String id = (String) params[0];
                    String type = (String) params[1];
                    String count = (String) params[2];
                    String size = (String) params[3];
                    String service = (String) params[4];
                    String date = (String) params[5];
                    String time = (String) params[6];
                    String address = (String) params[7];


                    String link = "http://203.234.62.84:8088/care_insert.php";
                    String data = URLEncoder.encode("id", "UTF-8") + "=" + URLEncoder.encode(id, "UTF-8");
                    data += "&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode(type, "UTF-8");
                    data += "&" + URLEncoder.encode("count", "UTF-8") + "=" + URLEncoder.encode(count, "UTF-8");
                    data += "&" + URLEncoder.encode("size", "UTF-8") + "=" + URLEncoder.encode(size, "UTF-8");
                    data += "&" + URLEncoder.encode("service", "UTF-8") + "=" + URLEncoder.encode(service, "UTF-8");
                    data += "&" + URLEncoder.encode("date", "UTF-8") + "=" + URLEncoder.encode(date, "UTF-8");
                    data += "&" + URLEncoder.encode("time", "UTF-8") + "=" + URLEncoder.encode(time, "UTF-8");
                    data += "&" + URLEncoder.encode("address", "UTF-8") + "=" + URLEncoder.encode(address, "UTF-8");

                    URL url = new URL(link);
                    URLConnection conn = url.openConnection();

                    conn.setDoOutput(true);
                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());

                    wr.write(data);
                    wr.flush();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                    StringBuilder sb = new StringBuilder();
                    String line = null;

                    // Read Server Response
                    while ((line = reader.readLine()) != null) {
                        sb.append(line);
                        break;
                    }
                    return sb.toString();
                } catch (Exception e) {
                    return new String("Exception: " + e.getMessage());
                }
            }
        }
        InsertData task = new InsertData();
        task.execute(id, type, count, size, service, date, time, address);
    }
}