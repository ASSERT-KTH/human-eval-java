package humaneval;

public class TEST_EVEN_ODD_COUNT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(7);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-78);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(3452);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 2}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(346211);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3, 3}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-345821);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {3, 3}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-2);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 0}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(-45347);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 3}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int[] result = humaneval.buggy.EVEN_ODD_COUNT.even_odd_count(0);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 0}
        );
    }
}
