package com.tdd_kata.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task2Test extends TestCase {

    public void testAddStringWithNNumber() {

        //given
        String numbers = "1,2,3,4,5,6,7";
        Task2 task = new Task2();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(28, result);
    }

}