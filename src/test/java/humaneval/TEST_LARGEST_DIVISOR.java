package humaneval;

public class TEST_LARGEST_DIVISOR {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(3);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(7);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(10);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(100);
        org.junit.Assert.assertEquals(
            result, 50
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_DIVISOR.largest_divisor(49);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }
}
