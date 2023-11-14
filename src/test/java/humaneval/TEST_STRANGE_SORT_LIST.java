package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_STRANGE_SORT_LIST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(1, 4, 2, 3))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(5, 9, 6, 8, 7))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(1, 5, 2, 4, 3))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9, 1))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(1, 9, 5, 8, 6, 7))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>()
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(0,2,2,2,5,5,-5,-5))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(111111))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(111111))
        );
    }
}
