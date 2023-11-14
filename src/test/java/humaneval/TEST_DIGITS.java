package humaneval;

public class TEST_DIGITS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(5));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(54));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, humaneval.buggy.DIGITS.digits(120));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, humaneval.buggy.DIGITS.digits(5014));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(315, humaneval.buggy.DIGITS.digits(98765));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(2625, humaneval.buggy.DIGITS.digits(5576543));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, humaneval.buggy.DIGITS.digits(2468));
    }
}
