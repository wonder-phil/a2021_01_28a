package me.pgb.a2021_01_28a.model;

public class Question {

    private int index;
    private boolean isAnswerTrue;

    public Question(int id, boolean isTrue){
        index = id;
        isAnswerTrue = isTrue;
    }
}
