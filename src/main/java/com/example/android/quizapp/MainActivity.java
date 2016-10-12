package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctAnswers = 0;
    int inCorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void correctAnswer(View view){
        boolean checked = ((RadioButton)view).isChecked();
//        correctAnswers += 1;
        switch (view.getId()){
            case R.id.Mahatama_Gandhi:
                if(checked)
                    correctAnswers += 1;
                break;
            case R.id.bose:
                if(checked)
                    correctAnswers -= 1;
                    break;
            case R.id.Nehru:
                if(checked)
                    correctAnswers += 1;
                break;
            case R.id.rajendra:
                if(checked)
                    correctAnswers -= 1;
                    break;
            case R.id.kalam:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.sarabhai:
                if (checked)
                    correctAnswers -= 1;
                break;
            case R.id.patel:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.lala:
                if (checked)
                    correctAnswers -= 1;

        }
    }


    public void checkResults(View v){
        Toast.makeText(getApplicationContext(),"Number of Correct Answers " +correctAnswers , Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),"Number of InCorrect Answers " +inCorrectAnswers , Toast.LENGTH_LONG).show();


    }
}
