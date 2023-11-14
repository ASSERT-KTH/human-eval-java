package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_FILTER_BY_SUBSTRING {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(), "john"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>().toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx")), "xxx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("xxx", "xxxAAA", "xxx")).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx")), "xx"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx")).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<String> result = humaneval.buggy.FILTER_BY_SUBSTRING.filter_by_substring(
            new ArrayList<String>(Arrays.asList("grunt", "trumpet", "prune", "gruesome")), "run"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("grunt", "prune")).toArray()
        );
    }
}
