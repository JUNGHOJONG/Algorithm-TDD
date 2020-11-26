package com.backjoon.simulation;
/*
 * 외계인의 기타 연주
 * version 1.0
 * 2020.11.26
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Backjoon2841 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon2841 processCommand = new Solution_Backjoon2841();
        processCommand.solution();
    }

    public static int main(int[][] melodies){
        Solution_Backjoon2841 processCommand = new Solution_Backjoon2841();
        return processCommand.solution(melodies);
    }

}

class Solution_Backjoon2841{

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Stack<Integer>[] guitarStrings = new Stack[7];

    public int solution(int[][] melodies){
        initStacks();
        return getCountOfMovedFinger(melodies);
    }

    public void solution() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int melodyCount = Integer.parseInt(st.nextToken());
        int flatCount = Integer.parseInt(st.nextToken());
        initStacks();
        System.out.println(getCountOfMovedFinger(melodyCount));
    }

    public void initStacks(){
        for(int i=1; i<=6; i++){
            guitarStrings[i] = new Stack<>();
        }
    }

    public int getCountOfMovedFinger(int melodyCount) throws IOException{
        int count = 0;
        for(int i=0; i<melodyCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int melody = Integer.parseInt(st.nextToken());
            int flat = Integer.parseInt(st.nextToken());
            while(true){
                if(guitarStrings[melody].isEmpty() || guitarStrings[melody].peek() < flat){
                    guitarStrings[melody].push(flat);
                    count++;
                    break;
                }

                if(guitarStrings[melody].peek() > flat){
                    guitarStrings[melody].pop();
                    count++;
                    continue;
                }

                if(guitarStrings[melody].peek() == flat){
                    break;
                }
            }
        }
        return count;
    }

    public int getCountOfMovedFinger(int[][] melodies) {
        int count = 0;
        for(int[] m : melodies){
            int melody = m[0];
            int flat = m[1];
            while(true){
                if(guitarStrings[melody].isEmpty() || guitarStrings[melody].peek() < flat){
                    guitarStrings[melody].push(flat);
                    count++;
                    break;
                }

                if(guitarStrings[melody].peek() > flat){
                    guitarStrings[melody].pop();
                    count++;
                    continue;
                }

                if(guitarStrings[melody].peek() == flat){
                    break;
                }
            }
        }
        return count;
    }
}