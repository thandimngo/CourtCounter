package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreView = 0;
    int scoreTeamB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view){
        scoreView=0;
        scoreTeamB=0;
        displayTeamA(scoreView);
        displayTeamB(scoreTeamB);
    }

    public void displayTeamA(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_A_Score);
                scoreView.setText(String.valueOf(score));
    }

    public void plusThreeA(View view){
        scoreView = scoreView + 3;
        displayTeamA(scoreView);


    }
    public void plusTwoA(View view){
        scoreView = scoreView + 2;
        displayTeamA(scoreView);


    }

    public void plusOneA(View view){
        scoreView = scoreView + 1;
        displayTeamA(scoreView);


    }
    public void displayTeamB(int score){
        TextView scoreTeamB =(TextView) findViewById(R.id.team_B_Score);
        scoreTeamB.setText(String.valueOf(score));
    }

    public void plusThreeB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);


    }
    public void plusTwoB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);


    }

    public void plusOneB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);

    }

}
