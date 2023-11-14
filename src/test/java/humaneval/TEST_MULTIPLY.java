package humaneval;

public class TEST_MULTIPLY {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(148, 412);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(19, 28);
        org.junit.Assert.assertEquals(
            result, 72
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(2020, 1851);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(14, -15);
        org.junit.Assert.assertEquals(
            result, 20
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(76, 67);
        org.junit.Assert.assertEquals(
            result, 42
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(17, 27);
        org.junit.Assert.assertEquals(
            result, 49
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.MULTIPLY.multiply(0, 0);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
}
