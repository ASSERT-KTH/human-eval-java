package humaneval;

public class TEST_IS_EQUAL_TO_SUM_EVEN {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(4));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(6));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(8));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(10));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(11));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(12));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(13));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(16));
    }
}
