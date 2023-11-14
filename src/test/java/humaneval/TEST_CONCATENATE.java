package humaneval;

public class TEST_CONCATENATE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.CONCATENATE.concatenate(new String[] {});
        org.junit.Assert.assertEquals(
            result, ""
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.CONCATENATE.concatenate(new String[] {"x", "y", "z"});
        org.junit.Assert.assertEquals(
            result, "xyz"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.CONCATENATE.concatenate(new String[] {"x", "y", "z", "w", "k"});
        org.junit.Assert.assertEquals(
            result, "xyzwk"
        );
    }
}
