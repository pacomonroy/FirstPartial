package com.example.paco.firstpartial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private int score1=0;
    private int score2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText("SCORE:"+score1+"-"+score2);




    }


    public void resetP(View view){
        score1=0;
        score2=0;
        tv1.setText("SCORE:"+score1+"-"+score2);
    }

    public void rockP (View view){

        Random myRandom = new Random();
        int myChoice = myRandom.nextInt(3)+1;
        String str = "";


        switch (myChoice){
            case 1:
                str="Rock - TIE";
                Toast r= Toast.makeText(this,str,Toast.LENGTH_LONG);
                r.show();
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;

            case 2:
                str="Paper - YOU LOOSE";
                Toast p= Toast.makeText(this,str,Toast.LENGTH_LONG);
                p.show();
                score2++;
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;

            case 3:
                str="Scissors - YOU WIN";
                Toast s= Toast.makeText(this,str,Toast.LENGTH_LONG);
                s.show();
                score1++;
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;


        }



    }

    public void paperP (View view){

        Random myRandom = new Random();
        int myChoice = myRandom.nextInt(3)+1;
        String str = "";


        switch (myChoice){
            case 1:
                str="Rock - YOU WIN";
                Toast r= Toast.makeText(this,str,Toast.LENGTH_LONG);
                r.show();
                score1++;
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;

            case 2:
                str="Paper - TIE";
                Toast p= Toast.makeText(this,str,Toast.LENGTH_LONG);
                p.show();
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;

            case 3:
                str="Scissors - YOU LOOSE";
                Toast s= Toast.makeText(this,str,Toast.LENGTH_LONG);
                s.show();
                score2++;
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;


        }



    }

    public void scP (View view){

        Random myRandom = new Random();
        int myChoice = myRandom.nextInt(3)+1;
        String str = "";


        switch (myChoice){
            case 1:
                str="Rock - YOU LOOSE";
                Toast r= Toast.makeText(this,str,Toast.LENGTH_LONG);
                r.show();
                score2++;
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;

            case 2:
                str="Paper - YOU WIN";
                Toast p= Toast.makeText(this,str,Toast.LENGTH_LONG);
                p.show();
                score1++;
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;

            case 3:
                str="Scissors - TIE";
                Toast s= Toast.makeText(this,str,Toast.LENGTH_LONG);
                s.show();
                tv1.setText("SCORE:"+score1+"-"+score2);
                break;


        }



    }

}
