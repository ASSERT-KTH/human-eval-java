package humaneval;

import java.util.HashMap;

public class TEST_CHECK_DICT_CASE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("p", "pineapple");
                put("b", "banana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("p", "pineapple");
                put("A", "banana");
                put("B", "banana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("p", "pineapple");
                put(new Integer(5), "banana");
                put("a", "apple");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Name", "John");
                put("Age", "36");
                put("City", "Houston");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("STATE", "NC");
                put("ZIP", "12345");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("fruit", "Orange");
                put("taste", "Sweet");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>()
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}
