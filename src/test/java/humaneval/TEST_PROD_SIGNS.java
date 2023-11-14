package humaneval;

public class TEST_PROD_SIGNS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] arr = {1, 2, 2, -4};
        org.junit.Assert.assertEquals(-9, humaneval.buggy.PROD_SIGNS.prod_signs(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] arr = {0, 1};
        org.junit.Assert.assertEquals(0, humaneval.buggy.PROD_SIGNS.prod_signs(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] arr = {1, 1, 1, 2, 3, -1, 1};
        org.junit.Assert.assertEquals(-10, humaneval.buggy.PROD_SIGNS.prod_signs(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] arr = {};
        org.junit.Assert.assertEquals(-10, humaneval.buggy.PROD_SIGNS.prod_signs(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] arr = {2, 4, 1, 2, -1, -1, 9};
        org.junit.Assert.assertEquals(20, humaneval.buggy.PROD_SIGNS.prod_signs(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] arr = {-1, 1, -1, 1};
        org.junit.Assert.assertEquals(4, humaneval.buggy.PROD_SIGNS.prod_signs(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[] arr = {-1, 1, 1, 1};
        org.junit.Assert.assertEquals(-4, humaneval.buggy.PROD_SIGNS.prod_signs(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int[] arr = {-1, 1, 1, 0};
        org.junit.Assert.assertEquals(0, humaneval.buggy.PROD_SIGNS.prod_signs(arr));
    }
}
