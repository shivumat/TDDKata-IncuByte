package com.tdd_kata.tasks;

public class Task3 {

    public int Add(String numbers){
        Task2 task = new Task2();
        return task.Add(numbers.replace("\n",","));
    }
}
