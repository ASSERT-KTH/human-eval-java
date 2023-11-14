package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_ADD_ELEMENTS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -2, -3, 41, 57, 76, 87, 88, 99));
        int result = humaneval.buggy.ADD_ELEMENTS.add_elements(input, 3);
        org.junit.Assert.assertEquals(-4, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(111, 121, 3, 4000, 5, 6));
        int result = humaneval.buggy.ADD_ELEMENTS.add_elements(input, 2);
        org.junit.Assert.assertEquals(0, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11, 21, 3, 90, 5, 6, 7, 8, 9));
        int result = humaneval.buggy.ADD_ELEMENTS.add_elements(input, 4);
        org.junit.Assert.assertEquals(125, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9));
        int result = humaneval.buggy.ADD_ELEMENTS.add_elements(input, 4);
        org.junit.Assert.assertEquals(24, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        int result = humaneval.buggy.ADD_ELEMENTS.add_elements(input, 1);
        org.junit.Assert.assertEquals(1, result);
    }
}
