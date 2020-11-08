package com.backjoon.bfs;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon1743Test {

    @Test
    public void testCase1(){
        //GIVEN
        int[][] input = {{1, 0, 0, 0}, {0, 1, 1, 0}, {1, 1, 0, 0}};
        int expectedResult = 4;

        //WHEN
        Backjoon1743 processCommand = new Backjoon1743();
        int actualResult = processCommand.main(input);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int[][] input = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        int expectedResult = 2;

        //WHEN
        Backjoon1743 processCommand = new Backjoon1743();
        int actualResult = processCommand.main(input);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int[][] input = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int expectedResult = 12;

        //WHEN
        Backjoon1743 processCommand = new Backjoon1743();
        int actualResult = processCommand.main(input);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int[][] input = {{0, 1, 0, 1}, {1, 0, 1, 0}, {1, 0, 0, 1}};
        int expectedResult = 2;

        //WHEN
        Backjoon1743 processCommand = new Backjoon1743();
        int actualResult = processCommand.main(input);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int[][] input = {{1, 1, 1, 1}, {0, 0, 0, 1}, {1, 1, 1, 1}};
        int expectedResult = 9;

        //WHEN
        Backjoon1743 processCommand = new Backjoon1743();
        int actualResult = processCommand.main(input);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
