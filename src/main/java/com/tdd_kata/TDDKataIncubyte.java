package com.tdd_kata;

import com.tdd_kata.tasks.Task1;

public class TDDKataIncubyte {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.Add(""));//shall output 0
        System.out.println(task1.Add("2"));//shall output 2
        System.out.println(task1.Add("3,4"));//shall output 7
    }

}
