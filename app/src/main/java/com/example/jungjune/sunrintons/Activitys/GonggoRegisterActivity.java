package com.example.jungjune.sunrintons.Activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.jungjune.sunrintons.R;

/**
 * Created by jungjune on 2016-07-23.
 */
public class GonggoRegisterActivity extends AppCompatActivity {
    protected ImageButton mBackBtn;
    protected ImageButton mCheckBtn;
    protected EditText mNameEdit;
    protected EditText mLocationEdit;
    protected EditText mBillEdit;
    protected EditText mInfoEdit;

    public static boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gonggo_register);

        mBackBtn= (ImageButton)findViewById(R.id.gonggo_register_back);
        mCheckBtn=(ImageButton)findViewById(R.id.gonggo_register_check);

        mNameEdit=(EditText)findViewById(R.id.name_gonggo_register);
        mLocationEdit=(EditText)findViewById(R.id.location_gonggo_register);
        mBillEdit=(EditText)findViewById(R.id.money_gonggo_register);
        mInfoEdit=(EditText)findViewById(R.id.info_gonggo_register);

        mCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*RequestParams params = new RequestParams();
                params.put("id", UserInfo.id);
                params.put("title","");
                params.put("image","");
                params.put("name", mNameEdit.getText().toString());
                params.put("location", mLocationEdit.getText().toString());
                params.put("money", mBillEdit.getText().toString());
                params.put("info", mInfoEdit.getText().toString());
                params.put("complete", false);

                ApiClient.post("/notices/posting", params, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        switch (statusCode) {
                            case 200:
                                Toast.makeText(getApplicationContext(), "등록 성공", Toast.LENGTH_LONG).show();
                                finish();
                                break;
                            case 304:
                            case 403:
                                Toast.makeText(getApplicationContext(), "글 등록 실패", Toast.LENGTH_LONG).show();
                                break;

                        }
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                        Toast.makeText(getApplicationContext(), "글 등록 실패", Toast.LENGTH_LONG).show();
                    }
                });*/
                isChecked = true;
                finish();
            }
        });

        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
