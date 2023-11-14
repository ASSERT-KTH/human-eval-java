package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_FILTER_BY_PREFIX {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_PREFIX.filter_by_prefix(
            new ArrayList<String>(), "john"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_PREFIX.filter_by_prefix(
            new ArrayList<String>(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx")), "xxx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList("xxx", "xxxAAA", "xxx").toArray()
        );
    }
}
