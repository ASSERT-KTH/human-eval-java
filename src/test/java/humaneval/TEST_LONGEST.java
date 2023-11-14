package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_LONGEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.LONGEST.longest(
            new ArrayList<String>()
        );
        org.junit.Assert.assertEquals(
            result, null
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.LONGEST.longest(
            new ArrayList<String>(Arrays.asList("x", "y", "z"))
        );
        org.junit.Assert.assertEquals(
            result, "x"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.LONGEST.longest(
            new ArrayList<String>(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc"))
        );
        org.junit.Assert.assertEquals(
            result, "zzzz"
        );
    }
}
