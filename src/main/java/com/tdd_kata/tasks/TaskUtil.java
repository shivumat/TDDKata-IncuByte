package com.tdd_kata.tasks;

import com.tdd_kata.exceptions.NegativeNumberException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskUtil {

    public static final String WHITE_SPACE = "\\s+";
    public static final String EMPTY = "";
    public static final int ZERO = 0;

    public static String removeWhiteSpace(String string) {
        return string.replaceAll(WHITE_SPACE, EMPTY);
    }

    public static int addListOfNumbersAsString(List<Integer> numbers) {
        return numbers.stream().reduce(0, (first, second) -> first + second);
    }

    public static List<Integer> listContainsNegativeNumber(List<Integer> numbers) {
        return numbers.stream().filter(number -> number < 0).collect(Collectors.toList());
    }

    public static List<Integer> extractNumbersOutOfString(List<String> numberList) {
        return numberList.stream().map(string -> Integer.parseInt(string)).collect(Collectors.toList());
    }

}
