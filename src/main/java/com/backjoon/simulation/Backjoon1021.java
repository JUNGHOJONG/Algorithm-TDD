package com.backjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Backjoon1021 {
    public static void main(String[] args) throws IOException {
        Solution_Backjoon1021 processCommand = new Solution_Backjoon1021();
        processCommand.solution();
    }

    public int main(int queueSize, int[] numberToPick) {
        Solution_Backjoon1021 processCommand = new Solution_Backjoon1021();
        return processCommand.solution(queueSize, numberToPick);
    }
}

class Solution_Backjoon1021 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws IOException {
        Deque<Integer> rotationQueue = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int queueSize = Integer.parseInt(st.nextToken());
        int numberToPickCount = Integer.parseInt(st.nextToken());

        for (int i=1; i<=queueSize; i++) {
            rotationQueue.addLast(i);
        }

        int minMoveCount = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=numberToPickCount; i++) {
            int numberToPick = Integer.parseInt(st.nextToken());
            int indexOfNumberToPick = getIndexOfNumberToPick(numberToPick, rotationQueue);
            if (indexOfNumberToPick < rotationQueue.size() - indexOfNumberToPick) {
                minMoveCount += indexOfNumberToPick;
                commandSecondOperator(indexOfNumberToPick, rotationQueue);
                continue;
            }
            minMoveCount += rotationQueue.size() - indexOfNumberToPick;
            commandThirdOperator(indexOfNumberToPick, rotationQueue);
        }
        System.out.println(minMoveCount);
    }

    public int solution(int queueSize, int[] numberToPick) {
        Deque<Integer> rotationQueue = new ArrayDeque<>();

        for (int i=1; i<=queueSize; i++) {
            rotationQueue.addLast(i);
        }

        int minMoveCount = 0;
        for (int value : numberToPick) {
            int indexOfNumberToPick = getIndexOfNumberToPick(value, rotationQueue);
            if (indexOfNumberToPick < rotationQueue.size() - indexOfNumberToPick) {
                minMoveCount += indexOfNumberToPick;
                commandSecondOperator(indexOfNumberToPick, rotationQueue);
                continue;
            }
            minMoveCount += rotationQueue.size() - indexOfNumberToPick;
            commandThirdOperator(indexOfNumberToPick, rotationQueue);
        }
        return minMoveCount;
    }

    private int getIndexOfNumberToPick(int numberToPick, Deque<Integer> rotationQueue) {
        int index = 0;
        for (int value : rotationQueue) {
            if (numberToPick == value) {
                break;
            }
            index++;
        }
        return index;
    }

    private void commandSecondOperator(int index, Deque<Integer> rotationQueue) {
        for (int j=0; j<index; j++) {
            rotationQueue.addLast(rotationQueue.pollFirst());
        }
        rotationQueue.pollFirst();
    }

    private void commandThirdOperator(int index, Deque<Integer> rotationQueue) {
        for (int j=0; j<rotationQueue.size() - index; j++) {
            rotationQueue.addFirst(rotationQueue.pollLast());
        }
        rotationQueue.pollFirst();
    }

}
