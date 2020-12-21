package com.backjoon.simulation;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Backjoon1021Test {
    private Backjoon1021 processCommand;

    @Before
    public void prepareTest() {
        processCommand = new Backjoon1021();
    }

    @Test
    public void testCase1() {
        //GIVEN
        int queueSize = 10;
        int[] numberToPick = {1, 2, 3};
        int expectedResult = 0;

        //WHEN
        int actualResult = processCommand.main(queueSize, numberToPick);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase2() {
        //GIVEN
        int queueSize = 10;
        int[] numberToPick = {2, 9, 5};
        int expectedResult = 8;

        //WHEN
        int actualResult = processCommand.main(queueSize, numberToPick);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase3() {
        //GIVEN
        int queueSize = 32;
        int[] numberToPick = {27, 16, 30, 11, 6, 23};
        int expectedResult = 59;

        //WHEN
        int actualResult = processCommand.main(queueSize, numberToPick);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase4() {
        //GIVEN
        int queueSize = 10;
        int[] numberToPick = {1, 6, 3, 2, 7, 9, 8, 4, 10, 5};
        int expectedResult = 14;

        //WHEN
        int actualResult = processCommand.main(queueSize, numberToPick);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase5() {
        //GIVEN
        int queueSize = 1;
        int[] numberToPick = {1};
        int expectedResult = 0;

        //WHEN
        int actualResult = processCommand.main(queueSize, numberToPick);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

}
