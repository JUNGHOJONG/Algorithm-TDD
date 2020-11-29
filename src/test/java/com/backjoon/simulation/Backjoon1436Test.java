package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon1436Test {

    @Test
    public void testCase1(){
        //GIVEN
        int targetSeriesNumber = 1;
        int expectedResult = 666;
        //WHEN
        int actualResult = Backjoon1436.main(targetSeriesNumber);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int targetSeriesNumber = 28;
        int expectedResult = 16662;
        //WHEN
        int actualResult = Backjoon1436.main(targetSeriesNumber);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int targetSeriesNumber = 10000;
        int expectedResult = 2666799;
        //WHEN
        int actualResult = Backjoon1436.main(targetSeriesNumber);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int targetSeriesNumber = 18;
        int expectedResult = 8666;
        //WHEN
        int actualResult = Backjoon1436.main(targetSeriesNumber);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int targetSeriesNumber = 666;
        int expectedResult = 256664;
        //WHEN
        int actualResult = Backjoon1436.main(targetSeriesNumber);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
