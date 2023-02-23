package com.example.practical8;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageButton ibtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this,R.raw.music);
    }
    public void playAudio(View v)
    {
        ibtn = findViewById(R.id.imageButton5);
        ibtn.setVisibility(View.VISIBLE);
        mediaPlayer.start();
        Toast.makeText(this, "Music is playing, Connect Ear Phone to Listen the Ringtone",
                Toast.LENGTH_SHORT).show();
    }
    public void onPause(View v)
    {
        super.onPause();
        mediaPlayer.release();
        ibtn.setVisibility(View.INVISIBLE);
    }
}