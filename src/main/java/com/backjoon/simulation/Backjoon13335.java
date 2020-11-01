package com.backjoon.simulation;
/*
 * Backjoon13335
 * version 1.0
 * 2020.11.01
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Backjoon13335 {
    //백준 제출용
    public static void main(String[] args) throws IOException {
        Solution_Backjoon13335 processCommand = new Solution_Backjoon13335();
        processCommand.solution();
    }

    // for test
    public int main(int bridgeLength, int maximumLoad, int[] trucks){
        Solution_Backjoon13335 processCommand = new Solution_Backjoon13335();
        return processCommand.solution(bridgeLength, maximumLoad, trucks);
    }
}

class Solution_Backjoon13335{
    // 백준 제출용
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void solution() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int truckCount = Integer.parseInt(st.nextToken());
        int bridgeLength = Integer.parseInt(st.nextToken());
        int maximumLoad = Integer.parseInt(st.nextToken());
        Queue<Integer> truckList = initTrucks(truckCount);
        int timeForAllTruckPassed = getTimeForAllTruckPassed(bridgeLength, maximumLoad, truckList);
        System.out.println(timeForAllTruckPassed);
    }

    // for test
    public int solution(int bridgeLength, int maximumLoad, int[] trucks){
        Queue<Integer> truckList = getTruckList(trucks);
        return getTimeForAllTruckPassed(bridgeLength, maximumLoad, truckList);
    }

    private Queue<Integer> initTrucks(int truckCount) throws IOException{
        Queue<Integer> truckList = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<truckCount; i++){
            truckList.add(Integer.parseInt(st.nextToken()));
        }
        return truckList;
    }

    private Queue<Integer> getTruckList(int[] trucks){
        Queue<Integer> truckList = new LinkedList<>();
        for(int truck : trucks){
            truckList.add(truck);
        }
        return truckList;
    }

    private int getTimeForAllTruckPassed(int bridgeLength, int maximumLoad,
                                                    Queue<Integer> truckList){
        int timeForAllTruckPassed = 0;
        int[] bridge = new int[bridgeLength];
        while(!isAllTruckPassed(truckList, bridge)){
            moveTruck(bridge);
            if(isPossiblePassTruck(bridge, truckList, maximumLoad)
                    && !truckList.isEmpty()){
                bridge[bridgeLength - 1] = truckList.poll();
            }
            timeForAllTruckPassed++;
        }
        return timeForAllTruckPassed;
    }

    private boolean isAllTruckPassed(Queue<Integer> truckList, int[] bridge){
        boolean bridgeEmpty = true;
        for(int truckWeight : bridge){
            if (truckWeight > 0) {
                bridgeEmpty = false;
                break;
            }
        }
        return truckList.size() == 0 && bridgeEmpty;
    }

    private void moveTruck(int[] bridge){
        int bridgeLength = bridge.length;
        for(int i=0; i<bridgeLength - 1; i++){
            bridge[i] = bridge[i + 1];
        }
        bridge[bridgeLength - 1] = 0;
    }

    private boolean isPossiblePassTruck(int[] bridge, Queue<Integer> truckList, int maximumLoad){
        int sumOfTruckWeight = getSumOfTruckWeight(bridge);
        if(!truckList.isEmpty()){
            return sumOfTruckWeight + truckList.peek() <= maximumLoad;
        }
        return sumOfTruckWeight <= maximumLoad;
    }

    private int getSumOfTruckWeight(int[] bridge){
        int sumOfTruckWeight = 0;
        for(int truckWeight : bridge){
            sumOfTruckWeight += truckWeight;
        }
        return sumOfTruckWeight;
    }
}