package humaneval;

public class TEST_SORT_ARRAY {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2, 4, 3, 0, 1, 5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0, 1, 2, 3, 4, 5}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2, 4, 3, 0, 1, 5, 6}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6, 5, 4, 3, 2, 1, 0}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {2, 1}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 2}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {15, 42, 87, 32, 11, 0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0, 11, 15, 32, 42, 87}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[] result = humaneval.buggy.SORT_ARRAY.sort_array(
            new int[] {21, 14, 23, 11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {23, 21, 14, 11}
        );
    }
}
