package com.programmers.bfs;
/*
 * Programmers GameMapShortestDistance
 * version 1.0
 * 2020.11.09
 * Copyright (c) by Davinci.J
 */
import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {
    public int main(int[][] maps){
        Solution_GameMapShortestDistance processCommand = new Solution_GameMapShortestDistance();
        return processCommand.solution(maps);
    }
}

class Solution_GameMapShortestDistance{

    private static final int WALL_ZONE = 0;
    private static final int EMPTY_ZONE = 1;

    private int[] directionX = {1, 0, -1, 0};
    private int[] directionY = {0, 1, 0, -1};
    private boolean check = false;

    public int solution(int[][] maps){
        int shortestDistance = getShortestDistance(maps);
        if(maps[0][0] == WALL_ZONE) return -1;
        return check ? shortestDistance : -1;
    }

    public int getShortestDistance(int[][] maps){
        int rowSize = maps.length;
        int colSize = maps[0].length;
        boolean[][] visited = new boolean[rowSize][colSize];
        Queue<int[]> queue = new LinkedList<>();
        visited[0][0] = true;
        queue.add(new int[]{0, 0, 1});
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            if(temp[0] == colSize - 1 && temp[1] == rowSize - 1){
                check = true;
                return temp[2];
            }
            for(int i=0; i<4; i++){
                int nextX = temp[0] + directionX[i];
                int nextY = temp[1] + directionY[i];
                if(!movable(nextX, nextY, colSize, rowSize)) continue;
                if(!visited[nextY][nextX] && maps[nextY][nextX] == EMPTY_ZONE){
                    visited[nextY][nextX] = true;
                    queue.add(new int[]{nextX, nextY, temp[2] + 1});
                }
            }
        }
        return 0;
    }

    public boolean movable(int nextX, int nextY, int colSize, int rowSize){
        return nextX >= 0 && nextX < colSize && nextY >= 0 && nextY < rowSize;
    }
}
