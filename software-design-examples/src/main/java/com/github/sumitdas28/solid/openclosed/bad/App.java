package com.github.sumitdas28.solid.openclosed.bad;

public class App {
    public static void main(String[] args) {
        InterviewQuestionProcessor.process(new JavaInterviewQuestions());
        InterviewQuestionProcessor.process(new JavascriptInterviewQuestions());
        InterviewQuestionProcessor.process(new PythonInterviewQuestions());
    }
}
