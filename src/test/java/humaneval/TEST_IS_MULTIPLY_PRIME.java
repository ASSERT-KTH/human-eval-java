package humaneval;

public class TEST_IS_MULTIPLY_PRIME {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(30);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(125);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(3 * 5 * 7);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(3 * 6 * 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(9 * 9 * 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(11 * 9 * 9);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_MULTIPLY_PRIME.is_multiply_prime(11 * 13 * 7);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
}
