package humaneval;

public class TEST_STRING_SEQUENCE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_SEQUENCE.string_sequence(0);
        org.junit.Assert.assertEquals(
            result, "0" 
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_SEQUENCE.string_sequence(3);
        org.junit.Assert.assertEquals(
            result, "0 1 2 3" 
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_SEQUENCE.string_sequence(10);
        org.junit.Assert.assertEquals(
            result, "0 1 2 3 4 5 6 7 8 9 10" 
        );
    }
}
