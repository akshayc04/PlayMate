package edu.achougulsyr.playmate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        int a= getIntent().getIntExtra("score_a_a",0);
        int b= getIntent().getIntExtra("score_b_b",0);
        TextView winner = (TextView) findViewById(R.id.winner_team);

        if (a > b) {
            winner.setText("Team A");
        }
        else if(a<b){
            winner.setText("Team B");
        }
        else
        {
            winner.setText("Its a DRAW");
        }
    }
}
