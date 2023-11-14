package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_ROLLING_MAX {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>()
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>().toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(4, 3, 2, 1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4, 4, 4, 4)).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.ROLLING_MAX.rolling_max(
            new ArrayList<Integer>(Arrays.asList(3, 2, 3, 100, 3))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(3, 3, 3, 100, 100)).toArray()
        );
    }
}
