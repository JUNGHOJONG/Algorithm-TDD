package com.backjoon.simulation;
/*
 * 햄버거 분배
 * version 1.0
 * 2020.11.16
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon19941 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon19941 processCommand = new Solution_Backjoon19941();
        processCommand.solution();
    }

    public static int main(int selectableDistance, String personAndHamburgerPosition){
        Solution_Backjoon19941 processCommand = new Solution_Backjoon19941();
        return processCommand.solution(selectableDistance, personAndHamburgerPosition);
    }

}

class Solution_Backjoon19941{

    private static final char HAMBURGER = 'H';
    private static final char PERSON = 'P';

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private boolean[] visited;

    public void solution() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tableLength = Integer.parseInt(st.nextToken());
        int selectableDistance = Integer.parseInt(st.nextToken());
        String personAndHamburgerPosition = br.readLine();
        visited = new boolean[tableLength];
        System.out.println(getMaxPersonOfEatableHamburger(selectableDistance, personAndHamburgerPosition));
    }

    public int solution(int selectableDistance, String personAndHamburgerPosition) {
        visited = new boolean[personAndHamburgerPosition.length()];
        return getMaxPersonOfEatableHamburger(selectableDistance, personAndHamburgerPosition);
    }

    public int getMaxPersonOfEatableHamburger(int selectableDistance,
                                                    String personAndHamburgerPosition){
        int tableLength = personAndHamburgerPosition.length();
        int count = 0;
        for(int i=0; i<tableLength; i++){
            if(personAndHamburgerPosition.charAt(i) != PERSON) continue;
            if(isEatableHamburger(i, selectableDistance, personAndHamburgerPosition)){
                count++;
            }
        }
        return count;
    }

    public boolean isEatableHamburger(int index, int selectableDistance, String position){
        int tableLength = position.length();
        for(int j=index-selectableDistance; j<=index+selectableDistance; j++){
            if(j < 0 || j >= tableLength) continue;
            if(!visited[j] && position.charAt(j) == HAMBURGER){
                visited[j] = true;
                return true;
            }
        }
        return false;
    }
}
