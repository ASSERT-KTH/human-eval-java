package humaneval;

public class TEST_SUM_SQUARES {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1, 2, 3});
        org.junit.Assert.assertEquals(
            result, 6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1, 4, 9});
        org.junit.Assert.assertEquals(
            result, 14
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
        org.junit.Assert.assertEquals(
            result, 9
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {0});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1, -5, 2, -1, -5});
        org.junit.Assert.assertEquals(
            result, -126
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-56, -99, 1, 0, -2});
        org.junit.Assert.assertEquals(
            result, 3030
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1, 0, 0, 0, 0, 0, 0, 0, -1});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37});
        org.junit.Assert.assertEquals(
            result, -14196
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_SQUARES.sum_squares(new int[] {-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10});
        org.junit.Assert.assertEquals(
            result, -1448
        );
    }
}
