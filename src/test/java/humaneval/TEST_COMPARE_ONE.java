package humaneval;

public class TEST_COMPARE_ONE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(2, humaneval.buggy.COMPARE_ONE.compare_one(1, 2));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(2.5, humaneval.buggy.COMPARE_ONE.compare_one(1, 2.5));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(3, humaneval.buggy.COMPARE_ONE.compare_one(2, 3));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(6, humaneval.buggy.COMPARE_ONE.compare_one(5, 6));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals("2,3", humaneval.buggy.COMPARE_ONE.compare_one(1, "2,3"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals("6", humaneval.buggy.COMPARE_ONE.compare_one("5,1", "6"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals("2", humaneval.buggy.COMPARE_ONE.compare_one("1", "2"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        org.junit.Assert.assertEquals(null, humaneval.buggy.COMPARE_ONE.compare_one("1", 1));
    }
}
