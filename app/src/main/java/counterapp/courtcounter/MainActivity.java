package counterapp.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamRed = 0;
    int scoreTeamBlue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addOneForTeamA(View v) {
        scoreTeamRed = scoreTeamRed + 1;
        displayForTeamRed(scoreTeamRed);
    }

    public void displayForTeamRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_Red_score);
        scoreView.setText(String.valueOf(score));}

    public void addThreeForTeamA(View v) {
        scoreTeamRed = scoreTeamRed + 3;
        displayForTeamRed(scoreTeamRed);
    }

    public void addOneForTeamB(View v) {
        scoreTeamBlue = scoreTeamBlue + 1;
        displayForTeamBlue(scoreTeamBlue);
    }


    public void addThreeForTeamB(View v) {
        scoreTeamBlue = scoreTeamBlue + 3;
        displayForTeamBlue(scoreTeamBlue);
    }
    public void displayForTeamBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_Blue_score);
        scoreView.setText(String.valueOf(score));
    }


    public void resetScore(View v) {
        scoreTeamRed = 0;
        scoreTeamBlue = 0;
        displayForTeamRed(scoreTeamRed);
        displayForTeamBlue(scoreTeamBlue);

    }





}
