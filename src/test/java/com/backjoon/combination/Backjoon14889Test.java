package com.backjoon.combination;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon14889Test {

    @Test
    public void testCase01() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        int personCount = 4;
        int[][] score = {{0, 0, 0, 0, 0},
                        {0, 0, 1, 2, 3},
                        {0, 4, 0, 5, 6},
                        {0, 7, 1, 0, 2},
                        {0, 3, 4, 5, 0}};
        int expectedResultValue = 0;

        //WHEN - 실제 로직 수행
        Backjoon14889 backjoon14889 = new Backjoon14889();
        int actualResultValue = backjoon14889.main(personCount, score);

        //then
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void testCase02() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        int personCount = 6;
        int[][] score = {{0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 2, 3, 4, 5},
                        {0, 1, 0, 2, 3, 4, 5},
                        {0, 1, 2, 0, 3, 4, 5},
                        {0, 1, 2, 3, 0, 4, 5},
                        {0, 1, 2, 3, 4, 0, 5},
                        {0, 1, 2, 3, 4, 5, 0}};
        int expectedResultValue = 2;

        //WHEN - 실제 로직 수행
        Backjoon14889 backjoon14889 = new Backjoon14889();
        int actualResultValue = backjoon14889.main(personCount, score);

        //then
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void testCase03() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        int personCount = 8;
        int[][] score = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 5, 4, 5, 4, 5, 4, 5},
                        {0, 4, 0, 5, 1, 2, 3, 4, 5},
                        {0, 9, 8, 0, 1, 2, 3, 1, 2},
                        {0, 9, 9, 9, 0, 9, 9, 9, 9},
                        {0, 1, 1, 1, 1, 0, 1, 1, 1},
                        {0, 8, 7, 6, 5, 4, 0, 3, 2},
                        {0, 9, 1, 9, 1, 9, 1, 0, 9},
                        {0, 6, 5, 4, 3, 2, 1, 9, 0}};
        int expectedResultValue = 1;

        //WHEN - 실제 로직 수행
        Backjoon14889 backjoon14889 = new Backjoon14889();
        int actualResultValue = backjoon14889.main(personCount, score);

        //then
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void testCase04() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        int personCount = 4;
        int[][] score = {{0, 0, 0, 0, 0},
                        {0, 0, 8, 2, 3},
                        {0, 3, 0, 5, 4},
                        {0, 7, 1, 0, 1},
                        {0, 3, 4, 4, 0}};
        int expectedResultValue = 0;

        //WHEN - 실제 로직 수행
        Backjoon14889 backjoon14889 = new Backjoon14889();
        int actualResultValue = backjoon14889.main(personCount, score);

        //then
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

    @Test
    public void testCase05() {
        //GIVEN - 테스트케이스, 결과기댓값 준비
        int personCount = 4;
        int[][] score = {{0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 1},
                        {0, 1, 0, 1, 1},
                        {0, 1, 1, 0, 1},
                        {0, 1, 1, 1, 0}};
        int expectedResultValue = 0;

        //WHEN - 실제 로직 수행
        Backjoon14889 backjoon14889 = new Backjoon14889();
        int actualResultValue = backjoon14889.main(personCount, score);

        //then
        Assert.assertEquals(expectedResultValue, actualResultValue);
    }

}
