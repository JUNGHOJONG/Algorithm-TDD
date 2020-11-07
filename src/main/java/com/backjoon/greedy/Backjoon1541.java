package com.backjoon.greedy;
/*
 * Backjoon1541
 * version 1.0
 * 2020.11.07
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Backjoon1541 {
    public static void main(String[] args) throws IOException{
        Solution_Backjoon1541 processCommand = new Solution_Backjoon1541();
        processCommand.solution();
    }
    public int main(String input){
        Solution_Backjoon1541 processCommand = new Solution_Backjoon1541();
        return processCommand.solution(input);
    }
}

class Solution_Backjoon1541{
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 백준 제출용
    public void solution() throws IOException {
        String input = br.readLine();
        ArrayList<String> splits = getSplitOfInput(input);
        Stack<String> plusFilteredStorage = calculatePlus(splits);
        Stack<String> minusFilteredStorage = calculateMinus(plusFilteredStorage);
        System.out.println(getSumOfAllNumber(minusFilteredStorage));
    }

    // 테스트 용
    public int solution(String input){
        ArrayList<String> splits = getSplitOfInput(input);
        Stack<String> plusFilteredStorage = calculatePlus(splits);
        Stack<String> minusFilteredStorage = calculateMinus(plusFilteredStorage);
        return getSumOfAllNumber(minusFilteredStorage);
    }

    public ArrayList<String> getSplitOfInput(String input){
        Pattern pattern = Pattern.compile("\\d+|[-+]");
        Matcher matcher = pattern.matcher(input);
        ArrayList<String> splits = new ArrayList<>();
        while(matcher.find()){
            splits.add(matcher.group(0));
        }
        return splits;
    }

    public Stack<String> calculatePlus(ArrayList<String> splits){
        Stack<String> plusFilteredStorage = new Stack<>();
        for(int i=0; i<splits.size(); i++){
            if(splits.get(i).equals("+")){
                int number1 = Integer.parseInt(plusFilteredStorage.pop());
                int number2 = Integer.parseInt(splits.get(i + 1));
                plusFilteredStorage.push((number1 + number2) + "");
                i++;
                continue;
            }
            plusFilteredStorage.push(splits.get(i));
        }
        return plusFilteredStorage;
    }

    public Stack<String> calculateMinus(Stack<String> plusFilteredStorage){
        Stack<String> minusFilteredStorage = new Stack<>();
        for(int i=0; i<plusFilteredStorage.size(); i++){
            if(plusFilteredStorage.get(i).equals("-")){
                int number = Integer.parseInt(plusFilteredStorage.get(i + 1));
                minusFilteredStorage.push(-number + "");
                i++;
                continue;
            }
            minusFilteredStorage.push(plusFilteredStorage.get(i));
        }
        return minusFilteredStorage;
    }

    public int getSumOfAllNumber(Stack<String> minusFilteredStorage){
        int sum = 0;
        for(String s : minusFilteredStorage){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
