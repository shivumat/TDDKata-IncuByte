package com.tdd_kata;

import com.tdd_kata.tasks.Task1;
import com.tdd_kata.tasks.Task2;
import com.tdd_kata.tasks.Task3;
import com.tdd_kata.tasks.Task4;

public class TDDKataIncubyte {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.Add(""));//shall output 0
        System.out.println(task1.Add("2"));//shall output 2
        System.out.println(task1.Add("3,4"));//shall output 7

        Task2 task2 = new Task2();
        System.out.println(task2.Add("2,1,4,5,3"));//shall output 15

        Task3 task3 = new Task3();
        System.out.println(task3.Add("2\n1,4\n5,3"));//shall output 15

        Task4 task4 = new Task4();
        System.out.println(task4.Add("//;\n1;2;3;9"));//shall output 15

    }

}
