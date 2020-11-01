package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon13335Test {

    @Test
    public void testCase1(){
        //GIVEN
        int bridgeLength = 2;
        int maximumLoad = 10;
        int truckCount = 4;
        int[] trucks = {7, 4, 5, 6};
        int expectedResult = 8;

        //WHEN
        Backjoon13335 processCommand = new Backjoon13335();
        int actualResult = processCommand.main(bridgeLength, maximumLoad, truckCount, trucks);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int bridgeLength = 5;
        int maximumLoad = 10;
        int truckCount = 1;
        int[] trucks = {8};
        int expectedResult = 6;

        //WHEN
        Backjoon13335 processCommand = new Backjoon13335();
        int actualResult = processCommand.main(bridgeLength, maximumLoad, truckCount, trucks);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int bridgeLength = 1;
        int maximumLoad = 20;
        int truckCount = 5;
        int[] trucks = {8, 7, 5, 6, 2};
        int expectedResult = 6;

        //WHEN
        Backjoon13335 processCommand = new Backjoon13335();
        int actualResult = processCommand.main(bridgeLength, maximumLoad, truckCount, trucks);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int bridgeLength = 4;
        int maximumLoad = 50;
        int truckCount = 3;
        int[] trucks = {30, 21, 10};
        int expectedResult = 10;

        //WHEN
        Backjoon13335 processCommand = new Backjoon13335();
        int actualResult = processCommand.main(bridgeLength, maximumLoad, truckCount, trucks);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int bridgeLength = 1;
        int maximumLoad = 10;
        int truckCount = 1;
        int[] trucks = {5};
        int expectedResult = 2;

        //WHEN
        Backjoon13335 processCommand = new Backjoon13335();
        int actualResult = processCommand.main(bridgeLength, maximumLoad, truckCount, trucks);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase6(){
        //GIVEN
        int bridgeLength = 100;
        int maximumLoad = 100;
        int truckCount = 1;
        int[] trucks = {10};
        int expectedResult = 101;

        //WHEN
        Backjoon13335 processCommand = new Backjoon13335();
        int actualResult = processCommand.main(bridgeLength, maximumLoad, truckCount, trucks);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase7(){
        //GIVEN
        int bridgeLength = 100;
        int maximumLoad = 100;
        int truckCount = 10;
        int[] trucks = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int expectedResult = 110;

        //WHEN
        Backjoon13335 processCommand = new Backjoon13335();
        int actualResult = processCommand.main(bridgeLength, maximumLoad, truckCount, trucks);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
