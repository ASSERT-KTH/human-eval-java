package humaneval;

public class TEST_STRING_XOR {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_XOR.string_xor("111000", "101010");
        org.junit.Assert.assertEquals(
            result, "010010"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_XOR.string_xor("1", "1");
        org.junit.Assert.assertEquals(
            result, "0"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_XOR.string_xor("0101", "0000");
        org.junit.Assert.assertEquals(
            result, "0101"
        );
    }
}
