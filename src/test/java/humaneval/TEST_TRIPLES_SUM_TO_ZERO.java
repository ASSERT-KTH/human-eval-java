package humaneval;

public class TEST_TRIPLES_SUM_TO_ZERO {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 3, 5, 0}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 3, 5, -1}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 3, -2, 1}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 2, 3, 7}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 2, 5, 7}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {2, 4, -5, 3, 9, 7}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 3, 5, -100}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {100, 3, 5, -100}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}
