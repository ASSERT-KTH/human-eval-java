package humaneval;

public class TEST_VOWELS_COUNT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.VOWELS_COUNT.vowels_count("abcde");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.VOWELS_COUNT.vowels_count("Alone");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.VOWELS_COUNT.vowels_count("key");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.VOWELS_COUNT.vowels_count("bye");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.VOWELS_COUNT.vowels_count("keY");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.VOWELS_COUNT.vowels_count("bYe");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.VOWELS_COUNT.vowels_count("ACEDY");
        org.junit.Assert.assertEquals(
            result, 3
        );
    }
}
