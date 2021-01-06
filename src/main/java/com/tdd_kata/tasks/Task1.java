package com.tdd_kata.tasks;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static final int ONE = 1;
    public static final int ZERO = 0;
    private int addLimit = 2;

    public int Add(String numbers){
        int result = ZERO;
        String numbersWithoutSpace = TaskUtil.removeWhiteSpace(numbers);
        if(numbersWithoutSpace.isEmpty()){
            return result;
        }
        List<String> numberList = Arrays.asList(numbersWithoutSpace.split(","));
        try {
            int limit = numberList.size() == ONE ? ONE : addLimit;
            for (int i = 0; i < limit; i++) {
                result += Integer.parseInt(numberList.get(i));
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
}
