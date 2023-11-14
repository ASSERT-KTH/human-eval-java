package humaneval;

public class TEST_CIRCULAR_SHIFT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(100, 2);
        org.junit.Assert.assertEquals(
            result, "001"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 2);
        org.junit.Assert.assertEquals(
            result, "12"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(97, 8);
        org.junit.Assert.assertEquals(
            result, "79"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(12, 1);
        org.junit.Assert.assertEquals(
            result, "21"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.CIRCULAR_SHIFT.circular_shift(11, 101);
        org.junit.Assert.assertEquals(
            result, "11"
        );
    }
}
