package humaneval;

public class TEST_LARGEST_SMALLEST_INTEGERS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] input = {2, 4, 1, 3, 5, 7};
        int[] result = {0, 1};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] input = {2, 4, 1, 3, 5, 7, 0};
        int[] result = {0, 1};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] input = {1, 3, 2, 4, 5, 6, -2};
        int[] result = {-2, 1};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] input = {4, 5, 3, 6, 2, 7, -7};
        int[] result = {-7, 2};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] input = {7, 3, 8, 4, 9, 2, 5, -9};
        int[] result = {-9, 2};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] input = {};
        int[] result = {0, 0};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[] input = {0};
        int[] result = {0, 0};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int[] input = {-1, -3, -5, -6};
        int[] result = {-1, 0};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int[] input = {-1, -3, -5, -6, 0};
        int[] result = {-1, 0};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int[] input = {-6, -4, -4, -3, 1};
        int[] result = {-3, 1};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int[] input = {-6, -4, -4, -3, -100, 1};
        int[] result = {-3, 1};
        org.junit.Assert.assertArrayEquals(result, humaneval.buggy.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
}
