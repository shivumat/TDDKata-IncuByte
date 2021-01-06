package com.tdd_kata.tasks;

import com.tdd_kata.exceptions.NegativeNumberException;

import java.util.List;

public class Task5 {

    private List<Integer> numbers;

    public int Add(String numbersAsString) throws NegativeNumberException {
        Task4 task = new Task4();
        int result = task.Add(numbersAsString);
        numbers = task.getNumbers();
        List negativeNumbers = TaskUtil.listContainsNegativeNumber(numbers);
        if(negativeNumbers.size() != 0){
            throw new NegativeNumberException(negativeNumbers);
        }
        return result;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
