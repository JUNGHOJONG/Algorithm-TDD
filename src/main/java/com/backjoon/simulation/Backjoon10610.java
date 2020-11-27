package com.backjoon.simulation;
/*
 * 30
 * version 1.0
 * 2020.11.27
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Backjoon10610 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon10610 processCommand = new Solution_Backjoon10610();
        processCommand.solution();
    }

    public static String main(String numbersFoundOnTheRoad){
        Solution_Backjoon10610 processCommand = new Solution_Backjoon10610();
        return processCommand.solution(numbersFoundOnTheRoad);
    }

}

class Solution_Backjoon10610 {
    private static final char ZERO = '0';
    private static final int THREE = 3;
    private static final String NONEXISTENT_NUMBER = "-1";

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws IOException {
        String numbersFoundOnTheRoad = br.readLine();
        boolean checkMultiplicationOfThirty = false;
        if (isMultiplicationOfThirty(numbersFoundOnTheRoad)){
            checkMultiplicationOfThirty = true;
        }
        String maxMultiplicationOfThirty = getMaxMultiplicationOfThirty(numbersFoundOnTheRoad);
        System.out.println(checkMultiplicationOfThirty ? maxMultiplicationOfThirty : NONEXISTENT_NUMBER);
    }

    public String solution(String numbersFoundOnTheRoad) {
        boolean checkMultiplicationOfThirty = false;
        if (isMultiplicationOfThirty(numbersFoundOnTheRoad)){
            checkMultiplicationOfThirty = true;
        }
        String maxMultiplicationOfThirty = getMaxMultiplicationOfThirty(numbersFoundOnTheRoad);
        return checkMultiplicationOfThirty ? maxMultiplicationOfThirty : NONEXISTENT_NUMBER;
    }

    public boolean isMultiplicationOfThirty(String numbersFoundOnTheRoad){
        return haveZero(numbersFoundOnTheRoad) && isMultiplicationOfThree(numbersFoundOnTheRoad);
    }

    public boolean haveZero(String numbersFoundOnTheRoad){
        for (int i=0; i<numbersFoundOnTheRoad.length(); i++) {
            if (numbersFoundOnTheRoad.charAt(i) == ZERO) {
                return true;
            }
        }
        return false;
    }

    public boolean isMultiplicationOfThree(String numbersFoundOnTheRoad){
        int sumOfDigitNumber = 0;
        for (int i=0; i<numbersFoundOnTheRoad.length(); i++) {
            sumOfDigitNumber += numbersFoundOnTheRoad.charAt(i) - ZERO;
        }
        return sumOfDigitNumber % THREE == 0;
    }

    public String getMaxMultiplicationOfThirty(String numbersFoundOnTheRoad){
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<numbersFoundOnTheRoad.length(); i++) {
            numbers.add(numbersFoundOnTheRoad.charAt(i) - ZERO);
        }
        sortNumbers(numbers);
        return getNumbers(numbers);
    }

    public void sortNumbers(List<Integer> numbers){
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    public String getNumbers(List<Integer> numbers){
        StringBuilder sb = new StringBuilder();
        for (Integer number : numbers) {
            sb.append(number);
        }
        return sb.toString();
    }
}
