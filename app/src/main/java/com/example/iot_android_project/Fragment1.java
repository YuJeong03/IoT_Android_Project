package com.example.iot_android_project;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
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

public class Fragment1 extends Fragment {
    String myJSON;

    ArrayList<care> caresArrayList = new ArrayList<>();

    private static final String TAG_RESULTS = "result";
    private static final String TAG_ID = "id";
    private static final String TAG_TYPE = "type";
    private static final String TAG_COUNT = "count";

    private static final String TAG_SIZE = "size";
    private static final String TAG_DATE = "date";
    private static final String TAG_TIME = "time";
    private static final String TAG_ADDRESS = "address";
    private static final String TAG_PHONE = "phone";

    static ListView list;
    JSONArray cares = null;
    ArrayList<HashMap<String, String>> careList;

    static TextView location;
    static String id1;
    static String address1;
    static String phone1;
    static String type;
     static ListAdapter adapter ;
    public Fragment1(String id, String address, String phone)
    {
        id1 = id;
        address1 = address;
        phone1 = phone;
        // required
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment1,container, false);
        Button btn1 = (Button)layout.findViewById(R.id.btn_second);
        location = (TextView)layout.findViewById(R.id.location);

        getData("http://203.234.62.84:8088/care_getdata.php");

        careList = new ArrayList<HashMap<String, String>>();
        list = (ListView)layout.findViewById(R.id.list);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), fragment1_1.class);
                intent.putExtra("id", id1);
                intent.putExtra("address", address1);
                intent.putExtra("phone", phone1);
                startActivity(intent);

            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                Dialog_java dlg = new Dialog_java(container.getContext());
                dlg.address.setText(caresArrayList.get(position).getAddress());

                if (caresArrayList.get(position).getType().equals("강아지")) {
                    dlg.type.setText(caresArrayList.get(position).getType());
                    dlg.size_1.setVisibility(View.VISIBLE);
                    dlg.size.setText(caresArrayList.get(position).getSize());
                    dlg.count.setText(caresArrayList.get(position).getCount());
                    dlg.date.setText(caresArrayList.get(position).getDate());
                    dlg.time.setText(caresArrayList.get(position).getTime());
                }
                if(caresArrayList.get(position).getType().equals("고양이")){
                    dlg.type.setText(caresArrayList.get(position).getType());
                    dlg.size_1.setVisibility(View.GONE);
                    dlg.count.setText(caresArrayList.get(position).getCount());
                    dlg.date.setText(" " + caresArrayList.get(position).getDate());
                    dlg.time.setText(" " + caresArrayList.get(position).getTime());
                }

                dlg.show();

                Button btn = (Button)dlg.findViewById(R.id.chatting);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("smsto:" + Uri.encode(caresArrayList.get(position).getPhone())));
                        startActivity(intent);
                    }
                });

            }
        });
//
//        location.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Dialog_a dlg;
//                dlg = new Dialog_a(container.getContext());
//                dlg.show();
//            }
//        });
        return layout;



    }


    protected void showList() {
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            cares = jsonObj.getJSONArray(TAG_RESULTS);


            for (int i = 0; i < cares.length(); i++) {
                care care = new care();
                JSONObject c = cares.getJSONObject(i);
                type = c.getString(TAG_TYPE);
                String count = c.getString(TAG_COUNT);
                String size = c.getString(TAG_SIZE);
                String date = c.getString(TAG_DATE);
                String time = c.getString(TAG_TIME);
                String address = c.getString(TAG_ADDRESS);
                String id = c.getString(TAG_ID);
                String phone = c.getString(TAG_PHONE);

                HashMap<String, String> care1 = new HashMap<String, String>();

                care.setType(type);
                care.setCount(count);
                care.setSize(size);
                care.setDate(date);
                care.setTime(time);
                care.setAddress(address);
                care.setId(id);
                care.setPhone(phone);

                care1.put(TAG_TYPE, type);
                care1.put(TAG_COUNT, count);
                care1.put(TAG_SIZE, size);
                care1.put(TAG_DATE, date);
                care1.put(TAG_TIME, time);
                care1.put(TAG_ADDRESS, address);
                care1.put(TAG_ID, id);
                care1.put(TAG_PHONE, phone);

                caresArrayList.add(care);

                careList.add(care1);
            }
                adapter = new SimpleAdapter(
                        getContext(), careList, R.layout.activity_sub,
                        new String[]{TAG_TYPE, TAG_COUNT, TAG_DATE, TAG_ADDRESS},
                        new int[]{R.id.type, R.id.count, R.id.date, R.id.address});

            list.setAdapter(adapter);

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
