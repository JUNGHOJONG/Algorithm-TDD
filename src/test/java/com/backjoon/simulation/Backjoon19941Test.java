package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Test;

public class Backjoon19941Test {

    @Test
    public void testCase1(){
        //GIVEN
        int selectableDistance = 1;
        String personAndHamburgerPosition = "HHPHPPHHPPHPPPHPHPHP";
        int expectedResult = 8;
        //WHEN
        int actualResult = Backjoon19941.main(selectableDistance, personAndHamburgerPosition);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2(){
        //GIVEN
        int selectableDistance = 2;
        String personAndHamburgerPosition = "HHHHHPPPPPHPHPHPHHHP";
        int expectedResult = 7;
        //WHEN
        int actualResult = Backjoon19941.main(selectableDistance, personAndHamburgerPosition);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3(){
        //GIVEN
        int selectableDistance = 1;
        String personAndHamburgerPosition = "HPHPHPHPHPHPHPHPHP";
        int expectedResult = 9;
        //WHEN
        int actualResult = Backjoon19941.main(selectableDistance, personAndHamburgerPosition);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4(){
        //GIVEN
        int selectableDistance = 5;
        String personAndHamburgerPosition = "HPHPHPHPHPHPHPHPHP";
        int expectedResult = 9;
        //WHEN
        int actualResult = Backjoon19941.main(selectableDistance, personAndHamburgerPosition);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase5(){
        //GIVEN
        int selectableDistance = 5;
        String personAndHamburgerPosition = "PHPHHPHHHP";
        int expectedResult = 4;
        //WHEN
        int actualResult = Backjoon19941.main(selectableDistance, personAndHamburgerPosition);
        //THEN
        Assert.assertEquals(expectedResult, actualResult);
    }
}
