package com.tdd_kata.tasks;

public class Task1 {

    public static final String WHITE_SPACE = "\\s+";
    public static final String EMPTY = "";

    public int Add(String numbers){
        String numbersWithoutSpace = removeWhiteSpace(numbers);
        if(numbersWithoutSpace.isEmpty()){
            return 0;
        }
        return -1;
    }

    private String removeWhiteSpace(String string) {
        return string.replaceAll(WHITE_SPACE, EMPTY);
    }
}
