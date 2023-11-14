package humaneval;

public class TEST_RIGHT_ANGLE_TRIANGLE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(3, 4, 5);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(1, 2, 3);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(10, 6, 8);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(2, 2, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(7, 24, 25);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(5, 12, 13);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(15, 8, 17);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(48, 55, 73);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(10, 5, 7);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(1, 1, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(2, 2, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}
