package com.backjoon.greedy;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Backjoon13305Test {
    private Backjoon13305 processCommand;

    @Before
    public void prepareTest() {
        processCommand = new Backjoon13305();
    }

    @Test
    public void testCase1() {
        //GIVEN
        int[] distance = {2, 3, 1};
        int[] gasStation = {5, 2, 4, 1};
        int expectedResult = 18;

        //WHEN
        long actualResult = processCommand.main(distance, gasStation);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase2() {
        //GIVEN
        int[] distance = {3};
        int[] gasStation = {4, 3};
        int expectedResult = 12;

        //WHEN
        long actualResult = processCommand.main(distance, gasStation);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase3() {
        //GIVEN
        int[] distance = {5, 2};
        int[] gasStation = {1, 4, 3};
        int expectedResult = 7;

        //WHEN
        long actualResult = processCommand.main(distance, gasStation);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase4() {
        //GIVEN
        int[] distance = {8, 3, 5, 4, 1, 7};
        int[] gasStation = {4, 6, 7, 2, 4, 1, 3};
        int expectedResult = 81;

        //WHEN
        long actualResult = processCommand.main(distance, gasStation);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase5() {
        //GIVEN
        int[] distance = {4, 6};
        int[] gasStation = {5, 3, 2};
        int expectedResult = 38;

        //WHEN
        long actualResult = processCommand.main(distance, gasStation);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }
}
