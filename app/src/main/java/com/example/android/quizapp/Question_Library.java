package com.example.android.quizapp;

/**
 * Created by Kshitij Suri on 28-03-2018.
 */

public class Question_Library {
    private String questions[] = {
            "When was Udacity Founded?",
            "Who founded Udacity",
            "Who is the current CEO of Udacity?",
            "From which month and year Udacity was launched and made available to general public?",
            "Where is Udacity India head office located?"

    };

    private String Choices [] [ ] = {
            { "April 2014" , "June 2011", "December 2010" , "February 2011"} ,
            {"Sebastian Thurn", "David Stavens", "Mike Sokolsky", "All of these"},
            {"Kshitij Suri", "Vishal Makhijani", "Sebastian Thurn" , "Larry Page"},
            {"June 2011", "December 2010", "Ferbuary 2012", "January 2013"},
            {"Delhi","Mumbai","Surat","Kolkata"}

    };
    private String answers [] = {"June 2011", "All of these", "Vishal Makhijani","Ferbuary 2012", "Delhi" };

    public String  getQuestions(int a) {

        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice1 = Choices[a][0];
        return choice1;
    }

    public String getchoice2(int a){
        String choice2 = Choices[a][1];
        return choice2;
    }

    public String getchoice3(int a){
        String choice3 = Choices[a][2];
        return choice3;
    }
    public String getchoice4(int a){
        String choice4 = Choices[a][3];
        return choice4;
    }

    public String getCorrectAnswer(int a){
        String answer = answers[a];
        return answer;
    }
}
