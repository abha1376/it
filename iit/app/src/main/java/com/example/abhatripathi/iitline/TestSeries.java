package com.example.abhatripathi.iitline;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TestSeries extends AppCompatActivity{
    //used later
    //Button previous,next,remark;

    private static final long COUNTDOWN_IN_MILLIS=30000;
   private TextView question,score,count,countdown;
    private Button next;
    private RadioGroup radioGroup;
    private  RadioButton answer1,answer2,answer3,answer4;
    private  ColorStateList textColourDefaultRb;


    private ColorStateList textColorDefaultCd;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    public List<TestQuestion> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private TestQuestion currentQuestion;


    private int Testscore;
    private boolean answered;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_test);

        answer1 = findViewById(R.id.testRadioButton1);
        answer2 = findViewById(R.id.testRadioButton2);
        answer3 = findViewById(R.id.testRadioButton3);
        answer4 = findViewById(R.id.testRadioButton4);
        question = findViewById(R.id.TestQuestion);
        score = findViewById(R.id.score);
        count = findViewById(R.id.questionCount);
        countdown = findViewById(R.id.countdown);

        radioGroup = findViewById(R.id.radioGroupTest);

        next = findViewById(R.id.testNext);



        textColourDefaultRb=answer1.getTextColors();

        textColorDefaultCd=countdown.getTextColors();

        QuizDbHelper dbHelper=new QuizDbHelper(this);
        questionList = dbHelper.getAllQuestions();

        questionCountTotal=questionList.size();
        Collections.shuffle(questionList);

        showNextQuestion();


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!answered) {
                    if (answer1.isChecked() || answer2.isChecked() || answer3.isChecked() || answer4.isChecked()) {
                        checkAnswer();
                    } else {
                        Toast.makeText(TestSeries.this, "Please Select an answer", Toast.LENGTH_SHORT).show();

                    }
                }
                else {

                    showNextQuestion();
                }
            }
        });
    }

    private void showNextQuestion() {
        answer1.setTextColor(textColourDefaultRb);
        answer2.setTextColor(textColourDefaultRb);
        answer3.setTextColor(textColourDefaultRb);
        answer4.setTextColor(textColourDefaultRb);
        radioGroup.clearCheck();

        if(questionCounter<questionCountTotal){
            currentQuestion=questionList.get(questionCounter);

            question.setText(currentQuestion.getQuestion());
            answer1.setText(currentQuestion.getOptionl());
            answer2.setText(currentQuestion.getOption2());
            answer3.setText(currentQuestion.getOption3());
            answer4.setText(currentQuestion.getOption4());
            questionCounter++;
            count.setText("Queston" + questionCounter + "/" +questionCountTotal);
            answered=false;
            next.setText("confirm");

            timeLeftInMillis =COUNTDOWN_IN_MILLIS;
            startCountDown();

        }
        else {
            finishQuiz();
        }

    }

    private void startCountDown() {
        countDownTimer=new CountDownTimer(timeLeftInMillis,1000){

            @Override
            public void onTick(long l) {
                timeLeftInMillis=l;
                updateCountDownNext();
            }

            @Override
            public void onFinish() {

                timeLeftInMillis=0;
                updateCountDownNext();
                checkAnswer();
            }
        }.start();
    }
    private void updateCountDownNext(){
        int minutes=(int)(timeLeftInMillis/1000)/60;
        int seconds=(int)(timeLeftInMillis/1000)%60;

        String timeFormatted=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        countdown.setText(timeFormatted);

        if(timeLeftInMillis<10000){
            countdown.setTextColor(Color.RED);
        }
        else {
            countdown.setTextColor(textColorDefaultCd);
        }
    }

    private void checkAnswer(){
        answered=true;
        countDownTimer.cancel();

        RadioButton rbSelected=findViewById(radioGroup.getCheckedRadioButtonId());

        int answer=radioGroup.indexOfChild(rbSelected)+1;
        if(answer==currentQuestion.getAnswer()){
            Testscore++;
            score.setText("Score :" +Testscore);
        }
        showSolution();
    }

    private void showSolution() {
        answer1.setTextColor(Color.RED);
        answer2.setTextColor(Color.RED);
        answer3.setTextColor(Color.RED);
        answer4.setTextColor(Color.RED);
        switch (currentQuestion.getAnswer()) {
            case 1:
                answer1.setTextColor(Color.GREEN);
                question.setText("ANSWER 1");
                break;

            case 2:
                answer2.setTextColor(Color.GREEN);
                question.setText("ANSWER 2");
                break;

            case 3:
                answer3.setTextColor(Color.GREEN);
                question.setText("ANSWER 3");
                break;
            case 4:
                answer4.setTextColor(Color.GREEN);
                question.setText("ANSWER 4");
                break;

        }
        if (questionCounter<questionCountTotal){
            next.setText("NEXT");
        }
        else {
            next.setText("FINISH");
        }
    }


    private void finishQuiz() {
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer!=null){
            countDownTimer.cancel();
        }
    }
}


