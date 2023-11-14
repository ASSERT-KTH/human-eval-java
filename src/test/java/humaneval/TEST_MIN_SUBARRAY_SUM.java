package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_MIN_SUBARRAY_SUM {
    @org.junit.Test(timeout=3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(2L, 3L, 4L, 1L, 2L, 4L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(1, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-1L, -2L, -3L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(-6, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-1L, -2L, -3L, 2L, -10L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(-14, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-9999999999999999L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(-9999999999999999L, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(0L, 10L, 20L, 1000000L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(0L, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-1L, -2L, -3L, 10L, -5L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(-6L, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(100L, -1L, -2L, -3L, 10L, -5L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(-6L, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(10L, 11L, 13L, 8L, 3L, 4L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(3L, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(100L, -33L, 32L, -1L, 0L, -2L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(-33L, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_9() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-10L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(-10L, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_10() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(7L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(7L, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_11() throws java.lang.Exception {
        ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(1L, -1L));
        long result = humaneval.buggy.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        org.junit.Assert.assertEquals(-1L, result);
    }
}
