package com.backjoon.simulation;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Backjoon9375Test {
    private Backjoon9375 processCommand;

    @Before
    public void prepareTest() {
        processCommand = new Backjoon9375();
    }

    @Test
    public void testCase1() {
        //GIVEN
        String[][] clothes = {{"hat", "headgear"},
                                {"sunglasses", "eyewear"},
                                {"turban","headgear"}};
        int expectedResult = 5;

        //WHEN
        int actualResult = processCommand.main(clothes);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase2() {
        //GIVEN
        String[][] clothes = {{"mask", "face"},
                                {"sunglasses", "face"},
                                {"makeup","face"}};
        int expectedResult = 3;

        //WHEN
        int actualResult = processCommand.main(clothes);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase3() {
        //GIVEN
        String[][] clothes = {{"mask", "face"},
                            {"sunglasses", "face"},
                            {"makeup","face"},
                            {"hat", "headgear"},
                            {"glasses", "eyewear"},
                            {"turban","headgear"}};
        int expectedResult = 23;

        //WHEN
        int actualResult = processCommand.main(clothes);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase4() {
        //GIVEN
        String[][] clothes = {{"mask", "face"},
                                {"glasses", "eyewear"},
                                {"turban","headgear"}};
        int expectedResult = 7;

        //WHEN
        int actualResult = processCommand.main(clothes);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testCase5() {
        //GIVEN
        String[][] clothes = {{"mask", "face"}};
        int expectedResult = 1;

        //WHEN
        int actualResult = processCommand.main(clothes);

        //THEN
        Assert.assertThat(actualResult, CoreMatchers.is(expectedResult));
    }
}
