package com.backjoon.combination;
/*
 * Backjoon14889
 * version 1.0
 * 2020.10.30
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon14889 {
    // 백준 제출용 함수
    public static void main(String[] args) throws IOException{
        Solution_Backjoon14889 processCommand = new Solution_Backjoon14889();
        processCommand.solution();
    }
    // test 함수
    public int main(int personCount, int[][] score) throws IOException{
        Solution_Backjoon14889 processCommand = new Solution_Backjoon14889();
        return processCommand.solution(personCount, score);
    }
}

class Solution_Backjoon14889{
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int[][] abilityValue;
    private boolean[] visited;
    private int minValue = Integer.MAX_VALUE;
    private int abilityValueSize;

    // 백준 제출용 함수
    public void solution() throws IOException {
        abilityValueSize = Integer.parseInt(br.readLine());
        initAbilityValue();
        visited = new boolean[abilityValueSize+1];
        combination(0, 1);
        System.out.println(minValue);
    }

    // test 함수
    public int solution(int N, int[][] score) throws IOException {
        abilityValueSize = N;
        abilityValue = score;
        visited = new boolean[abilityValueSize+1];
        combination(0, 1);
        return minValue;
    }

    public void initAbilityValue() throws IOException{
        abilityValue = new int[abilityValueSize+1][abilityValueSize+1];
        for(int i=1; i<=abilityValueSize; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=abilityValueSize; j++){
                abilityValue[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public void combination(int count, int index){
        if(count == abilityValueSize / 2){
            int difference = getDifferenceOfStartTeamAndLinkTeam();
            minValue = Math.min(minValue, difference);
            return;
        }
        for(int i=index; i<=abilityValueSize; i++){
            visited[i] = true;
            combination(count + 1, i + 1);
            visited[i] = false;
        }
    }

    public int getDifferenceOfStartTeamAndLinkTeam(){
        int sumOfStartTeam = getSumOfStartTeam();
        int sumOfLinkTeam = getSumOfLinkTeam();
        return Math.abs(sumOfStartTeam - sumOfLinkTeam);
    }

    public int getSumOfStartTeam(){
        int sumOfStartTeam = 0;
        for(int i=1; i<=abilityValueSize; i++){
            for(int j=1; j<=abilityValueSize; j++){
                if(visited[i] && visited[j]){
                    sumOfStartTeam += abilityValue[i][j];
                }
            }
        }
        return sumOfStartTeam;
    }

    public int getSumOfLinkTeam(){
        int sumOfLinkTeam = 0;
        for(int i=1; i<=abilityValueSize; i++){
            for(int j=1; j<=abilityValueSize; j++){
                if(!visited[i] && !visited[j]){
                    sumOfLinkTeam += abilityValue[i][j];
                }
            }
        }
        return sumOfLinkTeam;
    }
}