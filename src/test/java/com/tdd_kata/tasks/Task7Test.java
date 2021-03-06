package com.tdd_kata.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task7Test extends TestCase {

    public void testAdd() {

        //given
        String numbers = "//[***]\n1***2***3***9";
        Task7 task = new Task7();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(15, result);
    }
}