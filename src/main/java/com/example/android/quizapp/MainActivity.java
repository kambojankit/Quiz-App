package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int correctAnswers = 0,answerOne = 0, answerTwo = 0, answerThree = 0, answerFour = 0,
    answerFive = 0, answerSix = 0, answerSeven = 0, answerEight = 0;
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

        if (isAnswerCorrect)
           // answerOne++;
            answerOne = 1;
            //correctAnswers++;
        else
            if(answerOne == 0)
                answerOne += 0;
            else
                answerOne = 0;
               // answerOne--;

//           if(correctAnswers == 0)
//               correctAnswers += 0;
//           else
//            correctAnswers--;
    }

    public void answerTwo(View view){
      boolean isAnswerCorrect = false;


        if (Satya.isChecked() && Dandi.isChecked() && Swadeshi.isChecked())
            isAnswerCorrect = true;

//        else
//            isAnswerCorrect = false;

        if (isAnswerCorrect)
            answerTwo = 1;
            //answerTwo++;
        else
            answerTwo = 0;
//            if (answerTwo > 0)
//                answerTwo--;
            //correctAnswers++;
//        else
//        if(correctAnswers == 0)
//            correctAnswers += 0;
//        else
//            correctAnswers--;
    }

    public void answerThree(View view){
        boolean isAnswerCorrect = false;

        if (Nehru.isChecked())
            isAnswerCorrect = true;

        if (isAnswerCorrect)
            answerThree = 1;
            //answerThree++;
        else
            answerThree = 0;
//        if(answerThree == 0)
//            answerThree += 0;
//        else
//            answerThree--;
//        if(correctAnswers == 0)
//            correctAnswers += 0;
//        else
//            correctAnswers--;
    }

    public void answerFour(View view){
        boolean isAnswerCorrect = false;

        if (kalam.isChecked())
            isAnswerCorrect = true;
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            answerFour = 1;
           // answerFour++;
        else
            answerFour = 0;
//        if(answerFour == 0)
//            answerFour += 0;
//        else
//            answerFour--;
//        if(correctAnswers == 0)
//            correctAnswers += 0;
//        else
//            correctAnswers--;
    }

    public void answerFive(View view){
        boolean isAnswerCorrect = false;

        if (patel.isChecked())
            isAnswerCorrect = true;
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            answerFive = 1;
            //answerFive++;
        else
            answerFive = 0;
//        if(answerFive == 0)
//            answerFive += 0;
//        else
//            answerFive--;
//        if(correctAnswers == 0)
//            correctAnswers += 0;
//        else
//            correctAnswers--;
    }

  //  public void answerSix(View view){
       // boolean isAnswerCorrect = false;
//        year = (EditText) findViewById(R.id.independence_year);
//        year.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                boolean isAnswerCorrect = false;
//                String indYear = year.getText().toString();
//                if (indYear.equals("1947")){
//                    isAnswerCorrect = true;
//        }
//                if (isAnswerCorrect) {
//                    answerSix++;
//                    return true;
//                }
//                return false;
//            }
//        });
    public void answerSix(View view){
//        year = (EditText) findViewById(R.id.independence_year);
        boolean isAnswerCorrect = false;
        //String indYear = String.valueOf(year.getText());
        String indYear = year.getText().toString();
        Log.w("DATA_SIX", indYear);
        if (indYear.equals("1947")){
            isAnswerCorrect = true;
        }
        if (isAnswerCorrect)
            answerSix = 1;
        else {
            answerSix = 0;
        }
            //answerSix++;
   }

    public void answerSeven(View view) {
        boolean isAnswerCorrect = false;
        if (Jhansi.isChecked() && Mannu.isChecked() && IronLady.isChecked() == false) {
            isAnswerCorrect = true;
        } else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            answerSeven = 1;
            //answerSeven++;
        else
            answerSeven = 0;
    }


    public void answerEight(View view){
        boolean isAnswerCorrect = false;
        String name = swami.getText().toString();
        Log.e("DATA_EGHT", name);
        if (name.equalsIgnoreCase("swami")) {
            isAnswerCorrect = true;
        }

        if (isAnswerCorrect){
            answerEight = 1;
        }else {
            answerEight = 0;
        }
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
        int finalAnswer = answerOne + answerTwo + answerThree + answerFour + answerFive + answerSix + answerSeven + answerEight;

        Toast.makeText(getApplicationContext(),"Number of Correct Answers " +finalAnswer , Toast.LENGTH_LONG).show();
       // Toast.makeText(getApplicationContext(),"Number of Correct Answers " +correctAnswers , Toast.LENGTH_LONG).show();


    }
}
