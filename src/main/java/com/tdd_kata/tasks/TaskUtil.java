package com.tdd_kata.tasks;

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

    public static int addListOfNumbersAsString(List<String> numberList) {
        List<Integer> numbers = new ArrayList<>();
        try {
            numbers = numberList.stream().map(string -> Integer.parseInt(string)).collect(Collectors.toList());
        }catch (Exception e){
            System.out.println("Not correct Input.");
            return -1;
        }
        return numbers.stream().reduce(0, (first, second) -> first + second);
    }

}
