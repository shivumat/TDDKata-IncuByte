package com.tdd_kata.tasks;

import java.util.List;

public class Task3 {

    private List<Integer> numbers;

    public int Add(String numbersAsString){
        Task2 task = new Task2();
        int result = task.Add(numbersAsString.replace("\n",","));
        numbers = task.getNumbers();
        return result;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
