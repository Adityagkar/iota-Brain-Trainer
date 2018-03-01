//Score Board Activity

package com.example.aditya.iota;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
        final String score_new = intent.getStringExtra("score"); //contains the score of present game
        String player_new = intent.getStringExtra("player"); //contains the name of player
        final Integer answers_right = Integer.parseInt(intent.getStringExtra("right"));
        final Integer total_questions=Integer.parseInt(intent.getStringExtra("questions"));

        txt.setText(score_new);
        player_name.setText(String.valueOf(player_new));

        Button reset_game=(Button) findViewById(R.id.button10);
        Button high_score=(Button) findViewById(R.id.button_high);

        reset_game.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                 Intent in2=new Intent(ScoreBoard.this,MainActivity.class);
                 startActivity(in2);
                ScoreBoard.this.finish();

            }
        });

        high_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add(score_new,total_questions,answers_right);
                Intent in23=new Intent(ScoreBoard.this,HighScoreActivity.class);
                startActivity(in23);
                ScoreBoard.this.finish();
            }
        });



   }
   //for creating database and adding values to it
           public void add(String score,Integer TotalQuestions,Integer CorrectAnswered) {

               int correct = CorrectAnswered;
               int incorrect = TotalQuestions - CorrectAnswered;

               float percentage = ((float)CorrectAnswered / (float)TotalQuestions)*100.00f;
               String scores = score;
               Log.d("PERCENT",percentage+" ");

               try {

                   SQLiteDatabase db = this.openOrCreateDatabase("IotaGame.db", MODE_PRIVATE, null);
                  db.execSQL("create table if not exists " + "scores" + " (CORRECT_ANSWERS INTEGER,INCORRECT_ANSWERS INTEGER,SCORES VARCHAR,PERCENTAGE REAL,TOTAL_QUESTIONS_ANSWERED INTEGER)");
                  db.execSQL("INSERT INTO scores VALUES ('" + correct + "','" + incorrect + "','" + scores + "','" + percentage + "','" + TotalQuestions + "')");
                  // db.execSQL("drop table scores");
                   Log.d("ADDED","SUCCESS");

               }
               catch(Exception e){
                   e.printStackTrace();
               }

           }
}

