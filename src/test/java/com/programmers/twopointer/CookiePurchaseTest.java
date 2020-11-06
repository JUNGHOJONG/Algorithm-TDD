package com.programmers.twopointer;

import org.junit.Assert;
import org.junit.Test;

public class CookiePurchaseTest {

    @Test
    public void testCase1(){
        //GIVEN
        int[] cookie = {100, 1, 1, 1, 1};
        int expectedResult = 2;

        //WHEN
        CookiePurchase processCommand = new CookiePurchase();
        int actualResult = processCommand.main(cookie);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int[] cookie = {1, 1, 1, 1, 1};
        int expectedResult = 2;

        //WHEN
        CookiePurchase processCommand = new CookiePurchase();
        int actualResult = processCommand.main(cookie);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int[] cookie = {1, 1, 2, 3};
        int expectedResult = 3;

        //WHEN
        CookiePurchase processCommand = new CookiePurchase();
        int actualResult = processCommand.main(cookie);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int[] cookie = {1, 2, 4, 5};
        int expectedResult = 0;

        //WHEN
        CookiePurchase processCommand = new CookiePurchase();
        int actualResult = processCommand.main(cookie);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int[] cookie = {2, 3, 1, 4, 2, 1, 3};
        int expectedResult = 6;

        //WHEN
        CookiePurchase processCommand = new CookiePurchase();
        int actualResult = processCommand.main(cookie);

        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
