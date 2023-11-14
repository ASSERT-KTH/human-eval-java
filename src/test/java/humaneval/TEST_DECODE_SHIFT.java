package humaneval;

public class TEST_DECODE_SHIFT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String input = "asdjkhv";
        String result = humaneval.buggy.DECODE_SHIFT.decode_shift(
            humaneval.buggy.DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String input = "asfiocawmn";
        String result = humaneval.buggy.DECODE_SHIFT.decode_shift(
            humaneval.buggy.DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String input = "qwerttyu";
        String result = humaneval.buggy.DECODE_SHIFT.decode_shift(
            humaneval.buggy.DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String input = "plmoknijbuhv";
        String result = humaneval.buggy.DECODE_SHIFT.decode_shift(
            humaneval.buggy.DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String input = "zxyghasidbwayzyyy";
        String result = humaneval.buggy.DECODE_SHIFT.decode_shift(
            humaneval.buggy.DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }
}
