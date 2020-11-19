package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon2346Test {

    @Test
    public void testCase1(){
        //GIVEN
        int balloonCount = 5;
        int[] ballon = {3, 2, 1, -3, -1};
        String expectedResult = "1 4 5 3 2 ";
        //WHEN
        String actualResult = Backjoon2346.main(balloonCount, ballon);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int balloonCount = 4;
        int[] ballon = {-3, 2, -1, 1};
        String expectedResult = "1 2 4 3 ";
        //WHEN
        String actualResult = Backjoon2346.main(balloonCount, ballon);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int balloonCount = 4;
        int[] ballon = {3, 1, -1, -2};
        String expectedResult = "1 4 2 3 ";
        //WHEN
        String actualResult = Backjoon2346.main(balloonCount, ballon);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int balloonCount = 1;
        int[] ballon = {3};
        String expectedResult = "1 ";
        //WHEN
        String actualResult = Backjoon2346.main(balloonCount, ballon);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int balloonCount = 1;
        int[] ballon = {-1};
        String expectedResult = "1 ";
        //WHEN
        String actualResult = Backjoon2346.main(balloonCount, ballon);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
