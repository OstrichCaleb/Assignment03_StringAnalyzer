package com.example.ostri.classfour;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class LandingActivity extends AppCompatActivity {
    EditText msgInput;

    int delayAmount = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        locateViews();

        bindData();
    }

    private void locateViews() {
        msgInput = (EditText) findViewById(R.id.msgInput);
    }

    private void bindData() {
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(),
                        "Hello from runnable!", Toast.LENGTH_SHORT).show();
            }
        };

        handler.postDelayed(runnable, delayAmount);
    }
}
