package humaneval;

public class TEST_COMPARE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1,2,3,4,5,1}, new int[] {1,2,3,4,2,-2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,3,3}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {0, 0, 0, 0, 0, 0}, new int[] {0,0,0,0,0,0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {0,0,0,0,0,0}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1, 2, 3}, new int[] {-1, -2, -3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 4, 6}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.COMPARE.compare(
           new int[] {1, 2, 3, 5}, new int[] {-1, 2, 3, 4}
        );
        org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 0, 0, 1}
        );
    }
}
