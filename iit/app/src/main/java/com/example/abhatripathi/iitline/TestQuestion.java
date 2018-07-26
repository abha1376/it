package com.example.abhatripathi.iitline;

public class TestQuestion {
    private String question;
    private String optionl;
    private String option2;
    public TestQuestion() {
    }

    public TestQuestion(String question, String optionl, String option2, String option3, String option4, int answer) {
        this.question = question;
        this.optionl = optionl;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    private String option3;
    private String option4;
    private int answer;





    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionl() {
        return optionl;
    }

    public void setOptionl(String optionl) {
        this.optionl = optionl;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }
    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}


