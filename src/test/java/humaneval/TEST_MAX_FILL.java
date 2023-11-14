package humaneval;

public class TEST_MAX_FILL {
    @org.junit.Test(timeout=3000)
    public void test_0() throws java.lang.Exception {
        int[][] input = {{0,0,1,0}, {0,1,0,0}, {1,1,1,1}};
        int result = humaneval.buggy.MAX_FILL.max_fill(input, 1);
        org.junit.Assert.assertEquals(6, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_1() throws java.lang.Exception {
        int[][] input = {{0,0,1,1}, {0,0,0,0}, {1,1,1,1}, {0,1,1,1}};
        int result = humaneval.buggy.MAX_FILL.max_fill(input, 2);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_2() throws java.lang.Exception {
        int[][] input = {{0,0,0}, {0,0,0}};
        int result = humaneval.buggy.MAX_FILL.max_fill(input, 5);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_3() throws java.lang.Exception {
        int[][] input = {{1,1,1,1}, {1,1,1,1}};
        int result = humaneval.buggy.MAX_FILL.max_fill(input, 2);
        org.junit.Assert.assertEquals(4, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_4() throws java.lang.Exception {
        int[][] input = {{1,1,1,1}, {1,1,1,1}};
        int result = humaneval.buggy.MAX_FILL.max_fill(input, 9);
        org.junit.Assert.assertEquals(2, result);
    }
}
