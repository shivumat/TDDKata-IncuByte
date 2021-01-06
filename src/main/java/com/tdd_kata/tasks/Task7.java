package com.tdd_kata.tasks;

import java.util.List;

public class Task7 {

    public static final int ONE = 1;
    public static final String DEFAULT_DELIMITER = ",";
    public static final String BRACKET_OPEN = "[";
    public static final String BRACKET_CLOSE = "]";
    private String delimiter = DEFAULT_DELIMITER;
    private List<Integer> numbers;

    public int Add(String numbersAsString){
        String numbersString = numbersAsString;
        if(numbersAsString.startsWith("//")){

            int newLineIndex = numbersAsString.indexOf("\n");

            //number starts 2 index after the delimiter
            int numberStartingIndex = newLineIndex + ONE;
            numbersString = numbersAsString.substring(numberStartingIndex);

            //delimiter will start after first [ and end before first ]
            int bracketOpenIndex = numbersAsString.indexOf(BRACKET_OPEN);
            int bracketCloseIndex = numbersAsString.indexOf(BRACKET_CLOSE);
            String newDelimiter = numbersAsString.substring(bracketOpenIndex+ONE,bracketCloseIndex);
            setDelimiter(newDelimiter);

            numbersString = numbersString.replaceAll(delimiter,DEFAULT_DELIMITER);
        }
        Task6 task = new Task6();
        int result = task.Add(numbersString);
        numbers = task.getNumbers();
        return result;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setDelimiter(String delimiter) {
        delimiter = TaskUtil.addScapeCharacterForSpecialSymbols(delimiter);
        this.delimiter = delimiter;
    }
}
