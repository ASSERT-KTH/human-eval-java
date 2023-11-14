package humaneval;

public class TEST_GET_MAX_TRIPLES {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(5);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(6);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(10);
        org.junit.Assert.assertEquals(
            result, 36
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.GET_MAX_TRIPLES.get_max_triples(100);
        org.junit.Assert.assertEquals(
            result, 53361
        );
    }
}
