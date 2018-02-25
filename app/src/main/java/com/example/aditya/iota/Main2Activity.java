


package com.example.aditya.iota;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;import android.os.CountDownTimer;

public class Main2Activity extends AppCompatActivity {
    static int scores=0;
    long time=30;
    int score=0;
        //TextView score_card=(TextView) findViewById(R.id.score);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    final TextView timer=(TextView) findViewById(R.id.timer_text_view);


        nextActivity();

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText(" " + millisUntilFinished / 1000+" ");

            }

            public void onFinish() {
                timer.setText(" 00 ");
                //direct to scoreboard
                Intent in2=new Intent(Main2Activity.this,ScoreBoard.class);
                in2.putExtra("player_score",Integer.toString(score));
                startActivity(in2);


            }

        }.start();



    }

    void nextActivity(){



        Button choice1=(Button) findViewById(R.id.button1);
        Button choice2=(Button) findViewById(R.id.button2);
        Button choice3=(Button) findViewById(R.id.button3);
        Button choice4=(Button) findViewById(R.id.button4);
        TextView display_text =(TextView) findViewById(R.id.question_text_view);



        int i1,i2,i3,i4=0;

        int choice_number=0;
        final int min = 0;
        final int max = 80;


        Random r = new Random();

        int num1 = r.nextInt((max - min))+1 ;

        int num2 = r.nextInt((max - min) )+1 ;

        String question=Integer.toString(num1)+" + "+Integer.toString(num2);

        display_text.setText(question);

        //for randomizing the answer button
        choice_number=r.nextInt((3))+1;
        //choice_number=1;
        i1 = r.nextInt((max - min) + 1) ;
        i2 = r.nextInt((max - min) + 1) ;
        i3 = r.nextInt((max - min) + 1) ;
        final TextView score_card=(TextView) findViewById(R.id.score);

        switch(choice_number){

            case 1: choice1.setText(Integer.toString(num1+num2));
                choice2.setText(Integer.toString(i1));
                choice3.setText(Integer.toString(i2));
                choice4.setText(Integer.toString(i3));
                choice1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        if(time>0)
                        {
                            int score_temp=Integer.parseInt((String) score_card.getText());
                            score_temp=score_temp+10;
                            score=score_temp;
                            score_card.setText(Integer.toString(score_temp));

                            nextActivity();

                        }
                        else{
                            return;
                        }

                    }
                });

                choice2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                      if(time>0){
                            nextActivity();
                      }
                      else
                          return;

                    }
                });

                choice3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if(time>0){
                            nextActivity();
                        }
                        else
                            return;

                    }
                });

                choice4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if(time>0){
                            nextActivity();
                        }
                        else
                            return;

                    }
                });
                break;

            case 2: choice2.setText(Integer.toString(num1+num2));
                        choice1.setText(Integer.toString(i1));
                        choice3.setText(Integer.toString(i2));
                        choice4.setText(Integer.toString(i3));


                        choice2.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {

                                if(time>0)
                                {
                                    int score_temp=Integer.parseInt((String) score_card.getText());
                                    score_temp=score_temp+10;
                                    score=score_temp;
                                    score_card.setText(Integer.toString(score_temp));

                                    nextActivity();

                                }
                                else{
                                    return;
                                }

                            }
                        });

                        choice1.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });

                        choice3.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });

                        choice4.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });
                        break;


            case 3: choice3.setText(Integer.toString(num1+num2));
                    choice1.setText(Integer.toString(i1));
                    choice2.setText(Integer.toString(i2));
                    choice4.setText(Integer.toString(i3));


                        choice3.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {

                                if(time>0)
                                {
                                    int score_temp=Integer.parseInt((String) score_card.getText());
                                    score_temp=score_temp+10;
                                    score=score_temp;
                                    score_card.setText(Integer.toString(score_temp));

                                    nextActivity();

                                }
                                else{
                                    return;
                                }

                            }
                        });
                        choice2.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });

                        choice1.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });

                        choice4.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });
                        break;

            case 4: choice4.setText(Integer.toString(num1+num2));
                    choice1.setText(Integer.toString(i1));
                    choice2.setText(Integer.toString(i2));
                    choice3.setText(Integer.toString(i3));


                        choice4.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {

                                if(time>0)
                                {
                                    int score_temp=Integer.parseInt((String) score_card.getText());
                                    score_temp=score_temp+10;
                                    score=score_temp;
                                    score_card.setText(Integer.toString(score_temp));

                                    nextActivity();

                                }
                                else{
                                    return;
                                }

                            }
                        });

                        choice2.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });

                        choice3.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });

                        choice1.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                if(time>0){
                                    nextActivity();
                                }
                                else
                                    return;

                            }
                        });
                        break;


        }




    }



}
