package humaneval;

import java.util.Arrays;
import java.util.List;

public class TEST_FACTORIZE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(2);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(4);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 2).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(8);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 2, 2).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(3 * 19);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 19).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(3 * 19 * 3 * 19);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 3, 19, 19).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(3 * 19 * 3 * 19 * 3 * 19);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 3, 3, 19, 19, 19).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(3 * 19 * 19 * 19);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 19, 19, 19).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.FACTORIZE.factorize(3 * 2 * 3);
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 3, 3).toArray()
        );
    }
}
