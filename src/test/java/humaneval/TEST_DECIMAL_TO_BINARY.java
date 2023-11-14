package humaneval;

public class TEST_DECIMAL_TO_BINARY {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(0);
        org.junit.Assert.assertEquals(
            result, "db0db"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(32);
        org.junit.Assert.assertEquals(
            result, "db100000db"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(103);
        org.junit.Assert.assertEquals(
            result, "db1100111db"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.DECIMAL_TO_BINARY.decimal_to_binary(15);
        org.junit.Assert.assertEquals(
            result, "db1111db"
        );
    }
}
