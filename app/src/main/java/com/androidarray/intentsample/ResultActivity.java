package com.androidarray.intentsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textView = (TextView) findViewById(R.id.result);

        Intent intent = getIntent();
        boolean success = intent.getBooleanExtra("SUCCESS", false);

        if (success) {
            textView.setText(R.string.success);
        }
    }
}
