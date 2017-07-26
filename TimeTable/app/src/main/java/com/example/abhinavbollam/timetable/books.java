package com.example.abhinavbollam.timetable;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class books extends AppCompatActivity {
    final Context c=this;
    Button mode,ring,vibrate,silent;
    private AudioManager myAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        //initialize
        vibrate=(Button)findViewById(R.id.buttonvibrate);
        ring=(Button)findViewById(R.id.buttonring);
        mode=(Button)findViewById(R.id.buttonmode);
        silent=(Button)findViewById(R.id.buttonsilent);

        //audiomanager
        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

        vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                Toast.makeText(c,"Now in Vibrate Mode",
                        Toast.LENGTH_LONG).show();
            }
        });

        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                Toast.makeText(c,"Now in Ringing Mode",
                        Toast.LENGTH_LONG).show();
            }
        });

        silent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                Toast.makeText(c,"Now in silent Mode",
                        Toast.LENGTH_LONG).show();
            }
        });

        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mod=myAudioManager.getRingerMode();
                if(mod==AudioManager.RINGER_MODE_VIBRATE){
                    Toast.makeText(c,"Now in Vibrate Mode",
                            Toast.LENGTH_LONG).show();
                } else if(mod==AudioManager.RINGER_MODE_NORMAL){
                    Toast.makeText(c,"Now in Ringing Mode",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(c,"Now in Vibrate Mode",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

