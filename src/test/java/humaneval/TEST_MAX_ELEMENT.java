package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_MAX_ELEMENT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3))
        );
        org.junit.Assert.assertEquals(
            result, 3
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10))
        );
        org.junit.Assert.assertEquals(
            result, 124
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.MAX_ELEMENT.max_element(
            new ArrayList<Integer>(Arrays.asList(-1, -2, -3))
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
}
