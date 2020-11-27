package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon10610Test {

    @Test
    public void testCase1(){
        //GIVEN
        String numbersFoundOnTheRoad = "30";
        String expectedResult = "30";
        //WHEN
        String actualResult = Backjoon10610.main(numbersFoundOnTheRoad);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        String numbersFoundOnTheRoad = "102";
        String expectedResult = "210";
        //WHEN
        String actualResult = Backjoon10610.main(numbersFoundOnTheRoad);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        String numbersFoundOnTheRoad = "2931";
        String expectedResult = "-1";
        //WHEN
        String actualResult = Backjoon10610.main(numbersFoundOnTheRoad);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        String numbersFoundOnTheRoad = "80875542";
        String expectedResult = "88755420";
        //WHEN
        String actualResult = Backjoon10610.main(numbersFoundOnTheRoad);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        String numbersFoundOnTheRoad = "702765438726";
        String expectedResult = "877766543220";
        //WHEN
        String actualResult = Backjoon10610.main(numbersFoundOnTheRoad);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
