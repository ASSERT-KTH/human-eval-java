package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_BELOW_ZERO {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_ZERO.below_zero(
            new ArrayList<Integer>()
        );
        org.junit.Assert.assertEquals(result, false);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_ZERO.below_zero(
            new ArrayList<Integer>(Arrays.asList(1, 2, -3, 1, 2, -3))
        );
        org.junit.Assert.assertEquals(result, false);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_ZERO.below_zero(
            new ArrayList<Integer>(Arrays.asList(1, 2, -4, 5, 6))
        );
        org.junit.Assert.assertEquals(result, true);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_ZERO.below_zero(
            new ArrayList<Integer>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4))
        );
        org.junit.Assert.assertEquals(result, false);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_ZERO.below_zero(
            new ArrayList<Integer>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5))
        );
        org.junit.Assert.assertEquals(result, true);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_ZERO.below_zero(
            new ArrayList<Integer>(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4))
        );
        org.junit.Assert.assertEquals(result, true);
    }
}
