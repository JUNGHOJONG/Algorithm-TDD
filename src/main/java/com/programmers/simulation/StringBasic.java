package com.programmers.simulation;
/*
 * StringBasic
 * version 1.0
 * 2020.11.14
 * Copyright (c) by Davinci.J
 */
public class StringBasic {
    public static boolean main(String s) {
        Solution_StringBasic processCommand = new Solution_StringBasic();
        return processCommand.solution(s);
    }
}

class Solution_StringBasic {
    public boolean solution(String s) {
        return isSatisfyCriteriaLength(s) && isNotAllNumber(s);
    }

    public boolean isSatisfyCriteriaLength(String s){
        return s.length() == 4 || s.length() == 6;
    }

    public boolean isNotAllNumber(String s){
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9' ){
                return false;
            }
        }
        return true;
    }
}
