package humaneval;

import java.util.Arrays;
import java.util.List;

public class TEST_DERIVATIVE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3, 1, 2, 4, 5)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(1, 4, 12, 20)
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1, 2, 3)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2, 6)
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3, 2, 1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2, 2)
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(3, 2, 1, 0, 4)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList(2, 2, 0, 16)
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.DERIVATIVE.derivative(
            Arrays.asList(1)
        );
        org.junit.Assert.assertEquals(
            result, Arrays.asList()
        );
    }
}
