package com.tdd_kata.tasks;

import com.tdd_kata.exceptions.NegativeNumberException;

import java.util.List;

public class Task6 {
    public static final int THOUSAND = 1000;
    private List<Integer> numbers;

    public int Add(String numbersAsString){
        Task5 task = new Task5();
        int result = 0;
        try {
            result = task.Add(numbersAsString);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
        if(result == -1 || result == 0){
            return result;
        }else {
            numbers = task.getNumbers();
            List numbersBelowThousand = TaskUtil.filterListWithMaxLimit(numbers, THOUSAND);
            return TaskUtil.addListOfNumbersAsString(numbersBelowThousand);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
