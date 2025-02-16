package com.example.grid_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view) {
         int id = view.getId();
         String ourId = "";

         ourId = view.getResources().getResourceEntryName(id);
         int resourceId = getResources().getIdentifier(ourId,"raw","com.example.grid_layout");

        MediaPlayer mplayer = MediaPlayer.create(this,resourceId);
        mplayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
