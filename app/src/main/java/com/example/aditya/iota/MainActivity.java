//Takes the name of player and as soon as player inputs his name , the game begins !
package com.example.aditya.iota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String temp=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txt=(EditText) findViewById(R.id.editText2);
        Button start=(Button) findViewById(R.id.button10);


        final TextView err=(TextView) findViewById(R.id.textView7);
       start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                temp=txt.getText().toString();
                if(temp.isEmpty())
                    err.setText("You can't leave this Empty !");
                else{
                    Intent in2=new Intent(MainActivity.this,Main2Activity.class);
                     in2.putExtra("player_score",txt.getText());
                    startActivity(in2);

                    MainActivity.this.finish();
                }

            }
        });

    }
}
