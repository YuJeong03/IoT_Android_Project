package com.example.iot_android_project;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class write extends AppCompatActivity {

    static String id, spinner1;
    static String img_path1="";
    static String tag1="";
    EditText title1, text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        ActionBar actionBar = getSupportActionBar();  //제목줄 객체 얻어오기
        actionBar.setDisplayHomeAsUpEnabled(true);   //업버튼 <- 만들기

        final String[] s = { "게시판 선택", "Tip", "일상", "제보"};
        Button btn = (Button)findViewById(R.id.button6);
        title1 = (EditText) findViewById(R.id.title);
        text1 = (EditText) findViewById(R.id.text);


        final Spinner spinner = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_spinner_item, s);
        spinner.setAdapter(adapter);

        Intent intent = getIntent();
        id = intent.getStringExtra("id");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinner.getSelectedItem().toString().equals("게시판 선택")){
                    Toast.makeText(getApplicationContext(), "게시판을 선택해주세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    spinner1 = spinner.getSelectedItem().toString();
                    insert(v);
                }

            }
        });



    }

    public void insert(View view) {
        String id1 = id;
        String type = spinner1;
        String title = title1.getText().toString();
        String text = text1.getText().toString();
        String img_path = img_path1;
        String tag = tag1;

        insertoToDatabase(id1, type, title,text,img_path, tag);
    }

    private void insertoToDatabase(final String id, final String type, final String title, final  String text, final String img_path, final String tag) {
        class InsertData extends AsyncTask<String, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(write.this, "Please Wait", null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(), "등록되었습니다.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(intent);

            }

            @Override
            protected String doInBackground(String... params) {

                try {
                    String id = (String) params[0];
                    String type = (String) params[1];
                    String title = (String) params[2];
                    String text = (String) params[3];
                    String img_path = (String) params[4];
                    String tag = (String) params[5];

                    String link = "http://203.234.62.84:8088/write_insert.php";
                    String data = URLEncoder.encode("id", "UTF-8") + "=" + URLEncoder.encode(id, "UTF-8");
                    data += "&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode(type, "UTF-8");
                    data += "&" + URLEncoder.encode("title", "UTF-8") + "=" + URLEncoder.encode(title, "UTF-8");
                    data += "&" + URLEncoder.encode("text", "UTF-8") + "=" + URLEncoder.encode(text, "UTF-8");
                    data += "&" + URLEncoder.encode("img_path", "UTF-8") + "=" + URLEncoder.encode(img_path, "UTF-8");
                    data += "&" + URLEncoder.encode("tag", "UTF-8") + "=" + URLEncoder.encode(tag, "UTF-8");

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
        task.execute(id, type, title, text, img_path, tag);
    }
}
