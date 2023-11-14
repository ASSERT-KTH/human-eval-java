package humaneval;

import java.util.Arrays;

public class TEST_SORT_EVEN {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_EVEN.sort_even(
            new int[] {1, 2, 3}
        );
        org.junit.Assert.assertTrue(
            Arrays.equals(result, new int[] {1, 2, 3})
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_EVEN.sort_even(
            new int[] {5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10}
        );
        org.junit.Assert.assertTrue(
            Arrays.equals(result, new int[] {-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123})
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_EVEN.sort_even(
            new int[] {5, 8, -12, 4, 23, 2, 3, 11, 12, -10}
        );
        org.junit.Assert.assertTrue(
            Arrays.equals(result, new int[] {-12, 8, 3, 4, 5, 2, 12, 11, 23, -10})
        );
    }
}
