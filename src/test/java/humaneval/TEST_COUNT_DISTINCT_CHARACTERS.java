package humaneval;

public class TEST_COUNT_DISTINCT_CHARACTERS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_DISTINCT_CHARACTERS.count_distinct_characters("");
        org.junit.Assert.assertEquals(
            result, 0 
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_DISTINCT_CHARACTERS.count_distinct_characters("abcde");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_DISTINCT_CHARACTERS.count_distinct_characters("abcde" + "cade" + "CADE");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_DISTINCT_CHARACTERS.count_distinct_characters("aaaaAAAAaaaa");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Jerry jERRY JeRRRY");
        org.junit.Assert.assertEquals(
            result, 5
        );
    }
}
