package edu.achougulsyr.playmate;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Soccer_option extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer_option);

        Button soc2=(Button) findViewById (R.id.score_btn_s);
        soc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),soccer_score_sheet.class);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.textclick);
                mediaPlayer.start();
                startActivity(intent);
            }
        });

    }

    public void socloctn(View view){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

}
