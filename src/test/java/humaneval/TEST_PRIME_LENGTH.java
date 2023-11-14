package humaneval;

public class TEST_PRIME_LENGTH {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("Hello");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("abcdcba");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("kittens");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("orange");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("wow");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("world");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("MadaM");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("Wow");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("HI");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("go");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("gogo");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("aaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        boolean result = humaneval.buggy.PRIME_LENGTH.prime_length("M");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}
