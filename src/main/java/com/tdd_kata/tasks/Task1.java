package com.tdd_kata.tasks;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static final int ONE = 1;
    public static final int ZERO = 0;
    private int addLimit = 2;

    public int Add(String numbers){
        String numbersWithoutSpace = TaskUtil.removeWhiteSpace(numbers);
        if(numbersWithoutSpace.isEmpty()){
            return ZERO;
        }
        List<String> numberList = Arrays.asList(numbersWithoutSpace.split(","));
        int limit = numberList.size() == ONE ? ONE : addLimit;
        return TaskUtil.addListOfNumbersAsString(numberList);
    }

    public void setAddLimit(int addLimit) {
        this.addLimit = addLimit;
    }
}
