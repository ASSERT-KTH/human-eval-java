package humaneval;

public class TEST_IS_SIMPLE_POWER {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(16, 2);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(143214, 16);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(4, 2);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(9, 3);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(16, 4);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(24, 2);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(128, 4);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(12, 6);
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(1, 1);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(1, 12);
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.IS_SIMPLE_POWER.is_simple_power(7, 1);
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}
