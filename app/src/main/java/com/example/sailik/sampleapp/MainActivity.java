package com.example.sailik.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.sailik.sampleapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, NextActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_Text);
        String response = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, response);
        startActivity(intent);

    }
}
