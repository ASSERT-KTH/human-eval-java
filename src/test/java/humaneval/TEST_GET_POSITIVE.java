package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_GET_POSITIVE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1, -2, 4, 5, 6))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4, 5, 6).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1, -2))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.GET_POSITIVE.get_positive(
            new ArrayList<Integer>()
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }
}
