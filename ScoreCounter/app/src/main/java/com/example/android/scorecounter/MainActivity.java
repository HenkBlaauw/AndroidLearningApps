package com.example.android.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForA= 0;
    int scoreForB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        int uiOption = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOption);
        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayScore(int scoreForA, int scoreForB) {
        TextView scoreView = findViewById(R.id.score);
        scoreView.setText(String.valueOf(scoreForA)+ " - " + String.valueOf(scoreForB));
    }


    public void addTryForA(View view){
        scoreForA= scoreForA + 5;
        displayScore(scoreForA, scoreForB);
    }


    public void addTryForW(View view){
        scoreForB = scoreForB+ 5;
        displayScore(scoreForA, scoreForB);
    }


    public void addConversionForA(View view){

        scoreForA = scoreForA + 2;
        displayScore(scoreForA, scoreForB);
    }

    public void addConversionForW(View view){

        scoreForB = scoreForB + 2;
        displayScore(scoreForA, scoreForB);
    }


    public void addPenaltyForA(View view){

        scoreForA = scoreForA+3;
        displayScore(scoreForA, scoreForB);
    }

    public void addPenaltyForW(View view){

        scoreForB = scoreForB+3;
        displayScore(scoreForA, scoreForB);
    }
}
