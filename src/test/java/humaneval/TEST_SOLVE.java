package humaneval;

public class TEST_SOLVE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE.solve(1000);
        org.junit.Assert.assertEquals(
            result, "1"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE.solve(150);
        org.junit.Assert.assertEquals(
            result, "110"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE.solve(147);
        org.junit.Assert.assertEquals(
            result, "1100"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE.solve(333);
        org.junit.Assert.assertEquals(
            result, "1001"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE.solve(963);
        org.junit.Assert.assertEquals(
            result, "10010"
        );
    }
}
