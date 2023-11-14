package humaneval;

public class TEST_DO_ALGEBRA {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"-", "*", "+"}, new int[] {2, 3, 4, 5}
        );
        org.junit.Assert.assertEquals(
            result, -5, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"+", "*", "-"}, new int[] {2, 3, 4, 5}
        );
        org.junit.Assert.assertEquals(
            result, 9, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double result = humaneval.buggy.DO_ALGEBRA.do_algebra(
            new String[] {"/", "*"}, new int[] {7, 3, 4}
        );
        org.junit.Assert.assertEquals(
            result, 7.0 / 3 * 4, 1e-6
        );
    }
}
