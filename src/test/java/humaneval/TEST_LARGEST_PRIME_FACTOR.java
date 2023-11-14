package humaneval;

public class TEST_LARGEST_PRIME_FACTOR {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(15);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(27);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(63);
        org.junit.Assert.assertEquals(
            result, 7
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(330);
        org.junit.Assert.assertEquals(
            result, 11
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.LARGEST_PRIME_FACTOR.largest_prime_factor(13195);
        org.junit.Assert.assertEquals(
            result, 29
        );
    }
}
