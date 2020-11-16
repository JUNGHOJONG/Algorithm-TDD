package com.backjoon.combination;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon19942Test {

    @Test
    public void testCase1(){
        //GIVEN
        int materialCount = 6;
        int[] min = {100, 70, 90, 10};
        int[][] material = {{30, 55, 10, 8, 100},
                            {60, 10, 10, 2, 70},
                            {10, 80, 50, 0, 50},
                            {40, 30, 30, 8, 60},
                            {60, 10, 70, 2, 120},
                            {20, 70, 50, 4, 4}};
        String expectedResult = "134\n2 4 6 ";
        //WHEN
        String actualResult = Backjoon19942.main(materialCount, min, material);
        System.out.println("actual: " + actualResult);
        //THEN
        System.out.println(expectedResult.equals(actualResult));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int materialCount = 3;
        int[] min = {100, 70, 90, 10};
        int[][] material = {{30, 55, 10, 8, 100},
                            {60, 10, 10, 2, 70},
                            {10, 80, 50, 0, 50}};
        String expectedResult = "-1";
        //WHEN
        String actualResult = Backjoon19942.main(materialCount, min, material);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int materialCount = 3;
        int[] min = {100, 145, 70, 10};
        int[][] material = {{30, 55, 10, 8, 100},
                            {60, 10, 10, 2, 70},
                            {10, 80, 50, 0, 50}};
        String expectedResult = "220\n1 2 3 ";
        //WHEN
        String actualResult = Backjoon19942.main(materialCount, min, material);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int materialCount = 3;
        int[] min = {90, 65, 20, 10};
        int[][] material = {{30, 55, 10, 8, 100},
                            {60, 10, 10, 2, 70},
                            {10, 80, 50, 0, 50}};
        String expectedResult = "170\n1 2 ";
        //WHEN
        String actualResult = Backjoon19942.main(materialCount, min, material);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int materialCount = 3;
        int[] min = {40, 65, 20, 10};
        int[][] material = {{30, 55, 10, 3, 100},
                            {60, 10, 10, 2, 70},
                            {10, 80, 50, 7, 50}};
        String expectedResult = "150\n1 3 ";
        //WHEN
        String actualResult = Backjoon19942.main(materialCount, min, material);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
