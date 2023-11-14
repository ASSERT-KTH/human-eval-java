package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_SELECT_WORDS {
    @org.junit.Test(timeout=3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Mary had a little lamb", 4);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("little"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Mary had a little lamb", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Mary", "lamb"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("simple white space", 2);
        ArrayList<String> desired = new ArrayList<>();
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Hello world", 4);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("world"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("Uncle sam", 3);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("Uncle"));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("", 4);
        ArrayList<String> desired = new ArrayList<>();
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<String> result = humaneval.buggy.SELECT_WORDS.select_words("a b c d e f", 1);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList("b", "c", "d", "f"));
        org.junit.Assert.assertEquals(desired, result);
    }
}
