package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    byte correctAnswers = 0,answerOne = 0, answerTwo = 0, answerThree = 0, answerFour = 0,
    answerFive = 0, answerSix = 0, answerSeven = 0, answerEight = 0;
    EditText year, swami;
    CheckBox Satya, Dandi, Swadeshi, Jhansi, Mannu, IronLady;
    RadioButton Gandhi,bose, Nehru, kalam, patel;
    String s = "1947";


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
//        year.setOnFocusChangeListener(this);
//        swami.setOnFocusChangeListener(this);
//        year.setOnTouchListener(this);
//        swami.setOnTouchListener(this);


        swami.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Nothing need to be done here, as this method is called before the text is changed

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // This is called when text is being changed

            }

            @Override
            public void afterTextChanged(Editable editable) {
                // This is called when text has been changed
                answerEight();
            }
        });

        year.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                answerSix();
            }
        });
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

        /**
            SEE:  Firstly the logic you added in else block is not required. you can use something like below

             if (isAnswerCorrect){
                correctAnswers++;
             }
             else{
                correctAnswers--;
             }

         But this correctAnswers is the root cause of all the issues.

         Every time you click on something in your App Activity, it leads to any of the answers checking methods to be called.

         i.e either if you clicked on question 1's correct answer 'Mahatma Gandhi' twice, that will lead to correctAnswers being incremented twice

         which is incorrect.

         Hence look at some other way of achieving the same.

         */

        if (isAnswerCorrect)
            answerOne = 1;

        else
            if(answerOne == 0)
                answerOne += 0;
            else
                answerOne = 0;
    }

    public void answerTwo(View view){
      boolean isAnswerCorrect = false;


        if (Satya.isChecked() && Dandi.isChecked() && Swadeshi.isChecked())
            isAnswerCorrect = true;

        if (isAnswerCorrect)
            answerTwo = 1;
        else
            answerTwo = 0;
    }

    public void answerThree(View view){
        boolean isAnswerCorrect = false;

        if (Nehru.isChecked())
            isAnswerCorrect = true;

        if (isAnswerCorrect)
            answerThree = 1;
        else
            answerThree = 0;

    }

    public void answerFour(View view){
        boolean isAnswerCorrect = false;

        if (kalam.isChecked())
            isAnswerCorrect = true;
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            answerFour = 1;
        else
            answerFour = 0;
    }

    public void answerFive(View view){
        boolean isAnswerCorrect = false;

        if (patel.isChecked())
            isAnswerCorrect = true;
        else
            isAnswerCorrect = false;

        if (isAnswerCorrect)
            answerFive = 1;
        else
            answerFive = 0;
    }

    public void answerSix(){
        boolean isAnswerCorrect = false;
        String indYear = year.getText().toString();
//        Log.e("DATA_SIX", indYear);
        if (indYear.equals("1947")){
            isAnswerCorrect = true;
        }
        if (isAnswerCorrect)
            answerSix = 1;
        else {
            answerSix = 0;
        }
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


    public void answerEight(){
        boolean isAnswerCorrect = false;
        String name = swami.getText().toString();
//        Log.e("DATA_EGHT", name);
        if (name.equalsIgnoreCase("Swami Vivekanand")) {
            isAnswerCorrect = true;
        }

        if (isAnswerCorrect){
            answerEight = 1;
        }else {
            answerEight = 0;
        }
    }

    public void checkResults(View v){

        int finalAnswer = answerOne + answerTwo + answerThree + answerFour + answerFive + answerSix + answerSeven + answerEight;
        Toast.makeText(getApplicationContext(),"Number of Correct Answers " +finalAnswer , Toast.LENGTH_LONG).show();


    }

//    @Override
//    public void onFocusChange(View view, boolean b) {
//        switch(view.getId()){
//            case R.id.independence_year:
//                answerSix(view);
//                break;
//            case R.id.swami_vivekananda:
//                answerEight(view);
//                break;
//        }
//    }
//
//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent) {
//        boolean status = false;
//
//        switch(view.getId()){
//            case R.id.independence_year:
//                answerSix(view);
//                status = true;
//                break;
//            case R.id.swami_vivekananda:
//                answerEight(view);
//                status=true;
//                break;
//        }
//        return status;
//    }
}
