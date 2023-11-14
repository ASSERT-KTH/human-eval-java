package humaneval;

public class TEST_SUM_SQUARED_NUMS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double[] input = {1,2,3};
        org.junit.Assert.assertEquals(14, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double[] input = {1.0, 2, 3};
        org.junit.Assert.assertEquals(14, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double[] input = {1, 3, 5, 7};
        org.junit.Assert.assertEquals(84, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        double[] input = {1.4, 4.2, 0};
        org.junit.Assert.assertEquals(29, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        double[] input = {-2.4,1,1};
        org.junit.Assert.assertEquals(6, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        double[] input = {100,1,15,2};
        org.junit.Assert.assertEquals(10230, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        double[] input = {10000,10000};
        org.junit.Assert.assertEquals(200000000, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        double[] input = {-1.4,4.6,6.3};
        org.junit.Assert.assertEquals(75, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        double[] input = {-1.4,17.9,18.9,19.9};
        org.junit.Assert.assertEquals(1086, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        double[] input = {0};
        org.junit.Assert.assertEquals(0, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        double[] input = {-1};
        org.junit.Assert.assertEquals(1, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        double[] input = {-1,1,0};
        org.junit.Assert.assertEquals(2, humaneval.buggy.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }
}
