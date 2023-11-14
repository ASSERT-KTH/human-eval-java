package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_HAS_CLOSE_ELEMENTS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.3
        );
        org.junit.Assert.assertEquals(result, true);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.05
        );
        org.junit.Assert.assertEquals(result, false);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.95
        );
        org.junit.Assert.assertEquals(result, true);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.8
        );
        org.junit.Assert.assertEquals(result, false);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)), 0.1
        );
        org.junit.Assert.assertEquals(result, true);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 1.0
        );
        org.junit.Assert.assertEquals(result, true);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 0.5
        );
        org.junit.Assert.assertEquals(result, false);
    }
}
