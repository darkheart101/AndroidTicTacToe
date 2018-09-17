package com.example.darkheart.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /***************************************************
      get_AboutActivity
    ****************************************************/
    public void get_AboutActivity(View v){
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }

    /***************************************************
     get_PlayActivity
     ****************************************************/
    public void get_PlayActivity(View v){
        Intent i = new Intent(this, PlayActivity.class);
        startActivity(i);
    }
}
