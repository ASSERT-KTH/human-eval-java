package humaneval;

public class TEST_TRI {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(3);
        int[] desired = {1, 3, 2, 8};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(4);
        int[] desired = {1, 3, 2, 8, 3};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(5);
        int[] desired = {1, 3, 2, 8, 3, 15};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(6);
        int[] desired = {1, 3, 2, 8, 3, 15, 4};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(7);
        int[] desired = {1, 3, 2, 8, 3, 15, 4, 24};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(8);
        int[] desired = {1, 3, 2, 8, 3, 15, 4, 24, 5};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(9);
        int[] desired = {1, 3, 2, 8, 3, 15, 4, 24, 5, 35};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(20);
        int[] desired = {1, 3, 2, 8, 3, 15, 4, 24, 5, 35, 6, 48, 7, 63, 8, 80, 9, 99, 10, 120, 11};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(0);
        int[] desired = {1};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int[] result = humaneval.buggy.TRI.tri(1);
        int[] desired = {1, 3};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
}
