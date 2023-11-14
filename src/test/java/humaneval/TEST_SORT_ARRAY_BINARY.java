package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_SORT_ARRAY_BINARY {
    @org.junit.Test(timeout=3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 4));
        ArrayList<Integer> result = humaneval.buggy.SORT_ARRAY_BINARY.sort_array_binary(input);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 5));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2, -3, -4, -5, -6));
        ArrayList<Integer> result = humaneval.buggy.SORT_ARRAY_BINARY.sort_array_binary(input);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-4, -2, -6, -5, -3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 4));
        ArrayList<Integer> result = humaneval.buggy.SORT_ARRAY_BINARY.sort_array_binary(input);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0, 1, 2, 4, 3));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> result = humaneval.buggy.SORT_ARRAY_BINARY.sort_array_binary(input);
        ArrayList<Integer> desired = new ArrayList<>();
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4));
        ArrayList<Integer> result = humaneval.buggy.SORT_ARRAY_BINARY.sort_array_binary(input);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 6, 44, 12, 32, 5));
        ArrayList<Integer> result = humaneval.buggy.SORT_ARRAY_BINARY.sort_array_binary(input);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(32, 3, 5, 6, 12, 44));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32));
        ArrayList<Integer> result = humaneval.buggy.SORT_ARRAY_BINARY.sort_array_binary(input);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32));
        org.junit.Assert.assertEquals(desired, result);
    }
}
