package com.backjoon.greedy;
/*
 * 주유소
 * version 1.0
 * 2020.12.23
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon13305 {
    public static void main(String[] args) throws IOException {
        Solution_Backjoon13305 processCommand = new Solution_Backjoon13305();
        processCommand.solution();
    }

    public long main(int[] distance, int[] gasStation) {
        Solution_Backjoon13305 processCommand = new Solution_Backjoon13305();
        return processCommand.solution(distance, gasStation);
    }
}

class Solution_Backjoon13305 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public long solution(int[] distance, int[] gasStation) {
        return getMinimumCostFromLeftCityToRightCity(distance, gasStation);
    }

    private long getMinimumCostFromLeftCityToRightCity(int[] distance, int[] gasStation) {
        int criteriaValue = gasStation[0];
        long minimumCost = 0;
        long accumulatedDistance = 0;
        int index = 0;
        for (int value : gasStation) {
            if (criteriaValue > value) {
                minimumCost += criteriaValue * accumulatedDistance;
                accumulatedDistance = 0;
                criteriaValue = value;
            }
            if (index == distance.length) {
                minimumCost += criteriaValue * accumulatedDistance;
                break;
            }
            accumulatedDistance += distance[index];
            index++;
        }
        return minimumCost;
    }

    public void solution() throws IOException {
        int gasStationCount = Integer.parseInt(br.readLine());
        int[] distance = initDistance(gasStationCount);
        int[] gasStation = initGasStation(gasStationCount);
        System.out.println(getMinimumCostFromLeftCityToRightCity(distance, gasStation));
    }

    private int[] initDistance(int gasStationCount) throws IOException {
        int[] distance = new int[gasStationCount - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<gasStationCount - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        return distance;
    }

    private int[] initGasStation(int gasStationCount) throws IOException {
        int[] gasStation = new int[gasStationCount];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<gasStationCount; i++) {
            gasStation[i] = Integer.parseInt(st.nextToken());
        }
        return gasStation;
    }
}
