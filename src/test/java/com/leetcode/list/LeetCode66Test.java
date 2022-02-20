package com.leetcode.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeetCode66Test {

    private LeetCode66 leetCode66;

    @Before
    public void init() {
        leetCode66 = new LeetCode66();
    }

    @Test
    public void test1() {
        // GIVEN
        int[] test = {9, 9, 9};

        // WHEN
        int[] result = leetCode66.mains(test);

        // THEN
        Assert.assertArrayEquals(new int[]{1, 0, 0, 0}, result);
    }

    @Test
    public void test2() {
        // GIVEN
        int[] test = {9, 8, 9};

        // WHEN
        int[] result = leetCode66.mains(test);

        // THEN
        Assert.assertArrayEquals(new int[]{9, 9, 0}, result);
    }

    @Test
    public void test3() {
        // GIVEN
        int[] test = {8, 9, 9};

        // WHEN
        int[] result = leetCode66.mains(test);

        // THEN
        Assert.assertArrayEquals(new int[]{9, 0, 0}, result);
    }
}
