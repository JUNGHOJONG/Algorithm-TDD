package com.backjoon.simulation;
/*
 * 좋은 단어
 *
 * version 1.0
 *
 * 2020.12.02
 *
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon3986 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon3986 processCommand = new Solution_Backjoon3986();
        processCommand.solution();
    }

    public static int mains(String[] words){
        Solution_Backjoon3986 processCommand = new Solution_Backjoon3986();
        return processCommand.solution(words);
    }

}

class Solution_Backjoon3986{
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws IOException {
        int wordCount = Integer.parseInt(br.readLine());
        int goodWordCount = 0;
        for(int i=0; i<wordCount; i++){
            String word = br.readLine();
            if(isGoodWord(word)){
                goodWordCount++;
            }
        }
        System.out.println(goodWordCount);
    }

    public int solution(String[] words) {
        int goodWordCount = 0;
        for(String word : words){
            if(isGoodWord(word)){
                goodWordCount++;
            }
        }
        return goodWordCount;
    }

    public boolean isGoodWord(String word){
        Stack<Character> wordReader = new Stack<>();

        for(int i=0; i<word.length(); i++){
            if(wordReader.isEmpty() || wordReader.peek() != word.charAt(i)){
                wordReader.push(word.charAt(i));
                continue;
            }

            if(wordReader.peek() == word.charAt(i)){
                wordReader.pop();
            }
        }

        return wordReader.size() == 0;
    }
}