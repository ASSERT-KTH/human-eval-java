package humaneval;

public class TEST_CLOSEST_INTEGER {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("10");
        org.junit.Assert.assertEquals(
            result, 10
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("14.5");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("-15.5");
        org.junit.Assert.assertEquals(
            result, -16
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("15.3");
        org.junit.Assert.assertEquals(
            result, 15
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.CLOSEST_INTEGER.closest_integer("0");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
}
