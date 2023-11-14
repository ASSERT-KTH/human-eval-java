package humaneval;

public class TEST_MEDIAN {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double result = humaneval.buggy.MEDIAN.median(
            new int[] {3, 1, 2, 4, 5}
        );
        org.junit.Assert.assertEquals(
            result, 3, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.MEDIAN.median(
            new int[] {-10, 4, 6, 1000, 10, 20}
        );
        org.junit.Assert.assertEquals(
            result, 8, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double result = humaneval.buggy.MEDIAN.median(
            new int[] {5}
        );
        org.junit.Assert.assertEquals(
            result, 5, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        double result = humaneval.buggy.MEDIAN.median(
            new int[] {6, 5}
        );
        org.junit.Assert.assertEquals(
            result, 5.5, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        double result = humaneval.buggy.MEDIAN.median(
            new int[] {8, 1, 3, 9, 9, 2, 7}
        );
        org.junit.Assert.assertEquals(
            result, 7, 1e-6
        );
    }
}
