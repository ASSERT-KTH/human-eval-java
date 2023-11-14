package humaneval;

public class TEST_INTERSECTION {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] interval1 = {1, 2}; int[] interval2 = {2, 3};
        org.junit.Assert.assertEquals("NO", humaneval.buggy.INTERSECTION.intersection(interval1, interval2));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] interval1 = {-1, 1}; int[] interval2 = {0, 4};
        org.junit.Assert.assertEquals("NO", humaneval.buggy.INTERSECTION.intersection(interval1, interval2));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] interval1 = {-3, -1}; int[] interval2 = {-5, 5};
        org.junit.Assert.assertEquals("YES", humaneval.buggy.INTERSECTION.intersection(interval1, interval2));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] interval1 = {-2, 2}; int[] interval2 = {-4, 0};
        org.junit.Assert.assertEquals("YES", humaneval.buggy.INTERSECTION.intersection(interval1, interval2));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] interval1 = {-11, 2}; int[] interval2 = {-1, -1};
        org.junit.Assert.assertEquals("NO", humaneval.buggy.INTERSECTION.intersection(interval1, interval2));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] interval1 = {1, 2}; int[] interval2 = {3, 5};
        org.junit.Assert.assertEquals("NO", humaneval.buggy.INTERSECTION.intersection(interval1, interval2));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[] interval1 = {1, 2}; int[] interval2 = {1, 2};
        org.junit.Assert.assertEquals("NO", humaneval.buggy.INTERSECTION.intersection(interval1, interval2));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int[] interval1 = {-2, -2}; int[] interval2 = {-3, -2};
        org.junit.Assert.assertEquals("NO", humaneval.buggy.INTERSECTION.intersection(interval1, interval2));
    }
}
