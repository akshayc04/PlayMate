package edu.achougulsyr.playmate;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Basket_option extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_option);

        Button bas2=(Button) findViewById (R.id.score_btn_b);
        bas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Score_sheet.class);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.textclick);
                mediaPlayer.start();
                startActivity(intent);
            }
        });

    }
}
