package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctAnswers = 0;
    EditText year;
    CheckBox Satya, Dandi, Swadeshi, Jhansi, Mannu, IronLady;
    //    CheckBox Jhansi = (CheckBox) findViewById(R.id.jhansi_ki_rani);
//    CheckBox Mannu = (CheckBox) findViewById(R.id.mannu);
    String s = "1947";
    //int inCorrectAnswers = 0;

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

    public void clickEditText(View view) {
        year = (EditText) findViewById(R.id.independence_year);
        //String independenceYear = String.valueOf(year.getText());
        // if (independenceYear.equals("1947")) {
        if (year.getText().toString().equals(s)) {
            correctAnswers += 1;
        } else {
            // if (independenceYear != "1947")
            //correctAnswers -= 1;
            if (correctAnswers == 0) {
                correctAnswers += 0;
            } else
                correctAnswers -= 1;
        }
        EditText swami = (EditText) findViewById(R.id.swami_vivekananda);
        if (swami.getText().toString().equals("swami")) {
            correctAnswers += 1;
        } else {
            if (correctAnswers == 0) {
                correctAnswers += 0;
            } else
                correctAnswers -= 1;
        }

    }

    public void onCheckboxClicked(View v) {
        Satya = (CheckBox) findViewById(R.id.Satyagraha);
        Dandi = (CheckBox) findViewById(R.id.Dandi);
        Swadeshi = (CheckBox) findViewById(R.id.Swadeshi);

        if (Satya.isChecked() && Dandi.isChecked() && Swadeshi.isChecked()) {
            correctAnswers += 1;
        } else {
            if (Satya.isChecked()== false || Dandi.isChecked() == false || Swadeshi.isChecked() == false) {
                if(correctAnswers == 0)
                    correctAnswers += 0;
                 else
                   correctAnswers -= 1;

            }
//            if (correctAnswers == 0) {
//                correctAnswers += 0;
//            } else
//                correctAnswers -= 1;
        }
    }

    public void onCheckboxSeven(View v) {
        Jhansi = (CheckBox) findViewById(R.id.jhansi_ki_rani);
        Mannu = (CheckBox) findViewById(R.id.mannu);
        IronLady = (CheckBox) findViewById(R.id.iron_lady);


        if (Jhansi.isChecked() && Mannu.isChecked() && IronLady.isChecked()== false) {
            correctAnswers += 1;
        } else {
            if (Jhansi.isChecked() || Mannu.isChecked() || IronLady.isChecked()) {
                if (correctAnswers == 0) {
                    correctAnswers += 0;
                } else
                    correctAnswers -= 1;
            }

//            if(correctAnswers == 0){
//               correctAnswers += 0;
//            }
//            else
//                correctAnswers -= 1;


        }
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
                if(checked){
                    if(correctAnswers == 0){
                        correctAnswers += 0;
                    }
                    else
                        correctAnswers -= 1;
                }
                    break;
            case R.id.Nehru:
                if(checked)
                    correctAnswers += 1;
                break;
            case R.id.rajendra:
                if(checked){
                    if(correctAnswers == 0){
                        correctAnswers += 0;
                    }
                    else
                        correctAnswers -= 1;
                }
                    break;
            case R.id.kalam:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.sarabhai:
                if(checked){
                    if(correctAnswers == 0){
                        correctAnswers += 0;
                    }
                    else
                        correctAnswers -= 1;
                }
                break;
            case R.id.patel:
                if (checked)
                    correctAnswers += 1;
                break;
            case R.id.lala:
                if(checked){
                    if(correctAnswers == 0){
                        correctAnswers += 0;
                    }
                    else
                        correctAnswers -= 1;
                }
                break;

        }
    }


    public void checkResults(View v){


        Toast.makeText(getApplicationContext(),"Number of Correct Answers " +correctAnswers , Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),"Number of InCorrect Answers " +inCorrectAnswers , Toast.LENGTH_LONG).show();


    }
}
