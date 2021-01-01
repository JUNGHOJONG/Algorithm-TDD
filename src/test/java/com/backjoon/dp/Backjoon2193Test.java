package com.backjoon.dp;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Backjoon2193Test {
    private Backjoon2193 backjoon2193;

    @Before
    public void prepareTest() {
        backjoon2193 = new Backjoon2193();
    }

    @Test
    public void testCase1() {
        int pinaryNumberOfDigits = 1;

        int expectedResult = 1;

        long actualResult = backjoon2193.main(pinaryNumberOfDigits);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase2() {
        int pinaryNumberOfDigits = 2;

        int expectedResult = 1;

        long actualResult = backjoon2193.main(pinaryNumberOfDigits);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase3() {
        int pinaryNumberOfDigits = 3;

        int expectedResult = 2;

        long actualResult = backjoon2193.main(pinaryNumberOfDigits);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase4() {
        int pinaryNumberOfDigits = 10;

        int expectedResult = 55;

        long actualResult = backjoon2193.main(pinaryNumberOfDigits);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase5() {
        int pinaryNumberOfDigits = 15;

        int expectedResult = 610;

        long actualResult = backjoon2193.main(pinaryNumberOfDigits);

        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }
}
