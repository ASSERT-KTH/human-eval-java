package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_SORT_THIRD {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1, 2, 3).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 6, 3, 4, 8, 9, 2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 6, 3, 4, 8, 9, 5).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 8, 3, 4, 6, 9, 2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 8, 3, 4, 6, 9, 5).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 6, 9, 4, 8, 3, 2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 6, 9, 4, 8, 3, 5).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1).toArray()
        );
    }
}
