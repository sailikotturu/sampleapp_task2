package com.example.sailik.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        if(message.equals("4.1")){
            String msg = "Yes it is!";
            textView.setText(msg);
        }
        else{
            String msg1 = "No, it's not!";
            textView.setText(msg1);
        }

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_next);
        layout.addView(textView);
    }
}
