package com.tdd_kata.tasks;

public class Task2 {

    public int Add(String numbers){
        Task1 task = new Task1();
        task.setAddLimit(numbers.split(",").length);
        return task.Add(numbers);
    }
}
