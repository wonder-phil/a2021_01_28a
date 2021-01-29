package me.pgb.a2021_01_28a.model;

import me.pgb.a2021_01_28a.R;

public class AllQuestions {

    private int currentQuestion = 0;

    public Question[] allQuestions = {
            new Question(R.string.q_conentinent,true),
            new Question(R.string.q_seas,false)
    };

}
