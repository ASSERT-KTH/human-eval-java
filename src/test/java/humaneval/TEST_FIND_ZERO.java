package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_FIND_ZERO {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1., 2., 3., 4.));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(1., -2., 3., -4.));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-5., 6.));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 5., 8., 6., 7., 7.));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(-1., 4., -2., 3., -3., 2., -4., 1.));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(2., 2., 2., 2., 3., 3.));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 0., 0., 1.));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 3.));
        double result = humaneval.buggy.FIND_ZERO.find_zero(xs);
        org.junit.Assert.assertTrue(
            Math.abs(humaneval.buggy.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }
}
