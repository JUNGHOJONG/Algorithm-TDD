package com.backjoon.simulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class Backjoon7785Test {
    private Backjoon7785 processCommand;

    @Before
    public void prepareTest() {
        processCommand = new Backjoon7785();
    }

    @Test
    public void testCase1() {
        //GIVEN
        String[][] logs = {{"Baha", "enter"},
                            {"Askar", "enter"},
                            {"Baha", "leave"},
                            {"Artem", "enter"}};
        String[] expectedResult = {"Askar", "Artem"};

        //WHEN
        Iterator<String> actualResult = processCommand.main(logs);

        //THEN
        int index = 0;
        while (actualResult.hasNext()) {
            Assert.assertEquals(expectedResult[index], actualResult.next());
            index++;
        }
    }

    @Test
    public void testCase2() {
        //GIVEN
        String[][] logs = {{"B", "enter"},
                            {"A", "enter"},
                            {"B", "leave"},
                            {"C", "enter"},
                            {"D", "enter"}};
        String[] expectedResult = {"D", "C", "A"};

        //WHEN
        Iterator<String> actualResult = processCommand.main(logs);

        //THEN
        int index = 0;
        while (actualResult.hasNext()) {
            Assert.assertEquals(expectedResult[index], actualResult.next());
            index++;
        }
    }

    @Test
    public void testCase3() {
        //GIVEN
        String[][] logs = {{"b", "enter"},
                            {"A", "enter"},
                            {"B", "enter"},
                            {"c", "enter"},
                            {"D", "enter"}};
        String[] expectedResult = {"c", "b", "D", "B", "A"};

        //WHEN
        Iterator<String> actualResult = processCommand.main(logs);

        //THEN
        int index = 0;
        while (actualResult.hasNext()) {
            Assert.assertEquals(expectedResult[index], actualResult.next());
            index++;
        }
    }

    @Test
    public void testCase4() {
        //GIVEN
        String[][] logs = {{"b", "enter"},
                            {"b", "leave"},
                            {"B", "enter"}};
        String[] expectedResult = {"B"};

        //WHEN
        Iterator<String> actualResult = processCommand.main(logs);

        //THEN
        int index = 0;
        while (actualResult.hasNext()) {
            Assert.assertEquals(expectedResult[index], actualResult.next());
            index++;
        }
    }

    @Test
    public void testCase5() {
        //GIVEN
        String[][] logs = {{"b", "enter"},
                            {"B", "enter"},
                            {"c", "enter"},
                            {"D", "enter"},
                            {"d", "enter"},
                            {"B", "leave"}};
        String[] expectedResult = {"d", "c", "b", "D"};

        //WHEN
        Iterator<String> actualResult = processCommand.main(logs);

        //THEN
        int index = 0;
        while (actualResult.hasNext()) {
            Assert.assertEquals(expectedResult[index], actualResult.next());
            index++;
        }
    }
}
