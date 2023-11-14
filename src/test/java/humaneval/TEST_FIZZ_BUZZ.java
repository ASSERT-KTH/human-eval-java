package humaneval;

public class TEST_FIZZ_BUZZ {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.FIZZ_BUZZ.fizz_buzz(50);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.FIZZ_BUZZ.fizz_buzz(78);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.FIZZ_BUZZ.fizz_buzz(79);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.FIZZ_BUZZ.fizz_buzz(100);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.FIZZ_BUZZ.fizz_buzz(200);
        org.junit.Assert.assertEquals(
            result, 6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.FIZZ_BUZZ.fizz_buzz(4000);
        org.junit.Assert.assertEquals(
            result, 192
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.FIZZ_BUZZ.fizz_buzz(10000);
        org.junit.Assert.assertEquals(
            result, 639
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.FIZZ_BUZZ.fizz_buzz(100000);
        org.junit.Assert.assertEquals(
            result, 8026
        );
    }
}
