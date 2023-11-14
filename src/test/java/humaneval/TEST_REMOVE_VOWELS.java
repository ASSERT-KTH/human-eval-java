package humaneval;

public class TEST_REMOVE_VOWELS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.REMOVE_VOWELS.remove_vowels("");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.REMOVE_VOWELS.remove_vowels("abcdef\nghijklm");
        org.junit.Assert.assertEquals(
            result, "bcdf\nghjklm"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.REMOVE_VOWELS.remove_vowels("fedcba");
        org.junit.Assert.assertEquals(
            result, "fdcb"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.REMOVE_VOWELS.remove_vowels("eeeee");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.REMOVE_VOWELS.remove_vowels("acBAA");
        org.junit.Assert.assertEquals(
            result, "cB"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.REMOVE_VOWELS.remove_vowels("EcBOO");
        org.junit.Assert.assertEquals(
            result, "cB"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.REMOVE_VOWELS.remove_vowels("ybcd");
        org.junit.Assert.assertEquals(
            result, "ybcd"
        );
    }
}
