package com.backjoon.dp;
/*
 * Backjoon2096
 * version 1.0
 * 2020.11.11
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon2096 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon2096 processCommand = new Solution_Backjoon2096();
        processCommand.solution();
    }

    public String main(int[][] scores){
        Solution_Backjoon2096 processCommand = new Solution_Backjoon2096();
        return processCommand.solution(scores);
    }
}

class Solution_Backjoon2096{

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void solution() throws IOException {
        int rowSize = Integer.parseInt(br.readLine());
        int[][] scores = initScores(rowSize);
        System.out.println(getOutput(scores));
    }

    public int[][] initScores(int rowSize) throws IOException{
        int[][] scores = new int[rowSize][3];
        for(int i=0; i<rowSize; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                scores[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return scores;
    }

    public String solution(int[][] scores){
         return getOutput(scores);
    }

    public String getOutput(int[][] scores){
         return getMaxScore(scores) + " " + getMinScore(scores);
    }

    public int getMaxScore(int[][] scores){
         int rowSize = scores.length;
         int colSize = scores[0].length;
         int[][] sum = new int[rowSize][colSize];
         sum[0][0] = scores[0][0];
         sum[0][1] = scores[0][1];
         sum[0][2] = scores[0][2];

         for(int i=1; i<rowSize; i++){
             sum[i][0] = scores[i][0] + Math.max(sum[i-1][0], sum[i-1][1]);
             sum[i][1] = scores[i][1] + Math.max(sum[i-1][0], Math.max(sum[i-1][1], sum[i-1][2]));
             sum[i][2] = scores[i][2] + Math.max(sum[i-1][1], sum[i-1][2]);
         }
         return Math.max(sum[rowSize-1][0], Math.max(sum[rowSize-1][1], sum[rowSize-1][2]));
    }

    public int getMinScore(int[][] scores){
         int rowSize = scores.length;
         int colSize = scores[0].length;
         int[][] sum = new int[rowSize][colSize];
         sum[0][0] = scores[0][0];
         sum[0][1] = scores[0][1];
         sum[0][2] = scores[0][2];

         for(int i=1; i<rowSize; i++){
             sum[i][0] = scores[i][0] + Math.min(sum[i-1][0], sum[i-1][1]);
             sum[i][1] = scores[i][1] + Math.min(sum[i-1][0], Math.min(sum[i-1][1], sum[i-1][2]));
             sum[i][2] = scores[i][2] + Math.min(sum[i-1][1], sum[i-1][2]);
         }
         return Math.min(sum[rowSize-1][0], Math.min(sum[rowSize-1][1], sum[rowSize-1][2]));
    }

}
