package com.backjoon.simulation;
/*
 * 창고 다각형
 * version 1.0
 * 2020.12.29
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Backjoon2304 {
    public static void main(String[] args) throws IOException {
        Solution_Backjoon2304 processCommand = new Solution_Backjoon2304();
        processCommand.solution();
    }
}

class Solution_Backjoon2304 {
    private static final int MAX_SIZE = 1001;

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Map<Integer, Integer> map = new HashMap<>();

    public void solution() throws IOException {
        boolean[][] area = new boolean[MAX_SIZE][MAX_SIZE];
        int columnCount = Integer.parseInt(br.readLine());
        initArea(area, columnCount);

        for (int i=0; i<MAX_SIZE; i++) {
            if (area[0][i] && map.containsKey(i)) {
                fillArea(i, map.get(i), area);
            }
        }
        System.out.println(getContainerArea(area));
    }

    private void initArea(boolean[][] area, int columnCount) throws IOException {
        for (int i=0; i<columnCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int position = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            map.put(position, height - 1);
            for (int j=0; j<height; j++) {
                area[j][position] = true;
            }
        }
    }

    private void fillArea(int x, int y, boolean[][] area) {
        for (int i=0; i<=y; i++) {
            if (isPossibleFillLeftArea(x, i, area)) {
                fillLeftArea(x, i, area);
            }
            if (isPossibleFillRightArea(x, i, area)) {
                fillRightArea(x, i, area);
            }
        }
    }

    private boolean isPossibleFillLeftArea(int x, int y, boolean[][] area) {
        while (true) {
            if (!movable(--x, y)) {
                return false;
            }
            if (area[y][x]) {
                break;
            }
        }
        return true;
    }

    private boolean movable(int x, int y) {
        return x >= 0 && x < MAX_SIZE && y >= 0 && y < MAX_SIZE;
    }

    private void fillLeftArea(int x, int y, boolean[][] area) {
        while (!area[y][--x]) {
            area[y][x] = true;
        }
    }

    private boolean isPossibleFillRightArea(int x, int y, boolean[][] area) {
        while (true) {
            if (!movable(++x, y)) {
                return false;
            }
            if (area[y][x]) {
                break;
            }
        }
        return true;
    }

    private void fillRightArea(int x, int y, boolean[][] area) {
        while (!area[y][++x]) {
            area[y][x] = true;
        }
    }

    private int getContainerArea(boolean[][] area) {
        int sum = 0;
        for (int i=0; i<MAX_SIZE; i++) {
            for (int j=0; j<MAX_SIZE; j++) {
                if (area[i][j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

}
