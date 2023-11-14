package humaneval;

public class TEST_DOUBLE_THE_DIFFERENCE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.DOUBLE_THE_DIFFERENCE.double_the_difference(
            new double[] {}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.DOUBLE_THE_DIFFERENCE.double_the_difference(
            new double[] {5, 4}
        );
        org.junit.Assert.assertEquals(
            result, 25
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.DOUBLE_THE_DIFFERENCE.double_the_difference(
            new double[] {0.1, 0.2, 0.3}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.DOUBLE_THE_DIFFERENCE.double_the_difference(
            new double[] {-10, -21, -30}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.DOUBLE_THE_DIFFERENCE.double_the_difference(
            new double[] {-1, -2, 8}
        );
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.DOUBLE_THE_DIFFERENCE.double_the_difference(
            new double[] {0.2, 3, 5}
        );
        org.junit.Assert.assertEquals(
            result, 34
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        double[] inputs = new double[199];
        int sum = 0;
        for (int i = -99; i < 100; i += 1) {
            if (i % 2 == 1 && i > 0){
                inputs[i + 99] = i;
                sum += i * i;
            }
            else inputs[i + 99] = i;
        }
        int result = humaneval.buggy.DOUBLE_THE_DIFFERENCE.double_the_difference(
            inputs
        );
        org.junit.Assert.assertEquals(
            result, sum
        );
    }
}
