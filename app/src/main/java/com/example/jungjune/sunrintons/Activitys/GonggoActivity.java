package com.example.jungjune.sunrintons.Activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.jungjune.sunrintons.R;

import java.util.ArrayList;

public class GonggoActivity extends AppCompatActivity {

    ImageButton back;

    LinearLayout v1, v2;

    GridView gridView;
    ArrayList<GongooSchema> gongooSchemas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gonggo);

        v1 = (LinearLayout) findViewById(R.id.visible1);
        v2 = (LinearLayout) findViewById(R.id.visible2);

        if (GonggoRegisterActivity.isChecked)
            v1.setVisibility(View.GONE);
        else
            v2.setVisibility(View.GONE);

        back = (ImageButton) findViewById(R.id.gongoo_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        /*RequestParams params = new RequestParams();
        ApiClient.post("/notices/lastest", params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                switch (statusCode) {
                    case 200:
                        try {
                            JSONArray jsonArray = new JSONArray(new String(responseBody));
                            System.out.println(jsonArray.length() + "");
                            for (int i = 0; i < jsonArray.length(); ++i) {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);// jsonObject.getString("title")
                                gongooSchemas.add(new GongooSchema(jsonObject.getString("name")));
                            }
                            Log.e("adsfasdf", gongooSchemas.get(0).getName());

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 304:
                    case 403:

                        break;

                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });


        gridView = (GridView) findViewById(R.id.gridview_gonggo);

        GonggoAdapter.items = gongooSchemas;
        gridView.setAdapter(new GonggoAdapter(this));*/
    }
}
