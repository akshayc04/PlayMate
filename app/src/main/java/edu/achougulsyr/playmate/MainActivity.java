package edu.achougulsyr.playmate;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lets = (Button) findViewById(R.id.letsplay);
        lets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),view_pager_main.class);
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.textclick);
                mediaPlayer.start();
                startActivity(intent);
            }
        });

    }


}
