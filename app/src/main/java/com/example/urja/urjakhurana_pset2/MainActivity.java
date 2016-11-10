package com.example.urja.urjakhurana_pset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playGame(View view) {
        // goes to second screen to start playing game
        Intent startGame = new Intent(this, playGame.class);
        startActivity(startGame);
        finish();
    }
}
