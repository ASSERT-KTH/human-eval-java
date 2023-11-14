package humaneval;

public class TEST_IS_NESTED {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_NESTED.is_nested("[[]]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested("[]]]]]]][[[[[]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested("[][]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested("[]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_NESTED.is_nested("[[[[]]]]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested("[]]]]]]]]]]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_NESTED.is_nested("[][][[]]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested("[[]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested("[]]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_NESTED.is_nested("[[]][["));
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.IS_NESTED.is_nested("[[][]]"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested(""));
    }
    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested("[[[[[[[["));
    }
    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.IS_NESTED.is_nested("]]]]]]]]"));
    }
}
