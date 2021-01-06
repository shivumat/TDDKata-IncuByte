package com.tdd_kata.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task3Test extends TestCase {

    public void testAddWithNewLineCharacter() {

        //given
        String numbers = "1,2\n3,4,5\n6,7";
        Task2 task = new Task2();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(28, result);
    }
}