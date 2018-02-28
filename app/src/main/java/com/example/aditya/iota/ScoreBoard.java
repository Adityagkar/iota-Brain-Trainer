//Score Board Activity

package com.example.aditya.iota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        TextView txt=(TextView) findViewById(R.id.finalScore);
        TextView player_name=(TextView) findViewById(R.id.player);

        Intent intent = getIntent();
        String score_new = intent.getStringExtra("score"); //contains the score of present game
        String player_new = intent.getStringExtra("player"); //contains the name of player

        txt.setText(score_new);
        player_name.setText(String.valueOf(player_new));

        Button reset_game=(Button) findViewById(R.id.button10);
        Button high_score=(Button) findViewById(R.id.button_high);

        reset_game.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                 Intent in2=new Intent(ScoreBoard.this,MainActivity.class);
                 startActivity(in2);

            }
        });

        high_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2=new Intent(ScoreBoard.this,HighScoreActivity.class);
                startActivity(in2);
            }
        });





    }
}
