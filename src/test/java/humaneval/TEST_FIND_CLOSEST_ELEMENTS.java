package humaneval;

public class TEST_FIND_CLOSEST_ELEMENTS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0, 2.0, 3.9, 4.0, 5.0, 2.2});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {3.9, 4.0}, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0, 2.0, 5.9, 4.0, 5.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {5.0, 5.9}, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0, 2.0, 3.0, 4.0, 5.0, 2.2});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0, 2.2}, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0, 2.0, 3.0, 4.0, 5.0, 2.0});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0, 2.0}, 1e-6
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        double[] result = humaneval.buggy.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1, 2.2, 3.1, 4.1, 5.1});
        org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2, 3.1}, 1e-6
        );
    }
}
