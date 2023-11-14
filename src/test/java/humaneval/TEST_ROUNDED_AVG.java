package humaneval;

public class TEST_ROUNDED_AVG {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(1, 5);
        String desired = "11";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(7, 13);
        String desired = "1010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(964, 977);
        String desired = "1111001010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(996, 997);
        String desired = "1111100100";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(560, 851);
        String desired = "1011000001";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(185, 546);
        String desired = "101101101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(362, 496);
        String desired = "110101101";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(350, 902);
        String desired = "1001110010";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(197, 233);
        String desired = "11010111";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(7, 5);
        String desired = "-1";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5, 1);
        String desired = "-1";
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.ROUNDED_AVG.rounded_avg(5, 5);
        String desired = "101";
        org.junit.Assert.assertEquals(result, desired);
    }
}