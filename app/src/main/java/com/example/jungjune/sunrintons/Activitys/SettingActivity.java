package com.example.jungjune.sunrintons.Activitys;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.jungjune.sunrintons.R;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {
    protected ImageButton mHomeBtn;
    protected ImageButton mAdd;
    protected ImageButton mSetting;
    
    protected String[] alertItems = {"구직공고하기", "구직지원하기"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mHomeBtn = (ImageButton) findViewById(R.id.home_setting);
        mAdd = (ImageButton) findViewById(R.id.add_setting);

        mHomeBtn.setOnClickListener(this);
        mAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_setting:
                finish();
                break;

            case R.id.add_setting:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setItems(alertItems, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (which == 0) {
                            Intent intent = new Intent(getApplicationContext(), GonggoRegisterActivity.class);
                            startActivity(intent);
                        } else {
                            Intent intent = new Intent(getApplicationContext(), ZiownRegisterActivity.class);
                            startActivity(intent);
                        }
                    }
                }).create().show();
                break;
        }
    }
}
