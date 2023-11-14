package humaneval;

import java.util.*;

public class TEST_FILTER_INTEGERS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>()
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new ArrayList<Object>().toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                4, new HashSet<>(), new ArrayList<>(), 23.0, 9, "adasd"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4, 9).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FILTER_INTEGERS.filter_integers(
            new ArrayList<Object>(Arrays.asList(
                3, "c", 3, 3, "a", "b"
            ))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 3, 3).toArray()
        );
    }
}
