package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_MAXIMUM_K {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3, -4, 5));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-4, -3, 5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, -4, 4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4, 4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3, 2, 1, 2, -1, -2, 1));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(123, -123, 20, 0 , 1, 2, -3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2, 20, 123));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-123, 20, 0 , 1, 2, -3));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 4);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0, 1, 2, 20));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 15, 0, 3, -13, -8, 0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-13, -8, 0, 0, 3, 5, 15));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, 0, 2, 5, 3, -10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3, 5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 0, 5, -7));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, -4));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-4, 4));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-10, 10));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 2);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-10, 10));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, -23, 243, -400, 0));
        ArrayList<Integer> result = humaneval.buggy.MAXIMUM_K.maximum_k(input, 0);
        ArrayList<Integer> desired = new ArrayList<>();
        org.junit.Assert.assertEquals(desired, result);
    }
}
