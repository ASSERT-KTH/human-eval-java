package humaneval;

public class TEST_ADD_EVEN_AT_ODD {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.ADD_EVEN_AT_ODD.add_even_at_odd(new int[] {4, 88});
        org.junit.Assert.assertEquals(
            result, 88
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.ADD_EVEN_AT_ODD.add_even_at_odd(new int[] {4, 5, 6, 7, 2, 122});
        org.junit.Assert.assertEquals(
            result, 122
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.ADD_EVEN_AT_ODD.add_even_at_odd(new int[] {4, 0, 6, 7});
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.ADD_EVEN_AT_ODD.add_even_at_odd(new int[] {4, 4, 6, 8});
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
}
