//high score activity is responsible for fetching data from a database and displaying it.

package com.example.aditya.iota;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class HighScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        TableLayout mylist=(TableLayout) findViewById(R.id.table_lay1);

        try {
            SQLiteDatabase db = this.openOrCreateDatabase("IotaGame.db", MODE_PRIVATE, null);
            Cursor    c = db.rawQuery("SELECT  * FROM scores", null);

          if( c.moveToFirst())
          {
          do {
              //used table layout for displaying queries from data
              Log.d("SCORESS","GOT INTO dowhile");
              String scores = c.getString(c.getColumnIndex("SCORES"));
              int correct = c.getInt(c.getColumnIndex("CORRECT_ANSWERS"));
              int incorrect = c.getInt(c.getColumnIndex("INCORRECT_ANSWERS"));
              int totalquestions = c.getInt(c.getColumnIndex("TOTAL_QUESTIONS_ANSWERED"));
              float perc = c.getFloat(c.getColumnIndex("PERCENTAGE"));
              Log.d("SCORESS", correct + "");
              TableRow row_obj = new TableRow(this);

              TextView c1 = new TextView(this);
              c1.setText(""+correct);
              c1.setTextColor(Color.WHITE);
              c1.setGravity(Gravity.CENTER);
              row_obj.addView(c1);


              TextView c2 = new TextView(this);
              c2.setText("" + incorrect);
              c2.setTextColor(Color.WHITE);
              c2.setGravity(Gravity.CENTER);
              row_obj.addView(c2);
              Log.d("SCORESS", incorrect + "");

              TextView c3 = new TextView(this);
              c3.setText(scores);
              c3.setTextColor(Color.WHITE);
              c3.setGravity(Gravity.CENTER);
              row_obj.addView(c3);
              Log.d("SCORESS", scores + "");

              TextView c4 = new TextView(this);
              String percentage = String.valueOf(perc);
              c4.setText(percentage);
              c4.setTextColor(Color.WHITE);
              c4.setGravity(Gravity.CENTER);
              row_obj.addView(c4);

              Log.d("SCORESS", percentage + "");

              TextView c5 = new TextView(this);
              c5.setText(""+totalquestions);
              c5.setTextColor(Color.WHITE);
              c5.setGravity(Gravity.CENTER);
              row_obj.addView(c5);
              Log.d("SCORESS", totalquestions + "");

              mylist.addView(row_obj);
          }
              while (c.moveToNext());;



            }





        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}


