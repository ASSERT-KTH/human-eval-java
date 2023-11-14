package humaneval;

public class TEST_ADD {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.ADD.add(0, 1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.ADD.add(1, 0);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.ADD.add(2, 3);
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.ADD.add(5, 7);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.ADD.add(7, 5);
        org.junit.Assert.assertEquals(
            result, 12
        );
    }
}
