package humaneval;

public class TEST_CAN_ARRANGE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] arr = {1, 2, 4, 3, 5};
        org.junit.Assert.assertEquals(3, humaneval.buggy.CAN_ARRANGE.can_arrange(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] arr = {1, 2, 4, 5};
        org.junit.Assert.assertEquals(-1, humaneval.buggy.CAN_ARRANGE.can_arrange(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] arr = {1,4,2,5,6,7,8,9,10};
        org.junit.Assert.assertEquals(2, humaneval.buggy.CAN_ARRANGE.can_arrange(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] arr = {4,8,5,7,3};
        org.junit.Assert.assertEquals(4, humaneval.buggy.CAN_ARRANGE.can_arrange(arr));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] arr = {};
        org.junit.Assert.assertEquals(-1, humaneval.buggy.CAN_ARRANGE.can_arrange(arr));
    }
}
