package edu.achougulsyr.playmate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Score_sheet extends AppCompatActivity {

    int score_a=0;
    int score_b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_sheet);
    }

    public void three_a(View v){
        score_a=score_a+3;
        display_a(score_a);
    }

    public void two_a(View v){
        score_a=score_a+2;
        display_a(score_a);
    }

    public void one_a(View v){
        score_a=score_a+1;
        display_a(score_a);
    }

    private void display_a(int score_a) {
        TextView score_t_a= (TextView)findViewById(R.id.score_num_a);
        score_t_a.setText(String.valueOf(score_a));
    }


    public void three_b(View v){
        score_b=score_b+3;
        display_b(score_b);
    }

    public void two_b(View v){
        score_b=score_b+2;
        display_b(score_b);
    }

    public void one_b(View v){
        score_b=score_b+1;
        display_b(score_b);
    }

    private void display_b(int score_b) {
        TextView score_t_b= (TextView)findViewById(R.id.score_num_b);
        score_t_b.setText(String.valueOf(score_b));
    }

    public void reset(View v){
        score_a=0;
        display_a(score_a);

        score_b=0;
        display_b(score_b);
    }

    public void finish(View v){
        Intent intent=new Intent(this,Finish.class);
        intent.putExtra("score_a_a",score_a);
        intent.putExtra("score_b_b",score_b);
        startActivity(intent);

        }

}
