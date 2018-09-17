package com.example.darkheart.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;

public class PlayActivity extends AppCompatActivity {

    GameStatus gs;
    Random rand;
    int numOfOplays = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        gs = new GameStatus();
        rand = new Random();

    }

    /**********************************************************************************************
     *  btnClicked
    *********************************************************************************************/
    public void btnClicked(View v){

        if(gs.get_winStatus() == Boolean.TRUE) return;

        int index = Integer.parseInt( v.getTag().toString() );


        if(gs.get_IfButtonIsChecked(index) == Boolean.FALSE){

            this.set_btnChecked(v,"X",index);

            if( gs.check_IfWinnerIs("X") == Boolean.TRUE){
                gs.set_winStatus(Boolean.TRUE);
                announceWinner(v, "X");
                return;
            }


            //CPU Turn -- Allowd only for four turns
            if(numOfOplays > 0){
                numOfOplays--;
                int randIndex = rand.nextInt(8);

                while( gs.get_IfButtonIsChecked(randIndex) == Boolean.TRUE ){
                    randIndex = rand.nextInt(8);
                }
                set_btnChecked(v,"O",randIndex);
            }
            if( gs.check_IfWinnerIs("O") == Boolean.TRUE){
                gs.set_winStatus(Boolean.TRUE);
                announceWinner(v,"O");
                return;

            }

        }

    }
    /**********************************************************************************************
     *  set_btnChecked
     *********************************************************************************************/
    public void set_btnChecked(View v, String player, int index){

        player = player.toString();

        // First Row
        Button btnA1;
        Button btnA2;
        Button btnA3;

        // Second Row
        Button btnB1;
        Button btnB2;
        Button btnB3;

        // Third Row
        Button btnC1;
        Button btnC2;
        Button btnC3;

        gs.set_btnCheckedValue(index,Boolean.TRUE);
        gs.set_btnContentValue(index,player);

        switch (index) {

            case 0:
                btnA1 = (Button) findViewById(R.id.btnA1);
                btnA1.setText(player);
                break;
            case 1:
                btnA2 = (Button) findViewById(R.id.btnA2);
                btnA2.setText(player);
                break;
            case 2:
                btnA3 = (Button) findViewById(R.id.btnA3);
                btnA3.setText(player);
                break;
            case 3:
                btnB1 = (Button) findViewById(R.id.btnB1);
                btnB1.setText(player);
                break;
            case 4:
                btnB2 = (Button) findViewById(R.id.btnB2);
                btnB2.setText(player);
                break;
            case 5:
                btnB3 = (Button) findViewById(R.id.btnB3);
                btnB3.setText(player);
                break;
            case 6:
                btnC1 = (Button) findViewById(R.id.btnC1);
                btnC1.setText(player);
                break;
            case 7:
                btnC2 = (Button) findViewById(R.id.btnC2);
                btnC2.setText(player);
                break;
            case 8:
                btnC3 = (Button) findViewById(R.id.btnC3);
                btnC3.setText(player);
                break;
        }
    }

    /**********************************************************************************************
<<<<<<< HEAD
     *  announceWinner
=======
     *  resetGame
>>>>>>> origin/master
     *********************************************************************************************/
    public void announceWinner(View v, String player){
        // First Row
        Button btnA1 = (Button)findViewById(R.id.btnA1);
        Button btnA2 = (Button)findViewById(R.id.btnA2);;
        Button btnA3 = (Button)findViewById(R.id.btnA3);;

        // Second Row
        Button btnB1 = (Button)findViewById(R.id.btnB1);
        Button btnB2 = (Button)findViewById(R.id.btnB2);;
        Button btnB3 = (Button)findViewById(R.id.btnB3);;

        // Third Row
        Button btnC1 = (Button)findViewById(R.id.btnC1);;
        Button btnC2 = (Button)findViewById(R.id.btnC2);;
        Button btnC3 = (Button)findViewById(R.id.btnC3);;

        btnA1.setBackgroundColor(WHITE);
        btnA1.setTextColor(BLACK);
        btnA2.setBackgroundColor(WHITE);
        btnA2.setTextColor(BLACK);
        btnA3.setBackgroundColor(WHITE);
        btnA3.setTextColor(BLACK);
        btnB2.setBackgroundColor(WHITE);
        btnB2.setTextColor(BLACK);
        btnB3.setTextColor(BLACK);
        btnB1.setBackgroundColor(RED);
        btnB3.setBackgroundColor(RED);
        btnC1.setBackgroundColor(RED);
        btnC2.setBackgroundColor(RED);
        btnC3.setBackgroundColor(RED);

        btnA1.setText("W");
        btnA2.setText("I");
        btnA3.setText("N");
        btnB2.setText(player);

        btnB1.setText(" ");
        btnB3.setText(" ");
        btnC1.setText(" ");
        btnC2.setText(" ");
        btnC3.setText(" ");
    }
    /**********************************************************************************************
     *  resetGame
     *********************************************************************************************/
    public void resetGame(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}
