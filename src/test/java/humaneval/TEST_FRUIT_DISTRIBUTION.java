package humaneval;

public class TEST_FRUIT_DISTRIBUTION {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 6 oranges", 19);
        org.junit.Assert.assertEquals(
            result, 8
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 6 oranges", 21);
        org.junit.Assert.assertEquals(
            result, 10
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 3);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 0 oranges", 3);
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 3 oranges", 100);
        org.junit.Assert.assertEquals(
            result, 95
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 3 oranges", 5);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.FRUIT_DISTRIBUTION.fruit_distribution("1 apples and 100 oranges", 120);
        org.junit.Assert.assertEquals(
            result, 19
        );
    }
}
