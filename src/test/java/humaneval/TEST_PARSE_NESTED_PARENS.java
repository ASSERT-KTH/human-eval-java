package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_PARSE_NESTED_PARENS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()()) ((())) () ((())()())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(2, 3, 1, 3)).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "() (()) ((())) (((())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_NESTED_PARENS.parse_nested_parens(
            "(()(())((())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<Integer>(Arrays.asList(4)).toArray()
        );
    }
}
