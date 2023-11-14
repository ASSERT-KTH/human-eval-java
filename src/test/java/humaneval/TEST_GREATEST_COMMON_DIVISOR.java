package humaneval;

public class TEST_GREATEST_COMMON_DIVISOR {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(3, 7);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(49, 14);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.GREATEST_COMMON_DIVISOR.greatest_common_divisor(144, 60);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
}
