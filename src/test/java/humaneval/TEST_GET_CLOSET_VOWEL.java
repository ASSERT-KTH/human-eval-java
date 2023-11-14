package humaneval;

public class TEST_GET_CLOSET_VOWEL {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("yogurt");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("full");
        org.junit.Assert.assertEquals("u", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("easy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("eAsy");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ali");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("bad");
        org.junit.Assert.assertEquals("a", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("most");
        org.junit.Assert.assertEquals("o", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ab");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("ba");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("quick");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("anime");
        org.junit.Assert.assertEquals("i", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Asia");
        org.junit.Assert.assertEquals("", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.GET_CLOSET_VOWEL.get_closet_vowel("Above");
        org.junit.Assert.assertEquals("o", result);
    }
}
