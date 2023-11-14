package humaneval;

public class TEST_TRIANGLE_AREA {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(5, 3);
        org.junit.Assert.assertEquals(
            result, 7.5, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(2, 2);
        org.junit.Assert.assertEquals(
            result, 2.0, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA.triangle_area(10, 8);
        org.junit.Assert.assertEquals(
            result, 40.0, 1e-6
        );
    }
}
