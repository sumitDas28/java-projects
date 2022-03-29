package com.github.sumitdas28.solid.openclosed.bad;

public class InterviewQuestionProcessor {

    public static void process(InterviewQuestion question){
        if(question instanceof JavaInterviewQuestions){
            JavaInterviewQuestions jq = (JavaInterviewQuestions) question;
            jq.executeJava();
        }else if(question instanceof JavascriptInterviewQuestions){
            JavascriptInterviewQuestions jsq = (JavascriptInterviewQuestions) question;
            jsq.executeJavascript();
        }else if(question instanceof PythonInterviewQuestions){
            PythonInterviewQuestions pq = (PythonInterviewQuestions) question;
            pq.executePython();
        }
    }
}
