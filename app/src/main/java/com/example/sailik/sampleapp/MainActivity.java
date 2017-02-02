package com.example.sailik.sampleapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    private Button button_check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_check=(Button) findViewById(R.id.checkbutton);
        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                EditText editText = (EditText) findViewById(R.id.edit_Text);
                String response = editText.getText().toString();
                TextView textview = (TextView) findViewById(R.id.textView2);
                textview.setText(response);
                intent.putExtra("STR_I_NEED", response);
                startActivity(intent);
            }
        });
    }



}
