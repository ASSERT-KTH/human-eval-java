package humaneval;

public class TEST_PLUCK {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.PLUCK.pluck(new int[] {4, 2, 3});
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.PLUCK.pluck(new int[] {1, 2, 3});
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.PLUCK.pluck(new int[] {});
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.PLUCK.pluck(new int[] {5, 0, 3, 0, 4, 2});
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] result = humaneval.buggy.PLUCK.pluck(new int[] {1, 2, 3, 0, 5, 3});
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0, 3}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] result = humaneval.buggy.PLUCK.pluck(new int[] {5, 4, 8, 4, 8});
        org.junit.Assert.assertArrayEquals(
            result, new int[] {4, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[] result = humaneval.buggy.PLUCK.pluck(new int[] {7, 6, 7, 1});
        org.junit.Assert.assertArrayEquals(
            result, new int[] {6, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int[] result = humaneval.buggy.PLUCK.pluck(new int[] {7, 9, 7, 1});
        org.junit.Assert.assertArrayEquals(
            result, new int[] {}
        );
    }
}
