package com.backjoon.simulation;
/*
 * 행운의 티켓
 * version 1.0
 * 2020.12.20
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon1639 {
    public static void main(String[] args) throws IOException {
        Solution_Backjoon1639 processCommand = new Solution_Backjoon1639();
        processCommand.solution();
    }
}

class Solution_Backjoon1639 {
    private static final int LENGTH_INCREASE_UNIT = 2;

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws IOException {
        int max = 0;
        String ticket = br.readLine();
        for (int length=LENGTH_INCREASE_UNIT; length<=ticket.length(); length+=LENGTH_INCREASE_UNIT) {
            for (int i=0; i<=ticket.length()-length; i++) {
                int sum = 0;
                for (int j=i; j<i+length/LENGTH_INCREASE_UNIT; j++) {
                    sum += ticket.charAt(j) - '0';
                }
                for (int j=i+length/LENGTH_INCREASE_UNIT; j<i+length; j++) {
                    sum -= ticket.charAt(j) - '0';
                }
                if (sum == 0) {
                    max = Math.max(max, length);
                }
            }
        }
        System.out.println(max);
    }
}
