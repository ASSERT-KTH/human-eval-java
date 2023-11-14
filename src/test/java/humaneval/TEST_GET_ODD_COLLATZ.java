package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_GET_ODD_COLLATZ {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(14);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1, 5, 7, 11, 13, 17));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(5);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1, 5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(12);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1, 3, 5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.GET_ODD_COLLATZ.get_odd_collatz(1);
        ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(1));
        org.junit.Assert.assertEquals(desired, result);
    }
}
