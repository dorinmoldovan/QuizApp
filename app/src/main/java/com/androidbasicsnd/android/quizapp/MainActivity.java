package com.androidbasicsnd.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int MAX_SCORE = 10;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    /**
     * This method computes the score and displays the result in a toast.
     *
     * @param v
     */
    public void computeScore(View v) {
        score = 0;
        computeScoreForQuestion1();
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.score_message_first_part) + score
                + getString(R.string.score_message_second_part) + MAX_SCORE;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void computeScoreForQuestion1() {
        RadioButton googleRadioButton = (RadioButton) findViewById(R.id.id_google);
        if(googleRadioButton.isChecked()) {
            score++;
        }
    }
}
