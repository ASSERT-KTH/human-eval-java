package humaneval;

public class TEST_TRUNCATE_NUMBER {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double result = humaneval.buggy.TRUNCATE_NUMBER.truncate_number(3.5);
        org.junit.Assert.assertTrue(Math.abs(result - 0.5) < 1.e-6);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.TRUNCATE_NUMBER.truncate_number(1.33);
        org.junit.Assert.assertTrue(Math.abs(result - 0.33) < 1.e-6);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double result = humaneval.buggy.TRUNCATE_NUMBER.truncate_number(123.456);
        org.junit.Assert.assertTrue(Math.abs(result - 0.456) < 1.e-6);
    }
}
