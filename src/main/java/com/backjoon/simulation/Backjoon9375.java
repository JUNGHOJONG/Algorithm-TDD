package com.backjoon.simulation;
/*
 * 패션왕 신해빈
 * version 1.0
 * 2020.12.08
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Backjoon9375 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon9375 processCommand = new Solution_Backjoon9375();
        processCommand.solution();
    }

    public int main(String[][] clothes) {
        Solution_Backjoon9375 processCommand = new Solution_Backjoon9375();
        return processCommand.solution(clothes);
    }
}

class Solution_Backjoon9375 {
    private static final int NUDE_STATE = 1;

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int solution(String[][] clothes) {
        Map<String, Integer> clothesManagement = new HashMap<>();
        for (String[] cloth : clothes) {
            if (clothesManagement.containsKey(cloth[1])) {
                clothesManagement.put(cloth[1], clothesManagement.get(cloth[1]) + 1);
                continue;
            }
            clothesManagement.put(cloth[1], 1);
        }
        int totalCount = 1;
        for (Integer clothCount : clothesManagement.values()) {
            totalCount *= (clothCount + NUDE_STATE);
        }
        return totalCount - NUDE_STATE;
    }

    public void solution() throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        for (int i=0; i<testCase; i++) {
            int clothCount = Integer.parseInt(br.readLine());
            List<Integer> clothes = initClothes(clothCount);
            int totalCount = 1;
            for (Integer cloth : clothes) {
                totalCount *= (cloth + NUDE_STATE);
            }
            System.out.println(totalCount - NUDE_STATE);
        }
    }

    private List<Integer> initClothes(int clothCount) throws IOException{
        Map<String, Integer> clothes = new HashMap<>();
        for (int i=0; i<clothCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String clothName = st.nextToken();
            String clothState = st.nextToken();
            if (clothes.containsKey(clothState)) {
                clothes.put(clothState, clothes.get(clothState) + 1);
                continue;
            }
            clothes.put(clothState, 1);
        }
        return new ArrayList<>(clothes.values());
    }
}
