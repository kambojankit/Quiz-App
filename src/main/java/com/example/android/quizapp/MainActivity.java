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
    int answerSeven = 0,correctAnswers = 0;
    EditText year, swami;
    CheckBox Satya, Dandi, Swadeshi, Jhansi, Mannu, IronLady;
    RadioButton Gandhi,bose, Nehru, kalam, patel;
    String s = "1947";
    //int inCorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gandhi = (RadioButton) findViewById(R.id.Mahatama_Gandhi);
        bose = (RadioButton) findViewById(R.id.bose);
        Nehru = (RadioButton) findViewById(R.id.Nehru);
        kalam = (RadioButton) findViewById(R.id.kalam);
        patel = (RadioButton) findViewById(R.id.patel);
        year = (EditText) findViewById(R.id.independence_year);
        swami = (EditText) findViewById(R.id.swami_vivekananda);
        Satya = (CheckBox) findViewById(R.id.Satyagraha);
        Dandi = (CheckBox) findViewById(R.id.Dandi);
        Swadeshi = (CheckBox) findViewById(R.id.Swadeshi);
        Jhansi = (CheckBox) findViewById(R.id.jhansi_ki_rani);
        Mannu = (CheckBox) findViewById(R.id.mannu);
        IronLady = (CheckBox) findViewById(R.id.iron_lady);
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

    public void answerOne(View view){
        boolean isAnswerCorrect = false;

        if (Gandhi.isChecked())
            isAnswerCorrect = true;
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            correctAnswers++;
        else
           if(correctAnswers == 0)
               correctAnswers += 0;
           else
            correctAnswers--;
    }

    public void answerTwo(View view){
      boolean isAnswerCorrect = false;

        if (Satya.isChecked() && Dandi.isChecked() && Swadeshi.isChecked()){
            isAnswerCorrect = true;
        }
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            correctAnswers++;
        else
        if(correctAnswers == 0)
            correctAnswers += 0;
        else
            correctAnswers--;
    }

    public void answerThree(View view){
        boolean isAnswerCorrect = false;

        if (Nehru.isChecked())
            isAnswerCorrect = true;
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            correctAnswers++;
        else
        if(correctAnswers == 0)
            correctAnswers += 0;
        else
            correctAnswers--;
    }

    public void answerFour(View view){
        boolean isAnswerCorrect = false;

        if (kalam.isChecked())
            isAnswerCorrect = true;
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            correctAnswers++;
        else
        if(correctAnswers == 0)
            correctAnswers += 0;
        else
            correctAnswers--;
    }

    public void answerFive(View view){
        boolean isAnswerCorrect = false;

        if (patel.isChecked())
            isAnswerCorrect = true;
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            correctAnswers++;
        else
        if(correctAnswers == 0)
            correctAnswers += 0;
        else
            correctAnswers--;
    }

    public void answerSix(View view){
        boolean isAnswerCorrect = false;
        year = (EditText) findViewById(R.id.independence_year);
        String indYear = String.valueOf(year.getText());
        if (indYear.equals("1947")){
            isAnswerCorrect = true;
        }
        if (isAnswerCorrect)
            correctAnswers++;
    }

    public void answerSeven(View view){
        boolean isAnswerCorrect = false;
        if (Jhansi.isChecked() && Mannu.isChecked() && IronLady.isChecked() == false){
            isAnswerCorrect = true;
        }
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            correctAnswers++;
        else
        if(correctAnswers == 0)
            correctAnswers += 0;
        else
            correctAnswers--;
    }

    public void answerEight(View view){

    }

//    public void clickEditText(View view) {
//
//        //String independenceYear = String.valueOf(year.getText());
//        // if (independenceYear.equals("1947")) {
//        if (year.getText().toString().equals(s)) {
//            correctAnswers += 1;
//        } else {
//            // if (independenceYear != "1947")
//            //correctAnswers -= 1;
//            if (correctAnswers == 0) {
//                correctAnswers += 0;
//            } else
//                correctAnswers -= 1;
//        }
//
//        if (swami.getText().toString().equals("swami")) {
//            correctAnswers += 1;
//        } else {
//            if (correctAnswers == 0) {
//                correctAnswers += 0;
//            } else
//                correctAnswers -= 1;
//        }
//
//    }
//
//    public void onCheckboxClicked(View v) {
//
//
//        if (Satya.isChecked() && Dandi.isChecked() && Swadeshi.isChecked()) {
//            correctAnswers += 1;
//        } else {
//            if (Satya.isChecked()== false || Dandi.isChecked() == false || Swadeshi.isChecked() == false) {
//                if(correctAnswers == 0)
//                    correctAnswers += 0;
//                 else
//                   correctAnswers -= 1;
//
//            }
////            if (correctAnswers == 0) {
////                correctAnswers += 0;
////            } else
////                correctAnswers -= 1;
//        }
//    }
//
//    public void onCheckboxSeven(View v) {
//
//
//
//        if (Jhansi.isChecked() && Mannu.isChecked() && IronLady.isChecked()== false){
//            answerSeven +=1;
//        }else
//            if (Jhansi.isChecked() || Mannu.isChecked() || IronLady.isChecked()){
//                answerSeven += 0;
//            }
////        if (Jhansi.isChecked() && Mannu.isChecked() && IronLady.isChecked()== false) {
////            correctAnswers += 1;
////        } else {
////            if (Jhansi.isChecked() || Mannu.isChecked() || IronLady.isChecked()) {
////                if (correctAnswers == 0) {
////                    correctAnswers += 0;
////                } else
////                    correctAnswers -= 1;
////            }
//
////            if(correctAnswers == 0){
////               correctAnswers += 0;
////            }
////            else
////                correctAnswers -= 1;
//
//
////        }
// }
//
//
//
//    public void correctAnswer(View view){
//        boolean checked = ((RadioButton)view).isChecked();
////        correctAnswers += 1;
//        switch (view.getId()){
//            case R.id.Mahatama_Gandhi:
//                if(checked)
//                    correctAnswers += 1;
//                break;
//            case R.id.bose:
//                if(checked){
//                    if(correctAnswers == 0){
//                        correctAnswers += 0;
//                    }
//                    else
//                        correctAnswers -= 1;
//                }
//                    break;
//            case R.id.Nehru:
//                if(checked)
//                    correctAnswers += 1;
//                break;
//            case R.id.rajendra:
//                if(checked){
//                    if(correctAnswers == 0){
//                        correctAnswers += 0;
//                    }
//                    else
//                        correctAnswers -= 1;
//                }
//                    break;
//            case R.id.kalam:
//                if (checked)
//                    correctAnswers += 1;
//                break;
//            case R.id.sarabhai:
//                if(checked){
//                    if(correctAnswers == 0){
//                        correctAnswers += 0;
//                    }
//                    else
//                        correctAnswers -= 1;
//                }
//                break;
//            case R.id.patel:
//                if (checked)
//                    correctAnswers += 1;
//                break;
//            case R.id.lala:
//                if(checked){
//                    if(correctAnswers == 0){
//                        correctAnswers += 0;
//                    }
//                    else
//                        correctAnswers -= 1;
//                }
//                break;
//
//        }
//    }


    public void checkResults(View v){
       // int finalAnswer = answerSeven + correctAnswers;

        //Toast.makeText(getApplicationContext(),"Number of Correct Answers " +correctAnswers , Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Number of Correct Answers " +correctAnswers , Toast.LENGTH_LONG).show();


    }
}
