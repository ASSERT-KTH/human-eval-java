package humaneval;

public class TEST_MAKE_PALINDROME {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.MAKE_PALINDROME.make_palindrome("");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.MAKE_PALINDROME.make_palindrome("x");
        org.junit.Assert.assertEquals(
            result, "x"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.MAKE_PALINDROME.make_palindrome("xyz");
        org.junit.Assert.assertEquals(
            result, "xyzyx"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.MAKE_PALINDROME.make_palindrome("xyx");
        org.junit.Assert.assertEquals(
            result, "xyx"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.MAKE_PALINDROME.make_palindrome("jerry");
        org.junit.Assert.assertEquals(
            result, "jerryrrej"
        );
    }
}
