package com.tdd_kata.tasks;

import java.util.List;

public class Task4 {

    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final String DEFAULT_DELIMITER = ",";
    private String delimiter = DEFAULT_DELIMITER;
    private List<Integer> numbers;

    public int Add(String numbersAsString){
        String numbersString = numbersAsString;
        if(numbersAsString.startsWith("//")){

            //delimiter index is just before the \n character
            int delimiterIndex = numbersAsString.indexOf("\n") - ONE;

            //number starts 2 index after the delimiter
            int numberStartingIndex = delimiterIndex + TWO;
            numbersString = numbersAsString.substring(numberStartingIndex);

            String newDelimiter = numbersAsString.substring(delimiterIndex,delimiterIndex+ONE);
            setDelimiter(newDelimiter);

            numbersString = numbersString.replaceAll(delimiter,DEFAULT_DELIMITER);
        }
        Task3 task = new Task3();
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
