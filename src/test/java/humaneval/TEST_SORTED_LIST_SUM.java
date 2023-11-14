package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_SORTED_LIST_SUM {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("aa", "a", "aaa"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("aa"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("school", "AI", "asdf", "b"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("AI", "asdf", "school"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("d", "b", "c", "a"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("d", "dcba", "abcd", "a"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("abcd", "dcba"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("AI", "ai", "au"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("AI", "ai", "au"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("a", "b", "b", "c", "c", "a"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("aaaa", "bbbb", "dd", "cc"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("cc", "dd", "aaaa", "bbbb"))
        );
    }
}
