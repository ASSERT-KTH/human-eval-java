package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_COUNT_NUMS {
    @org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>();
        int result = humaneval.buggy.COUNT_NUMS.count_nums(input);
        org.junit.Assert.assertEquals(result, 0);
    }
    @org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -2, 0));
        int result = humaneval.buggy.COUNT_NUMS.count_nums(input);
        org.junit.Assert.assertEquals(result, 0);
    }
    @org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2, -2, 3, 4, 5));
        int result = humaneval.buggy.COUNT_NUMS.count_nums(input);
        org.junit.Assert.assertEquals(result, 6);
    }
    @org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 6, 9, -6, 0, 1, 5));
        int result = humaneval.buggy.COUNT_NUMS.count_nums(input);
        org.junit.Assert.assertEquals(result, 5);
    }
    @org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 100, 98, -7, 1, -1));
        int result = humaneval.buggy.COUNT_NUMS.count_nums(input);
        org.junit.Assert.assertEquals(result, 4);
    }
    @org.junit.Test(timeout = 3000)
	public void test_5() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12, 23, 34, -45, -56, 0));
        int result = humaneval.buggy.COUNT_NUMS.count_nums(input);
        org.junit.Assert.assertEquals(result, 5);
    }
    @org.junit.Test(timeout = 3000)
	public void test_6() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-0, 1^0));
        int result = humaneval.buggy.COUNT_NUMS.count_nums(input);
        org.junit.Assert.assertEquals(result, 1);
    }
    @org.junit.Test(timeout = 3000)
	public void test_7() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        int result = humaneval.buggy.COUNT_NUMS.count_nums(input);
        org.junit.Assert.assertEquals(result, 1);
    }
}
