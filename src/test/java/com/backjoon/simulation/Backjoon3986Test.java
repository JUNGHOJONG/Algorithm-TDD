package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon3986Test {

    @Test
    public void testCase1(){
        //GIVEN
        String[] words = {"ABAB", "AABB", "ABBA"};
        int expectedResult = 2;

        //WHEN
        int actualResult = Backjoon3986.mains(words);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        String[] words = {"ABBAB", "ABBABB", "ABBA"};
        int expectedResult = 2;

        //WHEN
        int actualResult = Backjoon3986.mains(words);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        String[] words = {"ABABA", "ABBBA"};
        int expectedResult = 0;

        //WHEN
        int actualResult = Backjoon3986.mains(words);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        String[] words = {"AB", "AA", "BB", "BA"};
        int expectedResult = 2;

        //WHEN
        int actualResult = Backjoon3986.mains(words);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        String[] words = {"BABBAB"};
        int expectedResult = 1;

        //WHEN
        int actualResult = Backjoon3986.mains(words);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase6(){
        //GIVEN
        String[] words = {"AAAAA", "AAAAB"};
        int expectedResult = 0;

        //WHEN
        int actualResult = Backjoon3986.mains(words);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
