package humaneval;

public class TEST_TRIANGLE_AREA_2 {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(3, 4, 5);
        org.junit.Assert.assertEquals(
            result, 6, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(1, 2, 10);
        org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(4, 8, 5);
        org.junit.Assert.assertEquals(
            result, 8.18, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(2, 2, 2);
        org.junit.Assert.assertEquals(
            result, 1.73, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(1, 2, 3);
        org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(10, 5, 7);
        org.junit.Assert.assertEquals(
            result, 16.25, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(2, 6, 3);
        org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(1, 1, 1);
        org.junit.Assert.assertEquals(
            result, 0.43, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        double result = humaneval.buggy.TRIANGLE_AREA_2.triangle_area_2(2, 2, 10);
        org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }
}
