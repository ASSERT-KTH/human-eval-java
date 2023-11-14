package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_REVERSE_DELETE {
    @org.junit.Test(timeout=3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("abcde", "ae");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("bcd", false));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("abcdef", "b");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("acdef", false));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("abcdedcba", "ab");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("cdedc", true));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("dwik", "w");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("dik", false));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("a", "a");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("", true));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("abcdedcba", "");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("abcdedcba", true));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("abcdedcba", "v");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("abcdedcba", true));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("vabba", "v");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("abba", true));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Object> result = humaneval.buggy.REVERSE_DELETE.reverse_delete("mamma", "mia");
        ArrayList<Object> desired = new ArrayList<Object>(Arrays.asList("", true));
        org.junit.Assert.assertEquals(desired, result);
    }
}
