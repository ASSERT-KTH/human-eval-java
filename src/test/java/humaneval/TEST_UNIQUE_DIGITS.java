package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_UNIQUE_DIGITS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(15, 33, 1422, 1));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1, 15, 33));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(152, 323, 1422, 10));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>();
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(12345, 2033, 111, 151));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(111, 151));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(135, 103, 31));
        ArrayList<Integer> result = humaneval.buggy.UNIQUE_DIGITS.unique_digits(input);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(31, 135));
        org.junit.Assert.assertEquals(result, desired);
    }
}
