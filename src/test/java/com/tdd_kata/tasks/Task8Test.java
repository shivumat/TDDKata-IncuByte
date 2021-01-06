package com.tdd_kata.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task8Test extends TestCase {

    public void testAdd() {

        //given
        String numbers = "//[*][^]\n1*2^3*9^5";
        Task8 task = new Task8();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(20, result);
    }
}