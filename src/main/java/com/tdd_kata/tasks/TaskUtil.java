package com.tdd_kata.tasks;

public class TaskUtil {

    public static final String WHITE_SPACE = "\\s+";
    public static final String EMPTY = "";

    public static String removeWhiteSpace(String string) {
        return string.replaceAll(WHITE_SPACE, EMPTY);
    }
}
