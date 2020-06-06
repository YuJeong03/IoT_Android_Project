package com.example.iot_android_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class login extends AppCompatActivity {

    String myJSON;

    ArrayList<member> membersArrayList = new ArrayList<>();
     ArrayList<HashMap<String, String>> member1;

    private static final String TAG_RESULTS = "result";
    private static final String TAG_ID= "id";
    private static final String TAG_PW = "pw";

    JSONArray members = null;
    ArrayList<HashMap<String, String>> memberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        getData("http://203.234.62.84:8088/login.php");

        memberList = new ArrayList<HashMap<String, String>>();

        final EditText id = (EditText) findViewById(R.id.editText);
        final EditText pw = (EditText) findViewById(R.id.editText3);

        Button btn = (Button)findViewById(R.id.button3);
        Button btn1 = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), join.class);
                finish();
                startActivity(intent);

            }
        });






        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    ArrayList<String> id2 = new ArrayList<>();
                    ArrayList<String> pw2 = new ArrayList<>();

                for(int i = 0; i<membersArrayList.size(); i++){
                    id2.add(membersArrayList.get(i).getId());
                    pw2.add(membersArrayList.get(i).getPw());
                }

                if (pw.getText().toString().equals("")&&id.getText().toString().equals("")) {
                    Toast.makeText(getApplication(), "ID와 PassWord를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if (id.getText().toString().equals("")) {
                    Toast.makeText(getApplication(), "ID를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if (pw.getText().toString().equals("")) {
                    Toast.makeText(getApplication(), "PassWord를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if (id2.indexOf(id.getText().toString())!=pw2.indexOf(pw.getText().toString())) {
                    Toast.makeText(getApplication(), "로그인 실패!", Toast.LENGTH_SHORT).show();
                }
                else if (id2.contains(id.getText().toString())) {
                    if(pw2.contains(pw.getText().toString())) {
                        if (id2.indexOf(id.getText().toString())==pw2.indexOf(pw.getText().toString())) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            intent.putExtra("id", id.getText().toString());
                            finish();
                            startActivity(intent);
                        }
                    }
                }



                }

        });



    }

    protected void showList() {
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            members = jsonObj.getJSONArray(TAG_RESULTS);


            for (int i = 0; i < members.length(); i++) {
                member member2 = new member();
                JSONObject c = members.getJSONObject(i);
                String id = c.getString(TAG_ID);
                String pw = c.getString(TAG_PW);

                HashMap<String, String> member1 = new HashMap<String, String>();

                member2.setId(id);
                member2.setPw(pw);

                member1.put(TAG_ID, id);
                member1.put(TAG_PW, pw);

                membersArrayList.add(member2);

                memberList.add(member1);
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
