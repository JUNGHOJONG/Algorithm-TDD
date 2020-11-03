package com.backjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Backjoon3048 {
    public static void main(String[] args) throws IOException{
        Solution_Backjoon3048 processCommand = new Solution_Backjoon3048();
        processCommand.solution();
    }

    public String main(String firstGroupOrder, String secondGroupOrder, int elapsedTime){
        Solution_Backjoon3048 processCommand = new Solution_Backjoon3048();
        return processCommand.solution(firstGroupOrder, secondGroupOrder, elapsedTime);
    }
}

class Solution_Backjoon3048{
    private static final int GROUP_ONE = 1;
    private static final int GROUP_TWO = 2;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void solution() throws IOException {
        br.readLine();
        String firstGroupOrder = br.readLine();
        String secondGroupOrder = br.readLine();
        int elapsedTime = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> groupIdentifier = new HashMap<>();
        doTagForFirstGroup(firstGroupOrder, groupIdentifier);
        doTagForSecondGroup(secondGroupOrder, groupIdentifier);
        String antOrder = initAntOrder(firstGroupOrder, secondGroupOrder);
        System.out.println(getAntOrder(groupIdentifier, antOrder, elapsedTime));
    }
    public String solution(String firstGroupOrder, String secondGroupOrder, int elapsedTime){
        HashMap<Character, Integer> groupIdentifier = new HashMap<>();
        doTagForFirstGroup(firstGroupOrder, groupIdentifier);
        doTagForSecondGroup(secondGroupOrder, groupIdentifier);
        String antOrder = initAntOrder(firstGroupOrder, secondGroupOrder);
        return getAntOrder(groupIdentifier, antOrder, elapsedTime);
    }

    public void doTagForFirstGroup(String firstGroupOrder, HashMap<Character, Integer> groupIdentifier){
        for(int i=0; i<firstGroupOrder.length(); i++){
            groupIdentifier.put(firstGroupOrder.charAt(i), GROUP_ONE);
        }
    }

    public void doTagForSecondGroup(String secondGroupOrder, HashMap<Character, Integer> groupIdentifier){
        for(int i=0; i<secondGroupOrder.length(); i++){
            groupIdentifier.put(secondGroupOrder.charAt(i), GROUP_TWO);
        }
    }

    public String initAntOrder(String firstGroupOrder, String secondGroupOrder){
        String reversedFirstGroupOrder = reverseFirstGroupOrder(firstGroupOrder);
        return reversedFirstGroupOrder + secondGroupOrder;
    }

    public String reverseFirstGroupOrder(String firstGroupOrder){
        StringBuilder sb = new StringBuilder();
        for(int i=firstGroupOrder.length() - 1; i >= 0; i--){
            sb.append(firstGroupOrder.charAt(i));
        }
        return sb.toString();
    }

    public String getAntOrder(HashMap<Character, Integer> groupIdentifier,
                                String antOrder, int elapsedTime){
        StringBuilder sb = new StringBuilder(antOrder);
        for(int i=0; i<elapsedTime; i++){
            moveAntForElapsedTime(groupIdentifier, sb);
        }
        return sb.toString();
    }

    public void moveAntForElapsedTime(HashMap<Character, Integer> groupIdentifier,
                                        StringBuilder sb){
        for(int i=0; i<sb.length() - 1; i++){
            if(groupIdentifier.get(sb.charAt(i)) == GROUP_ONE
                    && groupIdentifier.get(sb.charAt(i + 1)) == GROUP_TWO){
                swapAnt(sb, i);
                i++;
            }
        }
    }

    public void swapAnt(StringBuilder sb, int index){
        char temp = sb.charAt(index);
        sb.setCharAt(index, sb.charAt(index + 1));
        sb.setCharAt(index + 1, temp);
    }

}



