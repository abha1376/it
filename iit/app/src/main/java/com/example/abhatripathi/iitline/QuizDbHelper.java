package com.example.abhatripathi.iitline;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.abhatripathi.iitline.QuizContract.*;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME="Quiz.db";
    private static final int DATABASE_VERSION=1;


    private SQLiteDatabase db;


    public QuizDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db=db;

        final String SQL_CREATE_QUESTIONS_TABLE="CREATE TABLE "  +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                QuestionTable.COLUMN_QUESTION +" TEXT, "+
                QuestionTable.COLUMN_OPTION1 +" TEXT, " +
                QuestionTable.COLUMN_OPTION2 +" TEXT, " +
                QuestionTable.COLUMN_OPTION3 +" TEXT, " +
                QuestionTable.COLUMN_OPTION4 +" TEXT, " +
                QuestionTable.COLUMN_ANSWER +" INTEGER " +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);

        fillQuestionsTable();

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS "+ QuestionTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        TestQuestion q1=new TestQuestion("A is correct","A","B","C","D",1);
        addQuestion(q1);
        TestQuestion q2=new TestQuestion("B is correct","A","B","C","D",2);
        addQuestion(q2);
        TestQuestion q3=new TestQuestion("C is correct","A","B","C","D",3);
        addQuestion(q3);
        TestQuestion q4=new TestQuestion("A is correct again","A","B","C","D",1);
        addQuestion(q4);
        TestQuestion q5=new TestQuestion("B is correct again","A","B","C","D",2);
        addQuestion(q5);
    }

    private void addQuestion(TestQuestion question){
        ContentValues cv=new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION,question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1,question.getOptionl());
        cv.put(QuestionTable.COLUMN_OPTION2,question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3,question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4,question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER,question.getAnswer());

        db.insert(QuestionTable.TABLE_NAME,null,cv);

    }

    public List<TestQuestion> getAllQuestions(){
        List<TestQuestion> questionList =new ArrayList<>();
        db=getReadableDatabase();
        Cursor c=db.rawQuery("SELECT * FROM "+ QuestionTable.TABLE_NAME,null);

        if (c.moveToFirst()){
            do {
                TestQuestion question=new TestQuestion();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOptionl(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswer(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}

