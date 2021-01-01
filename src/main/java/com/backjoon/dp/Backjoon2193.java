package com.backjoon.dp;
/*
 * 이친수
 * version 1.0
 * 2021.01.02
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon2193 {

    public static void main(String[] args) throws IOException {
        Solution_Backjoon2193 processCommand = new Solution_Backjoon2193();
        processCommand.solution();
    }

    public long main(int pinaryNumberOfDigits) {
        Solution_Backjoon2193 processCommand = new Solution_Backjoon2193();
        return processCommand.solution(pinaryNumberOfDigits);
    }
}

class Solution_Backjoon2193 {
    private static final int ONE = 1;
    private static final int TWO = 2;

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws IOException {
        int pinaryNumberOfDigits = Integer.parseInt(br.readLine());
        long[] sum = new long[pinaryNumberOfDigits + ONE];
        System.out.println(getCountOfPinaryNumber(sum, pinaryNumberOfDigits));
    }

    public long solution(int pinaryNumberOfDigits) {
        long[] sum = new long[pinaryNumberOfDigits + ONE];
        return getCountOfPinaryNumber(sum, pinaryNumberOfDigits);
    }

    public long getCountOfPinaryNumber(long[] sum, int pinaryNumberOfDigits) {
        for (int i=1; i<=pinaryNumberOfDigits; i++) {
            if (i == ONE || i == TWO) {
                sum[i] = 1;
                continue;
            }
            sum[i] = sum[i - ONE] + sum[i - TWO];
        }
        return sum[pinaryNumberOfDigits];
    }
}
