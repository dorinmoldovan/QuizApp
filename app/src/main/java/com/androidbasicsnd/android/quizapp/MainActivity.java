package com.androidbasicsnd.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
        computeScoreForQuestion2();
        computeScoreForQuestion3();
        computeScoreForQuestion4();
        computeScoreForQuestion5();
        computeScoreForQuestion6();
        computeScoreForQuestion7();
        computeScoreForQuestion8();
        computeScoreForQuestion9();
        computeScoreForQuestion10();
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.score_message_first_part) + score
                + getString(R.string.score_message_second_part);
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

    private void computeScoreForQuestion2() {
        RadioButton androidRadioButton = (RadioButton) findViewById(R.id.id_android);
        if(androidRadioButton.isChecked()) {
            score++;
        }
    }

    private void computeScoreForQuestion3() {
        RadioButton androidRadioButton = (RadioButton) findViewById(R.id.id_yes);
        if(androidRadioButton.isChecked()) {
            score++;
        }
    }

    private void computeScoreForQuestion4() {
        EditText editText = (EditText) findViewById(R.id.id_language);
        if(editText.getText().toString().equalsIgnoreCase(getString(R.string.java))) {
            score++;
        } else if(editText.getText().toString().equalsIgnoreCase(getString(R.string.kotlin))) {
            score++;
        } else if(editText.getText().toString().equalsIgnoreCase(getString(R.string.c))) {
            score++;
        } else if(editText.getText().toString().equalsIgnoreCase(getString(R.string.c_sharp))) {
            score++;
        } else if(editText.getText().toString().equalsIgnoreCase(getString(R.string.basic))) {
            score++;
        } else if(editText.getText().toString().equalsIgnoreCase(getString(R.string.corona))) {
            score++;
        } else if(editText.getText().toString().equalsIgnoreCase(getString(R.string.phonegap))) {
            score++;
        }
    }

    private void computeScoreForQuestion5() {
        CheckBox ddmsCheckBox = (CheckBox) findViewById(R.id.ddms_checkbox);
        CheckBox aaptCheckBox = (CheckBox) findViewById(R.id.aapt_checkbox);
        CheckBox adbCheckBox = (CheckBox) findViewById(R.id.adb_checkbox);

        if(ddmsCheckBox.isChecked() && aaptCheckBox.isChecked() && adbCheckBox.isChecked()) {
            score++;
        }
    }

    private void computeScoreForQuestion6() {
        Spinner spinner = (Spinner) findViewById(R.id.id_layouts);
        if(spinner.getSelectedItem().toString().equals(getString(R.string.layout_folder))) {
            score++;
        }
    }

    private void computeScoreForQuestion7() {
        RadioButton year2008RadioButton = (RadioButton) findViewById(R.id.id_2008);
        if(year2008RadioButton.isChecked()) {
            score++;
        }
    }

    private void computeScoreForQuestion8() {
        RadioButton parcelableRadioButton = (RadioButton) findViewById(R.id.id_parcelable);
        if(parcelableRadioButton.isChecked()) {
            score++;
        }
    }

    private void computeScoreForQuestion9() {
        RadioButton andyRubinRadioButton = (RadioButton) findViewById(R.id.id_andy_rubin);
        if(andyRubinRadioButton.isChecked()) {
            score++;
        }
    }

    private void computeScoreForQuestion10() {
        CheckBox activeCheckBox = (CheckBox) findViewById(R.id.active_checkbox);
        CheckBox pausedCheckBox = (CheckBox) findViewById(R.id.paused_checkbox);
        CheckBox stoppedCheckBox = (CheckBox) findViewById(R.id.stopped_checkbox);
        CheckBox destroyedCheckBox = (CheckBox) findViewById(R.id.destroyed_checkbox);
        CheckBox finishedCheckBox = (CheckBox) findViewById(R.id.finished_checkbox);
        if(activeCheckBox.isChecked() && pausedCheckBox.isChecked()
                && stoppedCheckBox.isChecked() && destroyedCheckBox.isChecked() &&
                !finishedCheckBox.isChecked()) {
            score++;
        }
    }
}
