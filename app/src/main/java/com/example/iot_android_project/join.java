package com.example.iot_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class join extends AppCompatActivity {

    EditText id_edit, pw_edit, name_edit, pw_edit_1, phone_edit;
    RadioButton man, woman;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        name_edit = (EditText) findViewById(R.id.editText);
        id_edit = (EditText) findViewById(R.id.editText2);
        pw_edit = (EditText) findViewById(R.id.editText3);
        pw_edit_1 = (EditText) findViewById(R.id.editText4);
        phone_edit = (EditText) findViewById(R.id.editText5);
        man = (RadioButton) findViewById(R.id.radioButton);
        woman = (RadioButton) findViewById(R.id.radioButton2);

        Button sign_up = (Button) findViewById(R.id.button2);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(v);
            }
        });

        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender = "0";
            }
        });

        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender = "1";
            }
        });
    }

    public void insert(View view) {
        String id = id_edit.getText().toString();
        String pw = pw_edit.getText().toString();
        String name = name_edit.getText().toString();
        String phone = phone_edit.getText().toString();
        String gender_value = gender;

        insertoToDatabase(id, pw, name, phone, gender_value);
    }

    private void insertoToDatabase(final String id, final String pw, final String name, final String phone, final String gender_value) {
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

                finish();
            }

            @Override
            protected String doInBackground(String... params) {

                try {
                    String id = (String) params[0];
                    String pw = (String) params[1];
                    String name = (String) params[2];
                    String phone = (String) params[3];
                    String gender_value = (String) params[4];


                    String link = "http://203.234.62.84:8088/member_insert.php";
                    String data = URLEncoder.encode("id", "UTF-8") + "=" + URLEncoder.encode(id, "UTF-8");
                    data += "&" + URLEncoder.encode("pw", "UTF-8") + "=" + URLEncoder.encode(pw, "UTF-8");
                    data += "&" + URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8");
                    data += "&" + URLEncoder.encode("phone", "UTF-8") + "=" + URLEncoder.encode(phone, "UTF-8");
                    data += "&" + URLEncoder.encode("gender", "UTF-8") + "=" + URLEncoder.encode(gender_value, "UTF-8");


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
        task.execute(id, pw, name, phone, gender_value);


    }
}
