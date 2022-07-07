package com.rikkei.trainning.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String myTag = "Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.frame,new MyFragment(),"myfragment");
            transaction.commit();
        }
        Log.d(myTag,"Start onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(myTag,"Start onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(myTag,"Start onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(myTag,"Start onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myTag,"Start onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(myTag,"Start onDestroy");
    }
}