package humaneval;

public class TEST_FLIP_CASE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.FLIP_CASE.flip_case("");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.FLIP_CASE.flip_case("Hello!");
        org.junit.Assert.assertEquals(
            result, "hELLO!"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.FLIP_CASE.flip_case("These violent delights have violent ends");
        org.junit.Assert.assertEquals(
            result, "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
        );
    }
}
