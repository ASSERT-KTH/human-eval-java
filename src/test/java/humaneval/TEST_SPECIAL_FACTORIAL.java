package humaneval;

public class TEST_SPECIAL_FACTORIAL {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(288L, humaneval.buggy.SPECIAL_FACTORIAL.special_factorial(4));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(34560L, humaneval.buggy.SPECIAL_FACTORIAL.special_factorial(5));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(125411328000L, humaneval.buggy.SPECIAL_FACTORIAL.special_factorial(7));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1L, humaneval.buggy.SPECIAL_FACTORIAL.special_factorial(1));
    }
}
