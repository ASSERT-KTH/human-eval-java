package humaneval;

public class TEST_SUM_TO_N {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(6);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(11);
        org.junit.Assert.assertEquals(
            result, 66
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(30);
        org.junit.Assert.assertEquals(
            result, 465
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SUM_TO_N.sum_to_n(100);
        org.junit.Assert.assertEquals(
            result, 5050
        );
    }
}
