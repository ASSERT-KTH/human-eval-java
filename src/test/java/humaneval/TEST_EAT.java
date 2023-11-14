package humaneval;

public class TEST_EAT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int[] result = humaneval.buggy.EAT.eat(5, 6, 10);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {11, 4}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int[] result = humaneval.buggy.EAT.eat(4, 8, 9);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {12, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int[] result = humaneval.buggy.EAT.eat(1, 10, 10);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {11, 0}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int[] result = humaneval.buggy.EAT.eat(2, 11, 5);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {7, 0}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int[] result = humaneval.buggy.EAT.eat(4, 5, 7);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {9, 2}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int[] result = humaneval.buggy.EAT.eat(4, 5, 1);
        org.junit.Assert.assertArrayEquals(
            result, new int[] {5, 0}
        );
    }
}
