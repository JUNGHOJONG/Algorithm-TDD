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

        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=numberToPickCount; i++) {
            int numberToPick = Integer.parseInt(st.nextToken());
            int index = getIndexOfNumberToPick(numberToPick, rotationQueue);
            if (index < rotationQueue.size() - index) {
                sum += index;
                for (int j=0; j<index; j++) {
                    rotationQueue.addLast(rotationQueue.pollFirst());
                }
                rotationQueue.pollFirst();
                continue;
            }
            sum += rotationQueue.size() - index;
            for (int j=0; j<rotationQueue.size() - index; j++) {
                rotationQueue.addFirst(rotationQueue.pollLast());
            }
            rotationQueue.pollFirst();
        }
        System.out.println(sum);
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

}
