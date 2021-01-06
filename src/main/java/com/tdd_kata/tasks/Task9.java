package com.tdd_kata.tasks;

import java.util.List;

public class Task9 {

    public static final int ONE = 1;
    public static final String DEFAULT_DELIMITER = ",";
    public static final String BRACKET_OPEN = "[";
    public static final String BRACKET_CLOSE = "]";
    public static final int ZERO = 0;
    private String delimiter = DEFAULT_DELIMITER;
    private List<Integer> numbers;

    public int Add(String numbersAsString){
        String numbersString = numbersAsString;
        if(numbersAsString.startsWith("//")){

            int newLineIndex = numbersAsString.indexOf("\n");

            //number starts 1 index after the newLine char
            int numberStartingIndex = newLineIndex + ONE;
            numbersString = numbersAsString.substring(numberStartingIndex);

            //all delimiters will start after first [ and end before first ]
            int bracketOpenIndex = numbersAsString.indexOf(BRACKET_OPEN)+ONE;
            int bracketCloseIndex = numbersAsString.indexOf(BRACKET_CLOSE);
            while (bracketOpenIndex > ZERO) {
                String newDelimiter = numbersAsString.substring(bracketOpenIndex, bracketCloseIndex);
                setDelimiter(newDelimiter);
                bracketOpenIndex = numbersAsString.indexOf(BRACKET_OPEN, bracketOpenIndex)+ONE;
                bracketCloseIndex = numbersAsString.indexOf(BRACKET_CLOSE, bracketCloseIndex + ONE);
                numbersString = numbersString.replaceAll(delimiter, DEFAULT_DELIMITER);
            }
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
