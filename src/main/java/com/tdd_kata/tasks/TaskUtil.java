package com.tdd_kata.tasks;

import java.util.List;

public class TaskUtil {

    public static final String WHITE_SPACE = "\\s+";
    public static final String EMPTY = "";
    public static final int ZERO = 0;

    public static String removeWhiteSpace(String string) {
        return string.replaceAll(WHITE_SPACE, EMPTY);
    }

    public static int addListOfNumbersAsString(List<String> numberList, int limit) {
        int result = ZERO;
        try {
            for (int i = 0; i < limit; i++) {
                result += Integer.parseInt(numberList.get(i));
            }
        }catch (Exception e){
            System.out.println("Not correct Input.");
            return -1;
        }
        return result;
    }

}
