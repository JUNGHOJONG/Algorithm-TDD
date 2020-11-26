package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon2841Test {

    @Test
    public void testCase1(){
        //GIVEN
        int[][] melodies = {{1, 5}, {2, 3}, {2, 5}, {2, 7}, {2, 4}, {1, 5}, {1, 3}};
        int expectedResult = 9;
        //WHEN
        int actualResult = Backjoon2841.main(melodies);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int[][] melodies = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}};
        int expectedResult = 6;
        //WHEN
        int actualResult = Backjoon2841.main(melodies);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int[][] melodies = {{5, 4}, {5, 6}, {5, 8}, {5, 5}, {5, 7}, {5, 3}};
        int expectedResult = 11;
        //WHEN
        int actualResult = Backjoon2841.main(melodies);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int[][] melodies = {{5, 4}, {2, 4}, {5, 6}, {5, 8}, {1, 5}, {5, 5}, {5, 7}, {5, 3}};
        int expectedResult = 13;
        //WHEN
        int actualResult = Backjoon2841.main(melodies);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int[][] melodies = {{5, 1}, {5, 2}, {5, 3}, {5, 2}, {5, 1}};
        int expectedResult = 5;
        //WHEN
        int actualResult = Backjoon2841.main(melodies);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
