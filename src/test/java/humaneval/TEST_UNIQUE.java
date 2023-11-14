package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_UNIQUE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0, 2, 3, 5, 9, 123).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(5, 2, 2, 8, 12, 43, 43, 12, 7, 1))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1, 2, 5, 7, 8, 12, 43).toArray()
        );
    }
}
