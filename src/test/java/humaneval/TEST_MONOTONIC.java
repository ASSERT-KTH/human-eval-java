package humaneval;

public class TEST_MONOTONIC {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.MONOTONIC.monotonic(
            new int[] {1, 2, 4, 10}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.MONOTONIC.monotonic(
            new int[] {1, 2, 4, 20}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.MONOTONIC.monotonic(
            new int[] {1, 20, 4, 10}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.MONOTONIC.monotonic(
            new int[] {4, 1, 0, -10}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.MONOTONIC.monotonic(
            new int[] {4, 1, 1, 0}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.MONOTONIC.monotonic(
            new int[] {1, 2, 3, 2, 5, 60}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.MONOTONIC.monotonic(
            new int[] {1, 2, 3, 4, 5, 60}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.MONOTONIC.monotonic(
            new int[] {9, 9, 9, 9}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
}
