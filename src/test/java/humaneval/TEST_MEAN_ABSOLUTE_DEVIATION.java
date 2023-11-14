package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_MEAN_ABSOLUTE_DEVIATION {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 2.0/3.0) < 1.e-6);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 1.0) < 1.e-6);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double result = humaneval.buggy.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0))
        );
        org.junit.Assert.assertTrue(Math.abs(result - 6.0/5.0) < 1.e-6);
    }
}
