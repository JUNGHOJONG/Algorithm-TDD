package com.backjoon.dfs;
/*
 * 리모컨
 * version 1.0
 * 2020.11.28
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Backjoon1107 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon1107 processCommand = new Solution_Backjoon1107();
        processCommand.solution();
    }

    public static int main(int page, int[] broken){
        Solution_Backjoon1107 processCommand = new Solution_Backjoon1107();
        return processCommand.solution(page, broken);
    }

}

class Solution_Backjoon1107 {
    private static final int INITIAL_PAGE = 100;

    private List<Integer> notBroken;
    private StringBuilder numbers = new StringBuilder();
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int minValue = Integer.MAX_VALUE;
    private int end;

    public void solution() throws IOException {
        int page = Integer.parseInt(br.readLine());
        minValue = Math.abs(page - INITIAL_PAGE);

        int brokenCount = Integer.parseInt(br.readLine());
        int[] broken = getBroken(brokenCount);

        notBroken = getNotBroken(broken);
        end = String.valueOf(page).length();
        dfs(0, page);
        System.out.println(minValue);
    }

    public int solution(int page, int[] broken){
        minValue = Math.abs(page - INITIAL_PAGE);
        notBroken = getNotBroken(broken);
        end = String.valueOf(page).length();
        dfs(0, page);
        return minValue;
    }

    public int[] getBroken(int brokenCount) throws IOException{
        int[] broken = new int[brokenCount];
        if(brokenCount == 0) {
            return broken;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<brokenCount; i++){
            broken[i] = Integer.parseInt(st.nextToken());
        }

        return broken;
    }

    public List<Integer> getNotBroken(int[] broken){
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<=9; i++) {
            boolean check = true;
            for (int value : broken) {
                if (i == value) {
                    check = false;
                    break;
                }
            }
            if(check) {
                list.add(i);
            }
        }

        return list;
    }

    public void dfs(int depth, int page){
        if (!numbers.toString().equals("")) {
            int pressCount = Math.abs(Integer.parseInt(numbers.toString()) - page) + depth;
            minValue = Math.min(minValue, pressCount);
        }

        if (depth == end + 1) {
            return;
        }

        for (Integer integer : notBroken) {
            numbers.append(integer);
            dfs(depth + 1, page);
            numbers.deleteCharAt(numbers.length() - 1);
        }
    }
}