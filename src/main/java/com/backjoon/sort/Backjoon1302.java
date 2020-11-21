package com.backjoon.sort;
/*
 * 베스트셀러
 * version 1.0
 * 2020.11.21
 * Copyright (c) by Davinci.J
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Backjoon1302 {

    public static void main(String[] args) throws IOException{
        Solution_Backjoon1302 processCommand = new Solution_Backjoon1302();
        processCommand.solution();
    }

    public static String mains(String[] books){
        Solution_Backjoon1302 processCommand = new Solution_Backjoon1302();
        return processCommand.solution(books);
    }

}

class Solution_Backjoon1302{

    public static class Book implements Comparable<Book>{
        private String name;
        private int soldCount;
        public Book(String name, int soldCount){
            this.name = name;
            this.soldCount = soldCount;
        }
        @Override
        public int compareTo(Book o) {
            if(this.soldCount == o.soldCount){
                return this.name.compareTo(o.name);
            }
            return o.soldCount - this.soldCount;
        }
    }

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void solution() throws IOException {
        int bookCount = Integer.parseInt(br.readLine());
        Map<String, Integer> soldBooks = new HashMap<>();
        initSoldBooks(soldBooks, bookCount);

        Queue<Book> sortedSoldBooks = new PriorityQueue<>();
        for(Map.Entry<String, Integer> entry : soldBooks.entrySet()){
            sortedSoldBooks.add(new Book(entry.getKey(), entry.getValue()));
        }
        System.out.println(Objects.requireNonNull(sortedSoldBooks.poll()).name);
    }

    public String solution(String[] books){
        Map<String, Integer> soldBooks = new HashMap<>();
        initSoldBooks(soldBooks, books);

        Queue<Book> sortedSoldBooks = new PriorityQueue<>();
        for(Map.Entry<String, Integer> entry : soldBooks.entrySet()){
            sortedSoldBooks.add(new Book(entry.getKey(), entry.getValue()));
        }
        return Objects.requireNonNull(sortedSoldBooks.poll()).name;
    }

    public void initSoldBooks(Map<String, Integer> soldBooks, int bookCount) throws IOException{
        for(int i=0; i<bookCount; i++){
            String book = br.readLine();
            if(!soldBooks.containsKey(book)){
                soldBooks.put(book, 1);
                continue;
            }
            soldBooks.put(book, soldBooks.get(book) + 1);
        }
    }

    public void initSoldBooks(Map<String, Integer> soldBooks, String[] books){
        for(String book : books){
            if(!soldBooks.containsKey(book)){
                soldBooks.put(book, 1);
                continue;
            }
            soldBooks.put(book, soldBooks.get(book) + 1);
        }
    }

}