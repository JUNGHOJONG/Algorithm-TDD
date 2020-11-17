package com.backjoon.dfs;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon9066Test {

    @Test
    public void testCase1(){
        //GIVEN
        int mapSize = 4;
        Character[][] map = {{'H', 'V', 'V', 'H'},
                            {'V', 'V', 'H', 'V'},
                            {'V', 'H', 'V', 'V'},
                            {'H', 'V', 'V', 'H'}};
        int expectedResult = 2;
        //WHEN
        int actualResult = Backjoon9066.main(mapSize, map);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int mapSize = 4;
        Character[][] map = {{'H', 'V', 'H', 'H'},
                            {'H', 'V', 'H', 'H'},
                            {'V', 'V', 'V', 'V'},
                            {'H', 'V', 'H', 'H'}};
        int expectedResult = 1;
        //WHEN
        int actualResult = Backjoon9066.main(mapSize, map);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int mapSize = 4;
        Character[][] map = {{'H', 'V', 'V', 'V'},
                            {'V', 'V', 'H', 'H'},
                            {'V', 'H', 'H', 'V'},
                            {'V', 'H', 'V', 'H'}};
        int expectedResult = 3;
        //WHEN
        int actualResult = Backjoon9066.main(mapSize, map);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int mapSize = 4;
        Character[][] map = {{'V', 'V', 'V', 'H'},
                            {'V', 'H', 'H', 'V'},
                            {'V', 'H', 'H', 'V'},
                            {'H', 'V', 'V', 'V'}};
        int expectedResult = 2;
        //WHEN
        int actualResult = Backjoon9066.main(mapSize, map);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int mapSize = 4;
        Character[][] map = {{'H', 'H', 'H', 'V'},
                            {'H', 'H', 'H', 'V'},
                            {'H', 'H', 'H', 'V'},
                            {'V', 'V', 'V', 'V'}};
        int expectedResult = 1;
        //WHEN
        int actualResult = Backjoon9066.main(mapSize, map);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

}
