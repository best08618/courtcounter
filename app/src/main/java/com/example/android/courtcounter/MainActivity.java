package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA = 0;
    int scoreB = 0;

    public void A_threePoint(View view)
    {   scoreA= scoreA + 3 ;
        displayForTeamA(scoreA);

    }
    public void A_twoPoint(View view)
    {    scoreA= scoreA + 2;
        displayForTeamA(scoreA);

    }
    public void A_free_throw(View view)
    {    scoreA++;
        displayForTeamA(scoreA);
    }

    public void B_threePoint(View view)
    {   scoreB= scoreB + 3 ;
        displayForTeamB(scoreB);

    }
    public void B_twoPoint(View view)
    {    scoreB= scoreB+2;
        displayForTeamB(scoreB);

    }
    public void B_free_throw(View view)
    {   scoreB++;
        displayForTeamB(scoreB);

    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
