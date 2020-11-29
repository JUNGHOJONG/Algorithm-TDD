package com.backjoon.simulation;
/*
 * 영화감독 숌
 * version 1.0
 * 2020.11.29
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon1436 {

    public static void main(String[] args) throws IOException {
        Solution_Backjoon1436 processCommand = new Solution_Backjoon1436();
        System.out.println(processCommand.solution());
    }

    public static int main(int targetSeriesNumber){
        Solution_Backjoon1436 processCommand = new Solution_Backjoon1436();
        return processCommand.solution(targetSeriesNumber);
    }
}

class Solution_Backjoon1436 {
    private static final int INITIAL_END_NUMBER = 666;
    private static final char END_NUMBER_DIGIT = '6';

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int solution() throws IOException {
        int targetSeriesNumber = Integer.parseInt(br.readLine());
        int endNumber = INITIAL_END_NUMBER;
        int seriesNumber = 0;

        while(true){
            if(isEndNumber(String.valueOf(endNumber))){
                seriesNumber++;
            }
            if(targetSeriesNumber == seriesNumber){
                break;
            }
            endNumber++;
        }

        return endNumber;
    }

    public int solution(int targetSeriesNumber) {
        int endNumber = INITIAL_END_NUMBER;
        int seriesNumber = 0;

        while(true){
            if(isEndNumber(String.valueOf(endNumber))){
                seriesNumber++;
            }
            if(targetSeriesNumber == seriesNumber){
                break;
            }
            endNumber++;
        }

        return endNumber;
    }

    public boolean isEndNumber(String endNumber){
        for(int i=0; i<endNumber.length() - 2; i++){
            if(endNumber.charAt(i) == END_NUMBER_DIGIT
                    && endNumber.charAt(i + 1) == END_NUMBER_DIGIT
                    && endNumber.charAt(i + 2) == END_NUMBER_DIGIT){
                return true;
            }
        }
        return false;
    }
}