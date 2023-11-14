package humaneval;

public class TEST_SAME_CHARS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.SAME_CHARS.same_chars("eabcdzzzz", "dddzzzzzzzddeddabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.SAME_CHARS.same_chars("abcd", "dddddddabc");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.SAME_CHARS.same_chars("dddddddabc", "abcd");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.SAME_CHARS.same_chars("eabcd", "dddddddabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.SAME_CHARS.same_chars("abcd", "dddddddabcf");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.SAME_CHARS.same_chars("eabcdzzzz", "dddzzzzzzzddddabc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.SAME_CHARS.same_chars("aabb", "aaccc");
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}
