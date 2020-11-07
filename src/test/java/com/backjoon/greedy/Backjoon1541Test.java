package com.backjoon.greedy;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon1541Test {

    @Test
    public void testCase1(){
        //WHEN
        String input = "-55+50-40";
        int expectedResult = -145;
        //GIVEN
        Backjoon1541 processCommand = new Backjoon1541();
        int actualResult = processCommand.main(input);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //WHEN
        String input = "55+50+40";
        int expectedResult = 145;
        //GIVEN
        Backjoon1541 processCommand = new Backjoon1541();
        int actualResult = processCommand.main(input);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //WHEN
        String input = "55-50";
        int expectedResult = 5;
        //GIVEN
        Backjoon1541 processCommand = new Backjoon1541();
        int actualResult = processCommand.main(input);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //WHEN
        String input = "55-50+50";
        int expectedResult = -45;
        //GIVEN
        Backjoon1541 processCommand = new Backjoon1541();
        int actualResult = processCommand.main(input);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //WHEN
        String input = "55-80-50";
        int expectedResult = -75;
        //GIVEN
        Backjoon1541 processCommand = new Backjoon1541();
        int actualResult = processCommand.main(input);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

}
