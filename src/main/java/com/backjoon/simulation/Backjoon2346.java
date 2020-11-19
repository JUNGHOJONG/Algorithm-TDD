package com.backjoon.simulation;
/*
 * 풍선 터뜨리기
 * version 1.0
 * 2020.11.19
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Backjoon2346 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon2346 processCommand = new Solution_Backjoon2346();
        processCommand.solution();
    }

    public static String main(int balloonCount, int[] balloon){
        Solution_Backjoon2346 processCommand = new Solution_Backjoon2346();
        return processCommand.solution(balloonCount, balloon);
    }

}

class Solution_Backjoon2346{

    public static class Balloon{
        private int index;
        private int paperCount;
        public Balloon(int index, int paperCount){
            this.index = index;
            this.paperCount = paperCount;
        }
    }

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private List<Balloon> balloons = new LinkedList<>();

    public void solution() throws IOException {
        int balloonCount = Integer.parseInt(br.readLine());
        initBalloons(balloonCount);
        System.out.println(getPopedBalloonsWithSequence(balloonCount));
    }

    public String solution(int balloonCount, int[] balloon) {
        initBalloons(balloon);
        return getPopedBalloonsWithSequence(balloonCount);
    }

    public void initBalloons(int balloonCount) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<balloonCount; i++){
            balloons.add(new Balloon(i + 1, Integer.parseInt(st.nextToken())));
        }
    }

    public void initBalloons(int[] balloon) {
        int index = 1;
        for(Integer n : balloon){
            balloons.add(new Balloon(index, n));
            index++;
        }
    }

    public String getPopedBalloonsWithSequence(int balloonCount){
        int index = 0;
        int size = balloons.size();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<balloonCount; i++){
            boolean lastPositionOfIndex = false;
            if(index == size - 1) lastPositionOfIndex = true;
            Balloon balloon = balloons.remove(index);
            if(lastPositionOfIndex) index--;
            sb.append(balloon.index).append(" ");
            size--;
            if(size == 0) continue;

            if(balloon.paperCount < 0){
                index = moveLeft(index, Math.abs(balloon.paperCount), size, lastPositionOfIndex);
                continue;
            }
            index = moveRight(index, Math.abs(balloon.paperCount), size, lastPositionOfIndex);
        }
        return sb.toString();
    }

    public int moveLeft(int index, int moveCount, int size, boolean lastPositionOfIndex){
        if(lastPositionOfIndex) moveCount--;
        for(int i=0; i<moveCount; i++){
            index = (size + index - 1) % size;
        }
        return index;
    }

    public int moveRight(int index, int moveCount, int size, boolean lastPositionOfIndex){
        if(!lastPositionOfIndex) moveCount--;
        for(int i=0; i<moveCount; i++){
            index = (index + 1) % size;
        }
        return index;
    }
}
