package com.tdd_kata.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static final int ZERO = 0;
    private List<Integer> numbers;

    public int Add(String numbersAsString){
        String numbersWithoutSpace = TaskUtil.removeWhiteSpace(numbersAsString);
        if(numbersWithoutSpace.isEmpty()){
            return ZERO;
        }
        List<String> numberList = Arrays.asList(numbersWithoutSpace.split(","));
        numbers = new ArrayList<>();
        try {
            numbers = TaskUtil.extractNumbersOutOfString(numberList);
        }catch (NumberFormatException e){
            System.out.println("Not correct Input.");
            return -1;
        }
        return TaskUtil.addListOfNumbersAsString(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
