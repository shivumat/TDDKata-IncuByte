package com.tdd_kata;

import com.tdd_kata.tasks.Task1;
import com.tdd_kata.tasks.Task2;

public class TDDKataIncubyte {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.Add(""));//shall output 0
        System.out.println(task1.Add("2"));//shall output 2
        System.out.println(task1.Add("3,4"));//shall output 7

        Task2 task2 = new Task2();
        System.out.println(task2.Add("2,1,4,6,3"));//shall output 15
    }

}
