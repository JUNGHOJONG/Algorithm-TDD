package com.backjoon.bfs;
/*
 * Backjoon1743
 * version 1.0
 * 2020.11.08
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Backjoon1743 {
    public int main(int[][] input){
        Solution_Backjoon1743 processCommand = new Solution_Backjoon1743();
        return processCommand.solution(input);
    }

    public static void main(String[] args) throws IOException{
        Solution_Backjoon1743 processCommand = new Solution_Backjoon1743();
        processCommand.solution();
    }
}

class Solution_Backjoon1743{

    private static final int TRASH_ZONE = 1;

    public static class Movement{
        private int positionX;
        private int positionY;
        public Movement(int positionX, int positionY){
            this.positionX = positionX;
            this.positionY = positionY;
        }
    }
    private int[] directionX = {1, 0, -1, 0};
    private int[] directionY = {0, 1, 0, -1};
    private boolean[][] visited;

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void solution() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rowSize = Integer.parseInt(st.nextToken());
        int colSize = Integer.parseInt(st.nextToken());
        int trashCount = Integer.parseInt(st.nextToken());

        visited = new boolean[rowSize][colSize];
        int[][] map = new int[rowSize][colSize];
        initMap(map, trashCount);
        System.out.println(getMaxTrashAmount(map));
    }

    public int solution(int[][] map){
        visited = new boolean[map.length][map[0].length];
        return getMaxTrashAmount(map);
    }

    public void initMap(int[][] map, int trashCount) throws IOException{
        for(int i=0; i<trashCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            map[y][x] = 1;
        }
    }

    public int getMaxTrashAmount(int[][] map){
        int maxTrashAmount = 0;
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(!visited[i][j] && map[i][j] == TRASH_ZONE){
                    maxTrashAmount = Math.max(maxTrashAmount, getTrashAmount(j, i, map));
                }
            }
        }
        return maxTrashAmount;
    }

    public int getTrashAmount(int x, int y, int[][] map){
        visited[y][x] = true;
        Queue<Movement> queue = new LinkedList<>();
        queue.add(new Movement(x, y));
        int count = 1;
        while(!queue.isEmpty()){
            Movement temp = queue.poll();
            for(int i=0; i<4; i++){
                int nextX = temp.positionX + directionX[i];
                int nextY = temp.positionY + directionY[i];
                if(!movable(nextX, nextY, map[0].length, map.length)) continue;
                if(!visited[nextY][nextX] && map[nextY][nextX] == TRASH_ZONE){
                    visited[nextY][nextX] = true;
                    queue.add(new Movement(nextX, nextY));
                    count++;
                }
            }
        }
        return count;
    }

    public boolean movable(int nextX, int nextY, int colSize, int rowSize){
        return nextX >= 0 && nextX < colSize && nextY >= 0 && nextY < rowSize;
    }
}