package com.tdd_kata.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task4Test extends TestCase {

    public void testAddCustomDelimiter() {

        //given
        String numbers = "//;\n1;2;3;9";
        Task4 task = new Task4();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(15, result);
    }
}