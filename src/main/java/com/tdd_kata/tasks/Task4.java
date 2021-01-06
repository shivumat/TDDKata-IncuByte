package com.tdd_kata.tasks;

public class Task4 {

    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final String DEFAULT_DELIMITER = ",";
    private String delimiter = DEFAULT_DELIMITER;

    public int Add(String numbers){
        String numbersString = numbers;
        if(numbers.startsWith("//")){

            //delimiter index is just before the \n character
            int delimiterIndex = numbers.indexOf("\n") - ONE;

            //number starts 2 index after the delimiter
            int numberStartingIndex = delimiterIndex + TWO;
            numbersString = numbers.substring(numberStartingIndex);

            String newDelimiter = numbers.substring(delimiterIndex,delimiterIndex+ONE);
            setDelimiter(newDelimiter);

            numbersString = numbersString.replaceAll(delimiter,DEFAULT_DELIMITER);
        }
        Task3 task = new Task3();
        return task.Add(numbersString);
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }
}
