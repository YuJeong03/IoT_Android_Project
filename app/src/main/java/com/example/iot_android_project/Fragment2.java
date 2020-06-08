package com.example.iot_android_project;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Fragment2 extends Fragment {

    static String id1;
    String myJSON;

    ArrayList<write1> wrtiesArrayList = new ArrayList<>();

    private static final String TAG_RESULTS = "result";
    private static final String TAG_TYPE = "type";
    private static final String TAG_TITLE = "title";
    private static final String TAG_TEXT = "text";
    private static final String TAG_TAG = "tag";

    final String[] s1 = { "전체보기", "Tip", "제보"};

    static ListView list1;
    static ListAdapter adapter ;
    JSONArray writes = null;
    ArrayList<HashMap<String, String>> writeList;

    static Spinner spinner;

    public Fragment2(String id)
    {
        id1 = id;// required
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment2, container, false);
        getData("http://203.234.62.84:8088/write_getdata.php");

        writeList = new ArrayList<HashMap<String, String>>();
        list1 = (ListView)layout.findViewById(R.id.list1);

        spinner = (Spinner) layout.findViewById(R.id.spinner);
        final ImageButton write1 = (ImageButton) layout.findViewById(R.id.imageButton2);

            ArrayAdapter<String> adapter;
            adapter = new ArrayAdapter<String>(getContext(), R.layout.activity_spinner_item_1, s1);
            spinner.setAdapter(adapter);
            write1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), write.class);
                    intent.putExtra("id", id1);
                    startActivity(intent);
                }
            });



        return layout;
    }

    protected void showList() {
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            writes = jsonObj.getJSONArray(TAG_RESULTS);


            for (int i = 0; i < writes.length(); i++) {
                write1 write = new write1();
                JSONObject c = writes.getJSONObject(i);
                String type = c.getString(TAG_TYPE);
                String title = c.getString(TAG_TITLE);
                String text = c.getString(TAG_TEXT);
                String tag = c.getString(TAG_TAG);

                HashMap<String, String> write1 = new HashMap<String, String>();

                write.setType(type);
                write.setTitle(title);
                write.setText(text);
                write.setTag(tag);

                write1.put(TAG_TYPE, type);
                write1.put(TAG_TITLE, title);
                write1.put(TAG_TEXT, text);
                write1.put(TAG_TAG, tag);

                wrtiesArrayList.add(write);

                writeList.add(write1);
            }

                adapter = new SimpleAdapter(
                        getContext(), writeList, R.layout.activity_sub1,
                        new String[]{TAG_TYPE, TAG_TITLE, TAG_TEXT, TAG_TAG},
                        new int[]{R.id.type, R.id.title, R.id.text, R.id.tag});

                list1.setAdapter(adapter);




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
