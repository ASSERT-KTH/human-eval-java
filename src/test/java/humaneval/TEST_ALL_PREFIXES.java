package humaneval;

import java.util.List;

public class TEST_ALL_PREFIXES {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<String> result = humaneval.buggy.ALL_PREFIXES.all_prefixes("");
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new String[] {} 
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<String> result = humaneval.buggy.ALL_PREFIXES.all_prefixes("asdfgh");
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new String[] {"a", "as", "asd", "asdf", "asdfg", "asdfgh"} 
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<String> result = humaneval.buggy.ALL_PREFIXES.all_prefixes("WWW");
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new String[] {"W", "WW", "WWW"} 
        );
    }
}
