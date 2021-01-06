package com.tdd_kata.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task1Test extends TestCase {

    public void testAddEmptyString() {

        //given
        String numbers = "";
        Task1 task = new Task1();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(0, result);
    }

    public void testAddStringWithOneNumber() {

        //given
        String numbers = "1";
        Task1 task = new Task1();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(0, result);
    }

    public void testAddStringWithTwoNumber() {

        //given
        String numbers = "1,2";
        Task1 task = new Task1();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(3, result);
    }

}