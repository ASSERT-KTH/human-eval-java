package humaneval;

public class TEST_ORDER_BY_POINTS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1, 11, -1, -11, -12}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1, -11, 1, -12, 11}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1234,423,463,145,2,423,423,53,6,37,3457,3,56,0,46}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1, -11, -32, 43, 54, -98, 2, -3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-3, -32, -98, -11, 1, 2, 43, 54}
        );
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9}
        );
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,6,6,-76,-21,23,4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-76, -21, 0, 4, 23, 6, 6}
        );
    }
}
