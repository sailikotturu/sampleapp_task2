package com.example.sailik.sampleapp;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View view) {
        Fragment Frag;
        if (view == findViewById(R.id.option1)) {
            Frag = new CorrectFrag();
        }else {
            Frag = new WrongFrag();
        }
        FragmentManager fm= getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, Frag);
        fragmentTransaction.commit();


    }
}
