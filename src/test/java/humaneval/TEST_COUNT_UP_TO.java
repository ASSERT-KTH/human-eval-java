package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_COUNT_UP_TO {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(5);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(6);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(7);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(10);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(0);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(22);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(1);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(18);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(47);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.COUNT_UP_TO.count_up_to(101);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))
        );
    }
}
