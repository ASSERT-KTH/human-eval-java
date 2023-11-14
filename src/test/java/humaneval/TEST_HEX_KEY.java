package humaneval;

public class TEST_HEX_KEY {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.HEX_KEY.hex_key("AB");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.HEX_KEY.hex_key("1077E");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.HEX_KEY.hex_key("ABED1A33");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.HEX_KEY.hex_key("2020");
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.HEX_KEY.hex_key("123456789ABCDEF0");
        org.junit.Assert.assertEquals(
            result, 6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.HEX_KEY.hex_key("112233445566778899AABBCCDDEEFF00");
        org.junit.Assert.assertEquals(
            result, 12
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.HEX_KEY.hex_key("");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
}
