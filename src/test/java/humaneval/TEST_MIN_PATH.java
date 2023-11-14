package humaneval;

public class TEST_MIN_PATH {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 3);
        int[] desired = {1, 2, 1};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[][] input = {{5, 9, 3}, {4, 1, 6}, {7, 8, 2}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 1);
        int[] desired = {1};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 4);
        int[] desired = {1, 2, 1, 2};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[][] input = {{6, 4, 13, 10}, {5, 7, 12, 1}, {3, 16, 11, 15}, {8, 14, 9, 2}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 7);
        int[] desired = {1, 10, 1, 10, 1, 10, 1};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[][] input = {{8, 14, 9, 2}, {6, 4, 13, 15}, {5, 7, 1, 12}, {3, 10, 11, 16}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 5);
        int[] desired = {1, 7, 1, 7, 1};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[][] input = {{11, 8, 7, 2}, {5, 16, 14, 4}, {9, 3, 15, 6}, {12, 13, 10, 1}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 9);
        int[] desired = {1, 6, 1, 6, 1, 6, 1, 6, 1};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[][] input = {{12, 13, 10, 1}, {9, 3, 15, 6}, {5, 16, 14, 4}, {11, 8, 7, 2}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 12);
        int[] desired = {1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int[][] input = {{2, 7, 4}, {3, 1, 5}, {6, 8, 9}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 8);
        int[] desired = {1, 3, 1, 3, 1, 3, 1, 3};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int[][] input = {{6, 1, 5}, {3, 8, 9}, {2, 7, 4}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 8);
        int[] desired = {1, 5, 1, 5, 1, 5, 1, 5};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int[][] input = {{1, 2}, {3, 4}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 10);
        int[] desired = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int[][] input = {{1, 3}, {3, 2}};
        int[] result = humaneval.buggy.MIN_PATH.min_path(input, 10);
        int[] desired = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
}
