package com.rikkei.trainning.activity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyFragment extends androidx.fragment.app.Fragment {
    private String myTag = "MyFragment";
    private MediaPlayer mediaPlayer;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e(myTag,"Start onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(myTag,"Start onCreate");
        mediaPlayer = MediaPlayer.create(getContext(),R.raw.music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        if(savedInstanceState != null){
            int position = savedInstanceState.getInt("position",0);
            mediaPlayer.seekTo(position);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(myTag,"Start onCreateView");
        return inflater.inflate(R.layout.my_fragment,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(myTag,"Start onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(myTag,"Start onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(myTag,"Start onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(myTag,"Start onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(myTag,"Start onSaveInstanceState");
        outState.putInt("position",mediaPlayer.getCurrentPosition());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(myTag,"Start onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(myTag,"Start onDestroy");
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(myTag,"Start onDetach");
    }
}
