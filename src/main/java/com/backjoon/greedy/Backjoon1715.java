package com.backjoon.greedy;
/*
 * Backjoon1715
 * version 1.0
 * 2020.11.10
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Backjoon1715 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon1715 processCommand = new Solution_Backjoon1715();
        processCommand.solution();
    }
    public int main(int[] cards){
        Solution_Backjoon1715 processCommand = new Solution_Backjoon1715();
        return processCommand.solution(cards);
    }

}

class Solution_Backjoon1715{

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws IOException {
        int cardCount = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> cards = initCards(cardCount);
        if(cards.size() == 1) {
            System.out.println(0);
            return;
        }
        System.out.println(getMinCompareCount(cards));
    }

    public PriorityQueue<Integer> initCards(int cardCount) throws IOException{
        PriorityQueue<Integer> cards = new PriorityQueue<>();
        for(int i=0; i<cardCount; i++){
            cards.add(Integer.parseInt(br.readLine()));
        }
        return cards;
    }

    public int solution(int[] cards){
        if(cards.length == 1) return 0;
        PriorityQueue<Integer> sortedCards = initCards(cards);
        return getMinCompareCount(sortedCards);
    }

    public PriorityQueue<Integer> initCards(int[] cards){
        PriorityQueue<Integer> sortedCards = new PriorityQueue<>();
        for(Integer card : cards){
            sortedCards.add(card);
        }
        return sortedCards;
    }

    public int getMinCompareCount(PriorityQueue<Integer> cards){
        int sum = 0;
        while(cards.size() != 1){
            int compareCount = cards.poll() + cards.poll();
            cards.add(compareCount);
            sum += compareCount;
        }
        return sum;
    }
}
