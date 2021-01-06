package com.tdd_kata.tasks;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static final String WHITE_SPACE = "\\s+";
    public static final String EMPTY = "";
    private int addLimit = 2;

    public int Add(String numbers){
        int result = 0;
        String numbersWithoutSpace = removeWhiteSpace(numbers);
        if(numbersWithoutSpace.isEmpty()){
            return 0;
        }
        List<String> numberList = Arrays.asList(numbersWithoutSpace.split(","));
        try {
            if(numberList.size() == 1){
                return Integer.parseInt(numberList.get(0));
            }
        }catch (Exception e){
            System.out.println("Not correct Input.");
            return -1;
        }
        return result;
    }

    public void setAddLimit(int addLimit) {
        this.addLimit = addLimit;
    }

    private String removeWhiteSpace(String string) {
        return string.replaceAll(WHITE_SPACE, EMPTY);
    }
}
