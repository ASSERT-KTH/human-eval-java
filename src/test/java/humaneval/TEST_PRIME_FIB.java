package humaneval;

public class TEST_PRIME_FIB {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(1);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(2);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(3);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(4);
        org.junit.Assert.assertEquals(
            result, 13
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(5);
        org.junit.Assert.assertEquals(
            result, 89
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(6);
        org.junit.Assert.assertEquals(
            result, 233
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(7);
        org.junit.Assert.assertEquals(
            result, 1597
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(8);
        org.junit.Assert.assertEquals(
            result, 28657
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(9);
        org.junit.Assert.assertEquals(
            result, 514229
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.PRIME_FIB.prime_fib(10);
        org.junit.Assert.assertEquals(
            result, 433494437
        );
    }
}
