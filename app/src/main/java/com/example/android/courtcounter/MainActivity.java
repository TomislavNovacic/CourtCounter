package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

        ArrayList<Button> buttonsList = new ArrayList<>();

        Button increment3A = (Button) findViewById(R.id.increment3a);
        buttonsList.add(increment3A);
        Button increment2A = (Button) findViewById(R.id.increment2a);
        buttonsList.add(increment2A);
        Button increment1A = (Button) findViewById(R.id.increment1a);
        buttonsList.add(increment1A);
        Button increment3B = (Button) findViewById(R.id.increment3b);
        buttonsList.add(increment3B);
        Button increment2B = (Button) findViewById(R.id.increment2b);
        buttonsList.add(increment2B);
        Button increment1B = (Button) findViewById(R.id.increment1b);
        buttonsList.add(increment1B);
        Button reset = (Button) findViewById(R.id.resetButton);
        buttonsList.add(reset);

        for (int i = 0; i < buttonsList.size(); i++) {
            final int finalI = i;
            buttonsList.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI == 0) {
                        scoreTeamA = scoreTeamA + 3;
                        displayForTeamA(scoreTeamA);
                    }
                    if(finalI == 1) {
                        scoreTeamA = scoreTeamA + 2;
                        displayForTeamA(scoreTeamA);
                    }
                    if(finalI == 2) {
                        scoreTeamA = scoreTeamA + 1;
                        displayForTeamA(scoreTeamA);
                    }
                    if(finalI == 3) {
                        scoreTeamB = scoreTeamB + 3;
                        displayForTeamB(scoreTeamB);
                    }
                    if(finalI == 4) {
                        scoreTeamB = scoreTeamB + 2;
                        displayForTeamB(scoreTeamB);
                    }
                    if(finalI == 5) {
                        scoreTeamB = scoreTeamB + 1;
                        displayForTeamB(scoreTeamB);
                    }
                    if(finalI == 6) {
                        scoreTeamA = 0;
                        scoreTeamB = 0;
                        displayForTeamA(scoreTeamA);
                        displayForTeamB(scoreTeamB);
                    }
                    }
                });
            }
        }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
}
