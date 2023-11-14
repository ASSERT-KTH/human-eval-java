package humaneval;

public class TEST_BELOW_THRESHOLD {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_THRESHOLD.below_threshold(new int[] {1, 2, 4, 10}, 100);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_THRESHOLD.below_threshold(new int[] {1, 20, 4, 10}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_THRESHOLD.below_threshold(new int[] {1, 2, 4, 10}, 21);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_THRESHOLD.below_threshold(new int[] {1, 2, 4, 10}, 22);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_THRESHOLD.below_threshold(new int[] {1, 8, 4, 10}, 11);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.BELOW_THRESHOLD.below_threshold(new int[] {1, 8, 4, 10}, 10);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}
