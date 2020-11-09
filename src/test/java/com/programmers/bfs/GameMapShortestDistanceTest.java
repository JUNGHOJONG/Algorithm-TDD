package com.programmers.bfs;

import org.junit.Assert;
import org.junit.Test;

public class GameMapShortestDistanceTest {

    @Test
    public void testCase1(){
        //GIVEN
        int[][] maps = {{1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 1},
                        {0, 0, 0, 0, 1}};
        int expectedResult = 11;
        //WHEN
        GameMapShortestDistance processCommand = new GameMapShortestDistance();
        int actualResult = processCommand.main(maps);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int[][] maps = {{1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 1}};
        int expectedResult = -1;
        //WHEN
        GameMapShortestDistance processCommand = new GameMapShortestDistance();
        int actualResult = processCommand.main(maps);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int[][] maps = {{0, 0, 0, 0},
                        {1, 0, 0, 0},
                        {1, 1, 1, 1}};
        int expectedResult = -1;
        //WHEN
        GameMapShortestDistance processCommand = new GameMapShortestDistance();
        int actualResult = processCommand.main(maps);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int[][] maps = {{1, 0, 0, 0},
                        {1, 0, 0, 0},
                        {1, 1, 1, 1}};
        int expectedResult = 6;
        //WHEN
        GameMapShortestDistance processCommand = new GameMapShortestDistance();
        int actualResult = processCommand.main(maps);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int[][] maps = {{1, 0, 0, 0},
                        {1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {0, 0, 0, 1}};
        int expectedResult = 7;
        //WHEN
        GameMapShortestDistance processCommand = new GameMapShortestDistance();
        int actualResult = processCommand.main(maps);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

}
