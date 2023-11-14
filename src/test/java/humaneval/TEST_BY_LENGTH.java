package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_BY_LENGTH {
    @org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3));
        ArrayList<String> result = humaneval.buggy.BY_LENGTH.by_length(input);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<String> result = humaneval.buggy.BY_LENGTH.by_length(input);
        ArrayList<String> desired = new ArrayList<>();
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -1, 55));
        ArrayList<String> result = humaneval.buggy.BY_LENGTH.by_length(input);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("One"));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -1, 3, 2));
        ArrayList<String> result = humaneval.buggy.BY_LENGTH.by_length(input);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Three", "Two", "One"));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9, 4, 8));
        ArrayList<String> result = humaneval.buggy.BY_LENGTH.by_length(input);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Nine", "Eight", "Four"));
        org.junit.Assert.assertEquals(result, desired);
    }
}
