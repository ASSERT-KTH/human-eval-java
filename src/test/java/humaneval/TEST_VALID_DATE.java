package humaneval;

public class TEST_VALID_DATE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("03-11-2000"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("15-01-2012"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-0-2040"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("06-04-2020"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("01-01-2007"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("03-32-2011"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date(""));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-3000"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.VALID_DATE.valid_date("06-06-2005"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("21-31-2000"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-31-2003"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04122003"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("20030412"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2003-04"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("2003-04-12"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.VALID_DATE.valid_date("04-2003"));
    }
}
