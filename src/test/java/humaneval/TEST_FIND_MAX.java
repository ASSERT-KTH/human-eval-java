package humaneval;

public class TEST_FIND_MAX {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"name", "of", "string"}
        );
        org.junit.Assert.assertEquals(
            result, "string"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"name", "enam", "game"}
        );
        org.junit.Assert.assertEquals(
            result, "enam"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"aaaaaaa", "bb", "cc"}
        );
        org.junit.Assert.assertEquals(
            result, "aaaaaaa"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"abc", "cba"}
        );
        org.junit.Assert.assertEquals(
            result, "abc"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"play", "this", "game", "of", "footbott"}
        );
        org.junit.Assert.assertEquals(
            result, "footbott"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"we", "are", "gonna", "rock"}
        );
        org.junit.Assert.assertEquals(
            result, "gonna"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"we", "are", "a", "mad", "nation"}
        );
        org.junit.Assert.assertEquals(
            result, "nation"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"this", "is", "a", "prrk"}
        );
        org.junit.Assert.assertEquals(
            result, "this"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"b"}
        );
        org.junit.Assert.assertEquals(
            result, "b"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.FIND_MAX.find_max(
            new String[] {"play", "play", "play"}
        );
        org.junit.Assert.assertEquals(
            result, "play"
        );
    }
}
