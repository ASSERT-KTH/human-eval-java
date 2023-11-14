package humaneval;

public class TEST_WILL_IT_FLY {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3, 2, 3}, 9);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1, 2}, 5);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3}, 5);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {3, 2, 3}, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {1, 2, 3}, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.WILL_IT_FLY.will_it_fly(new int[] {5}, 5);
        org.junit.Assert.assertEquals(
            result, true
        );
    }
}
