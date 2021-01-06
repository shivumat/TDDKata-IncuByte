package com.tdd_kata.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task9Test extends TestCase {

    public void testAdd() {

        //given
        String numbers = "//[***][^^]\n1***2^^3***9^^5";
        Task9 task = new Task9();

        //when
        int result = task.Add(numbers);

        //then
        Assert.assertEquals(20, result);
    }
}