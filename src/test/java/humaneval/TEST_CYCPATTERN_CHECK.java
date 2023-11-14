package humaneval;

public class TEST_CYCPATTERN_CHECK {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("xyzw", "xyw");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("yello", "ell");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("whattup", "ptut");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("efef", "fee");
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("abab", "aabb");
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.CYCPATTERN_CHECK.cycpattern_check("winemtt", "tinem");
        org.junit.Assert.assertEquals(
            result, true
        );
    }
}
