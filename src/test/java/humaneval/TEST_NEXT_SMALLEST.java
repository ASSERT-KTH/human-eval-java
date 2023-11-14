package humaneval;

public class TEST_NEXT_SMALLEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1, 2, 3, 4, 5});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {5, 1, 4, 3, 2});
        org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {});
        org.junit.Assert.assertEquals(
            result, null
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1, 1});
        org.junit.Assert.assertEquals(
            result, null
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {1, 1, 1, 1, 0});
        org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        Integer result = humaneval.buggy.NEXT_SMALLEST.next_smallest(new int[] {-35, 34, 12, -45});
        org.junit.Assert.assertEquals(
            result, new Integer(-35)
        );
    }
}
