package com.example.android.quizapp;

/**
 * Created by Kshitij Suri on 28-03-2018.
 */

public class Login_Databse {
    private String usernames [] = {
            "kshitij", "neetu", "ravi", "sona"
    };
    private String passwords [] = {
            "kshitij", "neetu", "ravi", "sona"
    };
    public String getString(int a){
        return usernames[a];
    }
    public String getPassword(int a){
        return passwords[a];
    }
}
