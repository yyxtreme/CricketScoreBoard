package com.yatinyadav.cricketscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketTeamA = 0;
    int wicketTeamB = 0;
    int oversTeamA = 0;
    int oversTeamB = 0;


    public void displayscoreForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayscoreForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayballsForTeamA(String balls)
    {
        TextView ballsView = (TextView) findViewById(R.id.balls_team_a);
        ballsView.setText((balls));
    }

    public void displayballsForTeamB(String balls)
    {
        TextView ballsView = (TextView) findViewById(R.id.balls_team_b);
        ballsView.setText((balls));
    }
    public void displayWicketsForTeamA(int wickets)
    {
        TextView wicketsView = (TextView) findViewById(R.id.wickets_team_a);
        wicketsView.setText(String.valueOf(wickets));
    }
    public void displayWicketsForTeamB(int wickets)
    {
        TextView wicketsView = (TextView) findViewById(R.id.wickets_team_b);
        wicketsView.setText(String.valueOf(wickets));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
        oversTeamA = 0;
        oversTeamB = 0;
        displayWicketsForTeamA(wicketTeamA);
        displayballsForTeamA("0");
        displayscoreForTeamA(scoreTeamA);
        displayWicketsForTeamB(wicketTeamB);
        displayballsForTeamB("0");
        displayscoreForTeamB(scoreTeamB);
    }
    public String increment(int overs)
    {

        int over=overs/6;
        int b=overs%6;
        String str=Integer.toString(over)+"."+Integer.toString(b);
        return str;

    }
    public void wicketsTeamA(View view)
    {
        wicketTeamA = wicketTeamA + 1;
        displayWicketsForTeamA(wicketTeamA);
        oversTeamA++;
        displayballsForTeamA(increment(oversTeamA));
    }

    public void wicketsTeamB(View view)
    {
        wicketTeamB = wicketTeamB + 1;
        displayWicketsForTeamB(wicketTeamB);
        oversTeamB++;
        displayballsForTeamB(increment(oversTeamB));

    }

    public void ballsPlusTeamA(View view)
    {
        oversTeamA++;
        displayballsForTeamA(increment(oversTeamA));



    }

    public void ballsPlusTeamB(View view)
    {
        oversTeamB++;
        displayballsForTeamB(increment(oversTeamB));
    }

    public void plus1TeamA(View view)
    {
        scoreTeamA = scoreTeamA + 1;
        displayscoreForTeamA(scoreTeamA);
        oversTeamA++;
        displayballsForTeamA(increment(oversTeamA));
    }

    public void plus2TeamA(View view)
    {
        scoreTeamA = scoreTeamA + 2;
        displayscoreForTeamA(scoreTeamA);
        oversTeamA++;
        displayballsForTeamA(increment(oversTeamA));
    }

    public void plus4TeamA(View view)
    {
        scoreTeamA = scoreTeamA + 4;
        oversTeamA++;
        displayscoreForTeamA(scoreTeamA);
    }

    public void plus6TeamA(View view)
    {
        scoreTeamA = scoreTeamA + 6;
        displayscoreForTeamA(scoreTeamA);
        oversTeamA++;
        displayballsForTeamA(increment(oversTeamA));
    }


    public void plus1TeamB(View view)
    {
        scoreTeamB = scoreTeamB + 1;
        displayscoreForTeamB(scoreTeamB);
        oversTeamB++;
        displayballsForTeamB(increment(oversTeamB));
    }

    public void plus2TeamB(View view)
    {
        scoreTeamB = scoreTeamB + 2;
        displayscoreForTeamB(scoreTeamB);
        oversTeamB++;
        displayballsForTeamB(increment(oversTeamB));
    }

    public void plus4TeamB(View view)
    {
        scoreTeamB = scoreTeamB + 4;
        displayscoreForTeamB(scoreTeamB);
        oversTeamB++;
        displayballsForTeamB(increment(oversTeamB));
    }

    public void plus6TeamB(View view)
    {
        scoreTeamB = scoreTeamB + 6;
        displayscoreForTeamB(scoreTeamB);
        oversTeamB++;
        displayballsForTeamB(increment(oversTeamB));
    }
}
