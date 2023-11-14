package humaneval;

import java.util.Arrays;

public class TEST_PAIRS_SUM_TO_ZERO {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(1, 3, 5, 0)
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(1, 3, -2, 1)
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(1, 2, 3, 7)
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(2, 4, -5, 3, 5, 7)
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(1)
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(-3, 9, -1, 3, 2, 30)
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(-3, 9, -1, 3, 2, 31)
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(-3, 9, -1, 4, 2, 30)
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(-3, 9, -1, 4, 2, 31)
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}
