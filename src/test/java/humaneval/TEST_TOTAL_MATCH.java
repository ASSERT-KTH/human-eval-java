package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_TOTAL_MATCH {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(), new ArrayList<String>()
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hi", "hi"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hi", "hi"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hi", "hi", "admin", "project"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hi", "admin"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("4")), 
            new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("4"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hI", "Hi"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hI", "Hi"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hI", "hi", "hi"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hI", "hi", "hi"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hI", "hi", "hii"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hi", "admin"))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(), 
            new ArrayList<String>(Arrays.asList("this"))
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        List<String> result = humaneval.buggy.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("this")),
            new ArrayList<String>()
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }
}
