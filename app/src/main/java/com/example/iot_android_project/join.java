package com.example.iot_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

public class join extends AppCompatActivity {

    String myJSON;

    EditText id_edit, pw_edit, name_edit, pw_edit_1, phone_edit;
    RadioButton man, woman;
    String gender_string;

    ImageButton imgbtn;

    Boolean a = false;
    private static final String TAG_RESULTS = "result";
    private static final String TAG_id = "id";
    JSONArray idArray = null;
    ArrayList<String> idList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);


        getData("http://203.234.62.84:8088/id_getdata.php");

        idList = new ArrayList<>();
        name_edit = (EditText) findViewById(R.id.editText);
        id_edit = (EditText) findViewById(R.id.editText2);
        pw_edit = (EditText) findViewById(R.id.editText3);
        pw_edit_1 = (EditText) findViewById(R.id.editText4);
        phone_edit = (EditText) findViewById(R.id.editText5);
        man = (RadioButton) findViewById(R.id.radioButton);
        woman = (RadioButton) findViewById(R.id.radioButton2);
        imgbtn = (ImageButton) findViewById(R.id.imageButton);

        Button sign_up = (Button) findViewById(R.id.button2);
        Button check = (Button) findViewById(R.id.button4);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name_edit.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "이름을 입력하세요.", Toast.LENGTH_LONG).show();
                }else if(id_edit.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "아이디를 입력하세요.", Toast.LENGTH_LONG).show();
                }else if(pw_edit.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "비밀번호를 입력하세요.", Toast.LENGTH_LONG).show();
                }else if(phone_edit.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "전화번호를 입력하세요.", Toast.LENGTH_LONG).show();
                }else if(a==false){
                    Toast.makeText(getApplicationContext(), "아이디 중복을 확인하세요.", Toast.LENGTH_LONG).show();
                }else if(pw_edit.getText().toString().equals(pw_edit_1.getText().toString())){
                    insert(v);
                }else{
                    Toast.makeText(getApplicationContext(), "비밀번호를 확인하세요.", Toast.LENGTH_LONG).show();
                }

            }
        });

        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender_string = "male";
            }
        });

        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender_string = "female";
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(id_edit.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "ID를 입력해주세요!", Toast.LENGTH_LONG).show();}
                else{
                for(int i = 0; i<idList.size(); i++) {
                    String ab = idList.get(i).toString();
                    if (ab.equals(id_edit.getText().toString())) {
                        a = false;
                        break;
                    } else {
                        a = true;
                    }
                }
                    if (a == false) {
                        Toast.makeText(getApplicationContext(), "중복!", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "사용 가능!", Toast.LENGTH_LONG).show();
                    }

                }
            }
        });

    }

    public void insert(View view) {
        String id = id_edit.getText().toString();
        String pw = pw_edit.getText().toString();
        String name = name_edit.getText().toString();
        String gender = gender_string;
        String phone = phone_edit.getText().toString();


        insertoToDatabase(id, pw, name,gender,phone);
    }

    private void insertoToDatabase(final String id, final String pw, final String name, final  String gender, final String phone) {
        class InsertData extends AsyncTask<String, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(join.this, "Please Wait", null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), login.class);
                finish();
                startActivity(intent);
//                Intent intent = new Intent(signup.this, map_plan2_2.class);
//
////                intent.putExtra("trip_area", trip_name);
////                intent.putExtra("date_y", date_y);
////                intent.putExtra("date_m", date_m);
////                intent.putExtra("date_d", date_d);
//
//                startActivity(intent);
            }

            @Override
            protected String doInBackground(String... params) {

                try {
                    String id = (String) params[0];
                    String pw = (String) params[1];
                    String name = (String) params[2];
                    String phone = (String) params[3];
                    String gender = (String) params[4];

                    String link = "http://203.234.62.84:8088/member_insert.php";
                    String data = URLEncoder.encode("id", "UTF-8") + "=" + URLEncoder.encode(id, "UTF-8");
                    data += "&" + URLEncoder.encode("pw", "UTF-8") + "=" + URLEncoder.encode(pw, "UTF-8");
                    data += "&" + URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8");
                    data += "&" + URLEncoder.encode("phone", "UTF-8") + "=" + URLEncoder.encode(phone, "UTF-8");
                    data += "&" + URLEncoder.encode("gender", "UTF-8") + "=" + URLEncoder.encode(gender, "UTF-8");

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
        task.execute(id, pw, name, phone, gender);
    }

    protected void showList() {
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            idArray = jsonObj.getJSONArray(TAG_RESULTS);


            for (int i = 0; i < idArray.length(); i++) {
                member id2 = new member();
                JSONObject c = idArray.getJSONObject(i);
                String id = c.getString(TAG_id);

                idList.add(id);

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void getData(String url) {
        class GetDataJSON extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {

                String uri = params[0];

                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json + "\n");
                    }

                    return sb.toString().trim();

                } catch (Exception e) {
                    return null;
                }


            }

            @Override
            protected void onPostExecute(String result) {
                myJSON = result;
                showList();
            }
        }
        GetDataJSON g = new GetDataJSON();
        g.execute(url);
    }

}
