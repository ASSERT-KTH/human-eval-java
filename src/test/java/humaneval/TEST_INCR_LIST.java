package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_INCR_LIST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INCR_LIST.incr_list(
            new ArrayList<Integer>()
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INCR_LIST.incr_list(
            Arrays.asList(3, 2, 1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(4, 3, 2)
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.INCR_LIST.incr_list(
            Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124)
        );
    }
}
