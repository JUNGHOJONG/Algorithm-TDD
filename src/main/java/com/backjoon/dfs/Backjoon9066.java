package com.backjoon.dfs;
/*
 * 금고(시간 초과)
 * version 1.0
 * 2020.11.17
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon9066 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon9066 processCommand = new Solution_Backjoon9066();
        processCommand.solution();
    }

    public static int main(int mapSize, Character[][] safe){
        Solution_Backjoon9066 processCommand = new Solution_Backjoon9066();
        return processCommand.solution(mapSize, safe);
    }

}

class Solution_Backjoon9066{

    private static final Character VERTICAL = 'V';
    private static final Character HORIZONTAL  = 'H';

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Character[][] safe;
    private Integer minCount = Integer.MAX_VALUE;
    private Boolean check = true;

    public void solution() throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++){
            Integer safeSize = Integer.parseInt(br.readLine());
            safe = new Character[safeSize][safeSize];
            initSafe(safeSize);
            for(int j = 1; j<=safeSize*safeSize && check; j++){
                openSafe(0, 0, safeSize, j);
            }
            check = true;
            System.out.println(minCount);
        }
    }

    public int solution(int mapSize, Character[][] tempSafe) {
        safe = tempSafe;
        for (int j = 1; j <= mapSize * mapSize && check; j++) {
            openSafe(0, 0, mapSize, j);
        }
        return minCount;
    }

    public void initSafe(int mapSize) throws IOException{
        for(int i=0; i<mapSize; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<mapSize; j++){
                safe[i][j] = st.nextToken().charAt(0);
            }
        }
    }

    public void openSafe(int index, int depth, int mapSize, int end) {
        if (depth == end) {
            if (isPossibleOpenSafe(mapSize)) {
                minCount = Math.min(minCount, depth);
                check = false;
            }
            return;
        }
        for (int i = index; i < mapSize * mapSize && check; i++) {
            int x = i % mapSize;
            int y = i / mapSize;
            changeKeyDirection(x, y, mapSize);
            openSafe(i + 1, depth + 1, mapSize, end);
            changeKeyDirection(x, y, mapSize);
        }
    }

    public boolean isPossibleOpenSafe(int mapSize){
        for(int i=0; i<mapSize; i++){
            for(int j=0; j<mapSize; j++){
                if(safe[i][j] == VERTICAL){
                    return false;
                }
            }
        }
        return true;
    }

    public void changeKeyDirection(int x, int y, int mapSize){
        changeKeyDirectionWithRow(x, mapSize);
        changeKeyDirectionWithCol(x, y, mapSize);
    }

    public void changeKeyDirectionWithRow(int x, int mapSize){
        for(int i=0; i<mapSize; i++){
            if(safe[i][x] == HORIZONTAL){
                safe[i][x] = VERTICAL;
                continue;
            }
            safe[i][x] = HORIZONTAL;
        }
    }

    public void changeKeyDirectionWithCol(int x, int y, int mapSize){
        for(int j=0; j<mapSize; j++){
            if(x == j) continue;
            if(safe[y][j] == HORIZONTAL){
                safe[y][j] = VERTICAL;
                continue;
            }
            safe[y][j] = HORIZONTAL;
        }
    }
}