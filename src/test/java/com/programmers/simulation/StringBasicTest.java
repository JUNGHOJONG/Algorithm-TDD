package com.programmers.simulation;

import org.junit.Assert;
import org.junit.Test;

public class StringBasicTest {

    @Test
    public void testCase1(){
        //GIVEN
        String s = "a234";
        boolean expectedResult = false;
        //WHEN
        boolean actualResult = StringBasic.main(s);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        String s = "1234";
        boolean expectedResult = true;
        //WHEN
        boolean actualResult = StringBasic.main(s);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        String s = "12";
        boolean expectedResult = false;
        //WHEN
        boolean actualResult = StringBasic.main(s);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        String s = "1 24";
        boolean expectedResult = false;
        //WHEN
        boolean actualResult = StringBasic.main(s);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        String s = "94735";
        boolean expectedResult = false;
        //WHEN
        boolean actualResult = StringBasic.main(s);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
