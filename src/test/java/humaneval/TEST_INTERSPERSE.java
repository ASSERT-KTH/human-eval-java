package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_INTERSPERSE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(), 7
        );
        org.junit.Assert.assertArrayEquals(result.toArray(), new ArrayList<Integer>().toArray());
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(5, 6, 3, 2)), 8
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(5, 8, 6, 8, 3, 8, 2)).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INTERSPERSE.intersperse(
            new ArrayList<Integer>(Arrays.asList(2, 2, 2)), 2
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 2)).toArray()
        );
    }
}
