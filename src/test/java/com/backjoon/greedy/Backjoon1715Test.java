package com.backjoon.greedy;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon1715Test {

    @Test
    public void testCase1(){
        //GIVEN
        int[] cards = {10, 20, 40};
        int expectedResult = 100;
        //WHEN
        Backjoon1715 processCommand = new Backjoon1715();
        int actualResult = processCommand.main(cards);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int[] cards = {10};
        int expectedResult = 0;
        //WHEN
        Backjoon1715 processCommand = new Backjoon1715();
        int actualResult = processCommand.main(cards);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int[] cards = {10, 15, 20, 25};
        int expectedResult = 140;
        //WHEN
        Backjoon1715 processCommand = new Backjoon1715();
        int actualResult = processCommand.main(cards);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int[] cards = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int expectedResult = 340;
        //WHEN
        Backjoon1715 processCommand = new Backjoon1715();
        int actualResult = processCommand.main(cards);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int[] cards = {10, 10, 10, 10};
        int expectedResult = 80;
        //WHEN
        Backjoon1715 processCommand = new Backjoon1715();
        int actualResult = processCommand.main(cards);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

}
