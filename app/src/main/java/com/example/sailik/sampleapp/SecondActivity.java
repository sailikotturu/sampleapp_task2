package com.example.sailik.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textview = (TextView) findViewById(R.id.textView2);
        Intent receiver = getIntent();
        Bundle bd = receiver.getExtras();
        if(bd!=null){
            String response = (String) bd.get("STR_I_NEED");
            if(response.equals("4.1")){
                String msg = "Yes it is!";
                textview.setText(msg);
            }
            else{
                String msg1 = "No, it's not!";
                textview.setText(msg1);
            }
        }
    }
}
