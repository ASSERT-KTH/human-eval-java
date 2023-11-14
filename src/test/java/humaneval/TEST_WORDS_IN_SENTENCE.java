package humaneval;

public class TEST_WORDS_IN_SENTENCE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("This is a test");
        org.junit.Assert.assertEquals(
            result, "is"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("lets go for swimming");
        org.junit.Assert.assertEquals(
            result, "go for"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("there is no place available here");
        org.junit.Assert.assertEquals(
            result, "there is no place"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("Hi I am Hussein");
        org.junit.Assert.assertEquals(
            result, "Hi am Hussein"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("go for it");
        org.junit.Assert.assertEquals(
            result, "go for it"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("here is");
        org.junit.Assert.assertEquals(
            result, "is"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("here");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }
}
