package com.backjoon.simulation;
/*
 * 회사에 있는 사람
 *
 * version 1.0
 *
 * 2020.12.07
 *
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Backjoon7785 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon7785 processCommand = new Solution_Backjoon7785();
        processCommand.solution();
    }

    public Iterator<String> main(String[][] logs) {
        Solution_Backjoon7785 processCommand = new Solution_Backjoon7785();
        return processCommand.solution(logs);
    }
}

class Solution_Backjoon7785 {
    private static final String ATTENDANCE = "enter";

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws IOException {
        Map<String, String> logs = new TreeMap<>(Comparator.reverseOrder());
        int logCount = Integer.parseInt(br.readLine());
        for (int i=0; i<logCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String accessRecord = st.nextToken();
            if (accessRecord.equals(ATTENDANCE)) {
                logs.put(name, accessRecord);
                continue;
            }
            logs.remove(name);
        }
        Iterator<String> names = logs.keySet().iterator();
        while (names.hasNext()) {
            System.out.println(names.next());
        }
    }

    public Iterator<String> solution(String[][] logs) {
        Map<String, String> logsManagement = new TreeMap<>(Comparator.reverseOrder());
        for (String[] log : logs) {
            String name = log[0];
            String accessRecord = log[1];
            if (accessRecord.equals(ATTENDANCE)) {
                logsManagement.put(name, accessRecord);
                continue;
            }
            logsManagement.remove(name);
        }
        return logsManagement.keySet().iterator();
    }
}
