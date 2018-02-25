//Score Board Activity

package com.example.aditya.iota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        TextView txt=(TextView) findViewById(R.id.finalScore);

        Intent intent = getIntent();
       String score_new = intent.getStringExtra("player_score");
        txt.setText(score_new);

        Button reset_game=(Button) findViewById(R.id.button10);

        reset_game.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

         Intent in2=new Intent(ScoreBoard.this,MainActivity.class);
         startActivity(in2);

            }
        });





    }
}
