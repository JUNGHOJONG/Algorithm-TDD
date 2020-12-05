package com.backjoon.simulation;
/*
 * 제로
 * version 1.0
 * 2020.12.05
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon10773 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon10773 processCommand = new Solution_Backjoon10773();
        processCommand.solution();
    }

    public int main(int[] moneyBook) {
        Solution_Backjoon10773 processCommand = new Solution_Backjoon10773();
        return processCommand.solution(moneyBook);
    }
}

class Solution_Backjoon10773 {
    private static int WRONG_DICTATION = 0;

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int solution() throws IOException {
        int dictationCount = Integer.parseInt(br.readLine());
        Stack<Integer> moneyManagement = new Stack<>();

        for (int i=0; i<dictationCount; i++) {
            int money = Integer.parseInt(br.readLine());
            if (money == WRONG_DICTATION) {
                moneyManagement.pop();
                continue;
            }
            moneyManagement.push(money);
        }
        return sumOfMoney(moneyManagement);
    }

    public int solution(int[] moneyBook) {
        Stack<Integer> moneyManagement = new Stack<>();
        for (int money : moneyBook) {
            if (money == WRONG_DICTATION) {
                moneyManagement.pop();
                continue;
            }
            moneyManagement.push(money);
        }
        return sumOfMoney(moneyManagement);
    }

    private int sumOfMoney(Stack<Integer> moneyManagement) {
        int sumOfMoney = 0;
        while (!moneyManagement.isEmpty()) {
            sumOfMoney += moneyManagement.pop();
        }
        return sumOfMoney;
    }
}
