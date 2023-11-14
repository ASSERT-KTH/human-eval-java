package humaneval;

public class TEST_RESCALE_TO_UNIT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0, 49.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0, 1.0}, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {100.0, 49.9});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {1.0, 0.0}, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {1.0, 2.0, 3.0, 4.0, 5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.0, 0.25, 0.5, 0.75, 1.0}, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {2.0, 1.0, 5.0, 3.0, 4.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.25, 0.0, 1.0, 0.5, 0.75}, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        double[] result = humaneval.buggy.RESCALE_TO_UNIT.rescale_to_unit(new double[] {12.0, 11.0, 15.0, 13.0, 14.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {0.25, 0.0, 1.0, 0.5, 0.75}, 1e-6
        );
    }
}
