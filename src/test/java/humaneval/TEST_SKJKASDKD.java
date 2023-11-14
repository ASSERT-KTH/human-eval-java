package humaneval;

public class TEST_SKJKASDKD {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3});
        org.junit.Assert.assertEquals(
            result, 10
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {1,0,1,8,2,4597,2,1,3,40,1,2,1,2,4,2,5,1});
        org.junit.Assert.assertEquals(
            result, 25
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {1,3,1,32,5107,34,83278,109,163,23,2323,32,30,1,9,3});
        org.junit.Assert.assertEquals(
            result, 13
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {0,724,32,71,99,32,6,0,5,91,83,0,5,6});
        org.junit.Assert.assertEquals(
            result, 11
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {0,81,12,3,1,21});
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {0, 8, 1, 2, 1, 7});
        org.junit.Assert.assertEquals(
            result, 7
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {8191});
        org.junit.Assert.assertEquals(
            result, 19
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {8191, 123456, 127, 7});
        org.junit.Assert.assertEquals(
            result, 19
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.SKJKASDKD.skjkasdkd(new int[] {127, 97, 8192});
        org.junit.Assert.assertEquals(
            result, 10
        );
    }
}
