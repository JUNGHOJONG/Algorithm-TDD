package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Backjoon10773Test {
    private Backjoon10773 processCommand;

    @Before
    public void prepareTest() {
        processCommand = new Backjoon10773();
    }

    @Test
    public void testCase1() {
        //GIVEN
        int[] money = {3, 0, 4, 0};
        int expectedResult = 0;

        //WHEN
        int actualResult = processCommand.main(money);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2() {
        //GIVEN
        int[] money = {1, 3, 5, 4, 0, 0, 7, 0, 0, 6};
        int expectedResult = 7;

        //WHEN
        int actualResult = processCommand.main(money);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3() {
        //GIVEN
        int[] money = {5, 3, 2, 4, 0, 0};
        int expectedResult = 8;

        //WHEN
        int actualResult = processCommand.main(money);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4() {
        //GIVEN
        int[] money = {5, 0, 2, 0};
        int expectedResult = 0;

        //WHEN
        int actualResult = processCommand.main(money);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5() {
        //GIVEN
        int[] money = {5, 0, 2, 9};
        int expectedResult = 11;

        //WHEN
        int actualResult = processCommand.main(money);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
