package com.backjoon.dfs;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon1107Test {

    @Test
    public void testCase1(){
        //GIVEN
        int page = 5457;
        int[] broken = {6, 7, 8};
        int expectedResult = 6;
        //WHEN
        int actualResult = Backjoon1107.main(page, broken);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int page = 100;
        int[] broken = {1, 0, 5};
        int expectedResult = 0;
        //WHEN
        int actualResult = Backjoon1107.main(page, broken);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int page = 100;
        int[] broken = {};
        int expectedResult = 0;
        //WHEN
        int actualResult = Backjoon1107.main(page, broken);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int page = 151241;
        int[] broken = {0, 1, 2, 3, 4, 7, 8, 9};
        int expectedResult = 84580;
        //WHEN
        int actualResult = Backjoon1107.main(page, broken);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int page = 99999;
        int[] broken = {0, 2, 3, 4, 5, 6, 7, 8, 9};
        int expectedResult = 11118;
        //WHEN
        int actualResult = Backjoon1107.main(page, broken);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
