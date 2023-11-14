package humaneval;

public class TEST_IS_SORTED {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] input = {5};
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] input = {1, 2, 3, 4, 5};
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] input = {1, 3, 2, 4, 5};
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] input = {1, 2, 3, 4, 5, 6};
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] input = {1, 3, 2, 4, 5, 6, 7};
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[] input = {};
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int[] input = {1};
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int[] input = {3, 2, 1};
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int[] input = {1, 2, 2, 2, 3, 4};
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int[] input = {1, 2, 3, 3, 3, 4};
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int[] input = {1, 2, 2, 3, 3, 4};
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int[] input = {1, 2, 3, 4};
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_SORTED.is_sorted(input));
    }
}
