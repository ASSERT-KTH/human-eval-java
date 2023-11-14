package humaneval;

public class TEST_SPECIAL_FILTER {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {5, -2, 1, -5}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {15, -73, 14, -15}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {33, -2, -3, 45, 21, 109}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {43, -12, 93, 125, 121, 109}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {71, -2, -33, 75, 21, 19}
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {1}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.SPECIAL_FILTER.special_filter(
            new int[] {}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }
}
