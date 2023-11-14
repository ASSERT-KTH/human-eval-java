package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_SOLUTION {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 8, 7, 1));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(12, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(9, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30, 13, 24, 321));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(5, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 4, 8));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(30, 13, 23, 32));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(23, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 13, 2, 9));
        int result = humaneval.buggy.SOLUTION.solution(input);
        org.junit.Assert.assertEquals(3, result);
    }
}
