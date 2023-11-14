package humaneval;

public class TEST_COMMON {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {1, 4, 3, 34, 653, 2, 5}, new int[] {5, 7, 1, 5, 9, 653, 121}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 5, 653}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {5, 3, 2, 8}, new int[] {3, 2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 3}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4, 3, 2, 8}, new int[] {3, 2, 4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 3, 4}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMMON.common(
            new int[] {4, 3, 2, 8}, new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
}
