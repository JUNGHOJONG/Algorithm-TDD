package com.backjoon.sort;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon1302Test {

    @Test
    public void testCase1(){
        //GIVEN
        String[] books = {"top", "top", "top", "top", "top", "kimtop"};
        String expectedResult = "top";

        //WHEN
        String actualResult = Backjoon1302.mains(books);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        String[] books = {"top"};
        String expectedResult = "top";

        //WHEN
        String actualResult = Backjoon1302.mains(books);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        String[] books = {"kim", "kim", "stop", "top", "top", "kimtop"};
        String expectedResult = "kim";

        //WHEN
        String actualResult = Backjoon1302.mains(books);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        String[] books = {"top", "kim", "kimss", "total", "ace", "gee"};
        String expectedResult = "ace";

        //WHEN
        String actualResult = Backjoon1302.mains(books);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        String[] books = {"ace", "aceee", "ceee"};
        String expectedResult = "ace";

        //WHEN
        String actualResult = Backjoon1302.mains(books);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

}