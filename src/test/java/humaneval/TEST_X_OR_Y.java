package humaneval;

public class TEST_X_OR_Y {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7, 34, 12);
        org.junit.Assert.assertEquals(
            result, 34
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(15, 8, 5);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3, 33, 5212);
        org.junit.Assert.assertEquals(
            result, 33
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1259, 3, 52);
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(7919, -1, 12);
        org.junit.Assert.assertEquals(
            result, -1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(3609, 1245, 583);
        org.junit.Assert.assertEquals(
            result, 583
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(91, 56, 129);
        org.junit.Assert.assertEquals(
            result, 129
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(6, 34, 1234);
        org.junit.Assert.assertEquals(
            result, 1234
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(1, 2, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.X_OR_Y.x_or_y(2, 2, 0);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }
}
