package com.backjoon.dp;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon2096Test {

    @Test
    public void testCase1(){
        //GIVEN
        int[][] scores = {{1, 2, 3}, {4, 5, 6}, {4, 9, 0}};
        String expectedResult = "18 6";
        //WHEN
        Backjoon2096 processCommand = new Backjoon2096();
        String actualResult = processCommand.main(scores);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int[][] scores = {{10, 1, 1}, {1, 2, 8}, {1, 1, 7}};
        String expectedResult = "19 3";
        //WHEN
        Backjoon2096 processCommand = new Backjoon2096();
        String actualResult = processCommand.main(scores);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int[][] scores = {{10, 1, 1}, {1, 2, 8}, {1, 1, 7}, {20, 1, 2}};
        String expectedResult = "33 4";
        //WHEN
        Backjoon2096 processCommand = new Backjoon2096();
        String actualResult = processCommand.main(scores);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int[][] scores = {{1, 4, 5}};
        String expectedResult = "5 1";
        //WHEN
        Backjoon2096 processCommand = new Backjoon2096();
        String actualResult = processCommand.main(scores);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int[][] scores = {{1, 2, 1}, {2, 1, 3}};
        String expectedResult = "5 2";
        //WHEN
        Backjoon2096 processCommand = new Backjoon2096();
        String actualResult = processCommand.main(scores);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
