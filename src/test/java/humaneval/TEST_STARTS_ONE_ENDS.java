package humaneval;

public class TEST_STARTS_ONE_ENDS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.STARTS_ONE_ENDS.starts_one_ends(1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.STARTS_ONE_ENDS.starts_one_ends(2);
        org.junit.Assert.assertEquals(
            result, 18
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.STARTS_ONE_ENDS.starts_one_ends(3);
        org.junit.Assert.assertEquals(
            result, 180
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.STARTS_ONE_ENDS.starts_one_ends(4);
        org.junit.Assert.assertEquals(
            result, 1800
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.STARTS_ONE_ENDS.starts_one_ends(5);
        org.junit.Assert.assertEquals(
            result, 18000
        );
    }
}
