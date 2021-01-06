package com.tdd_kata.tasks;

import java.util.List;

public class Task2 {

    private List<Integer> numbers;

    public int Add(String numbersAsString){
        Task1 task = new Task1();
        int result = task.Add(numbersAsString);
        numbers = task.getNumbers();
        return result;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
