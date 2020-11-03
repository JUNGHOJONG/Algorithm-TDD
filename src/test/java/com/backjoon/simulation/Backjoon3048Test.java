package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon3048Test {

    @Test
    public void testCase1(){
        //GIVEN
        String firstGroupOrder = "ABC";
        String secondGroupOrder = "DEF";
        int elapsedTime = 2;
        String expectedResult = "CDBEAF";

        //WHEN
        Backjoon3048 processCommand = new Backjoon3048();
        String actualResult = processCommand.main(firstGroupOrder, secondGroupOrder, elapsedTime);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        String firstGroupOrder = "ABC";
        String secondGroupOrder = "DEF";
        int elapsedTime = 5;
        String expectedResult = "DEFCBA";

        //WHEN
        Backjoon3048 processCommand = new Backjoon3048();
        String actualResult = processCommand.main(firstGroupOrder, secondGroupOrder, elapsedTime);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        String firstGroupOrder = "ABC";
        String secondGroupOrder = "DEF";
        int elapsedTime = 0;
        String expectedResult = "CBADEF";

        //WHEN
        Backjoon3048 processCommand = new Backjoon3048();
        String actualResult = processCommand.main(firstGroupOrder, secondGroupOrder, elapsedTime);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        String firstGroupOrder = "AB";
        String secondGroupOrder = "CDEF";
        int elapsedTime = 3;
        String expectedResult = "CDBEAF";

        //WHEN
        Backjoon3048 processCommand = new Backjoon3048();
        String actualResult = processCommand.main(firstGroupOrder, secondGroupOrder, elapsedTime);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        String firstGroupOrder = "AB";
        String secondGroupOrder = "CDEF";
        int elapsedTime = 5;
        String expectedResult = "CDEFBA";

        //WHEN
        Backjoon3048 processCommand = new Backjoon3048();
        String actualResult = processCommand.main(firstGroupOrder, secondGroupOrder, elapsedTime);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
