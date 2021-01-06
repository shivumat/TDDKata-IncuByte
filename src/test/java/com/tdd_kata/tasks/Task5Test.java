package com.tdd_kata.tasks;

import com.tdd_kata.exceptions.NegativeNumberException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task5Test extends TestCase {

    public void testAddForExceptionOnNegativeNumbers() {

        Throwable exception = null;

        //given
        String numbers = "1,-2\n3,4,5\n-6,7";
        Task5 task = new Task5();

        //when
        try {
            int result = task.Add(numbers);
        } catch (Throwable e) {
            exception = e;
        }

        Assert.assertEquals(exception.getMessage(), "Negative Values Not Allowed [-2, -6]");
        Assert.assertTrue(exception instanceof NegativeNumberException);
    }
}