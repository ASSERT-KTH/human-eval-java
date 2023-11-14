package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_SUM_PRODUCT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.SUM_PRODUCT.sum_product(
            new ArrayList<Integer>()
        );
        org.junit.Assert.assertArrayEquals(
            result, 
            new Integer[]{0, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.SUM_PRODUCT.sum_product(
            new ArrayList<Integer>(Arrays.asList(1, 1, 1))
        );
        org.junit.Assert.assertArrayEquals(
            result, 
            new Integer[]{3, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.SUM_PRODUCT.sum_product(
            new ArrayList<Integer>(Arrays.asList(100, 0))
        );
        org.junit.Assert.assertArrayEquals(
            result, 
            new Integer[]{100, 0}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.SUM_PRODUCT.sum_product(
            new ArrayList<Integer>(Arrays.asList(3, 5, 7))
        );
        org.junit.Assert.assertArrayEquals(
            result, 
            new Integer[]{3 + 5 + 7, 3 * 5 * 7}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        Integer[] result = humaneval.buggy.SUM_PRODUCT.sum_product(
            new ArrayList<Integer>(Arrays.asList(10))
        );
        org.junit.Assert.assertArrayEquals(
            result, 
            new Integer[]{10, 10}
        );
    }
}
