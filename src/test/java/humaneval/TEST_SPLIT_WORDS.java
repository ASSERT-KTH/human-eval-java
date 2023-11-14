package humaneval;

public class TEST_SPLIT_WORDS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String[] result = humaneval.buggy.SPLIT_WORDS.split_words("Hello world!");
        String[] desired = {"Hello", "world!"};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String[] result = humaneval.buggy.SPLIT_WORDS.split_words("Hello,world!");
        String[] desired = {"Hello", "world!"};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String[] result = humaneval.buggy.SPLIT_WORDS.split_words("Hello world,!");
        String[] desired = {"Hello", "world,!"};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String[] result = humaneval.buggy.SPLIT_WORDS.split_words("Hello,Hello,world !");
        String[] desired = {"Hello,Hello,world", "!"};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String[] result = humaneval.buggy.SPLIT_WORDS.split_words("abcdef");
        String[] desired = {"3"};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String[] result = humaneval.buggy.SPLIT_WORDS.split_words("aaabb");
        String[] desired = {"2"};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String[] result = humaneval.buggy.SPLIT_WORDS.split_words("aaaBb");
        String[] desired = {"1"};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String[] result = humaneval.buggy.SPLIT_WORDS.split_words("");
        String[] desired = {"0"};
        org.junit.Assert.assertArrayEquals(desired, result);
    }
}
