package humaneval;

public class TEST_CHANGE_BASE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 3);
        org.junit.Assert.assertEquals(
            result, "22"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(9, 3);
        org.junit.Assert.assertEquals(
            result, "100"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(234, 2);
        org.junit.Assert.assertEquals(
            result, "11101010"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(16, 2);
        org.junit.Assert.assertEquals(
            result, "10000"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(8, 2);
        org.junit.Assert.assertEquals(
            result, "1000"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.CHANGE_BASE.change_base(7, 2);
        org.junit.Assert.assertEquals(
            result, "111"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        for (int x = 2; x < 8; x += 1){
            String result = humaneval.buggy.CHANGE_BASE.change_base(x, x + 1);
            org.junit.Assert.assertEquals(
                result, x + ""
            );
        }
    }
}
