package humaneval;

public class TEST_SMALLEST_CHANGE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SMALLEST_CHANGE.smallest_change(new int[] {1, 2, 3, 5, 4, 7, 9, 6});
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SMALLEST_CHANGE.smallest_change(new int[] {1, 2, 3, 4, 3, 2, 2});
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.SMALLEST_CHANGE.smallest_change(new int[] {1, 4, 2});
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SMALLEST_CHANGE.smallest_change(new int[] {1, 4, 4, 2});
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SMALLEST_CHANGE.smallest_change(new int[] {1, 2, 3, 2, 1});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.SMALLEST_CHANGE.smallest_change(new int[] {3, 1, 1, 3});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.SMALLEST_CHANGE.smallest_change(new int[] {1});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.SMALLEST_CHANGE.smallest_change(new int[] {0, 1});
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
}
