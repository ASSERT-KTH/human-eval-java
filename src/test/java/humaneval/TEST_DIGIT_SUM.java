package humaneval;

public class TEST_DIGIT_SUM {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abAB");
        org.junit.Assert.assertEquals(
            result, 131
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("abcCd");
        org.junit.Assert.assertEquals(
            result, 67
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("helloE");
        org.junit.Assert.assertEquals(
            result, 69
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("woArBld");
        org.junit.Assert.assertEquals(
            result, 131
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("aAaaaXa");
        org.junit.Assert.assertEquals(
            result, 153
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum(" How are yOu?");
        org.junit.Assert.assertEquals(
            result, 151
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.DIGIT_SUM.digit_sum("You arE Very Smart");
        org.junit.Assert.assertEquals(
            result, 327
        );
    }
}
