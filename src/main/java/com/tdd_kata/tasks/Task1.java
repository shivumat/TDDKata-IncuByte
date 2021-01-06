package com.tdd_kata.tasks;

public class Task1 {

    public static final String WHITE_SPACE = "\\s";
    public static final String EMPTY = "";

    public int Add(String numbers){
        if(numbers.replace(WHITE_SPACE, EMPTY).isEmpty()){
            return 0;
        }
        return -1;
    }
}
