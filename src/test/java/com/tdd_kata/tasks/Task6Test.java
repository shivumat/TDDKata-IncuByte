package com.tdd_kata.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task6Test extends TestCase {

    public void testAdd() {

        //given
        String numbers = "//;\n1;2;1003;9";
        Task6 task = new Task6();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(12, result);
    }
}