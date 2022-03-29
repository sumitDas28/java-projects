package com.github.sumitdas28.solid.openclosed.good;

public class InterviewQuestionProcessor {

    public static void process(InterviewQuestion question){
        // this is loosely couple. pure abstraction.
        question.execute();
    }
}
