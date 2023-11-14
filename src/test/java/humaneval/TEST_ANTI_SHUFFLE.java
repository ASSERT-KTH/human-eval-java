package humaneval;

public class TEST_ANTI_SHUFFLE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.ANTI_SHUFFLE.anti_shuffle("Hi");
        org.junit.Assert.assertEquals(
            result, "Hi"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.ANTI_SHUFFLE.anti_shuffle("hello");
        org.junit.Assert.assertEquals(
            result, "ehllo"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.ANTI_SHUFFLE.anti_shuffle("number");
        org.junit.Assert.assertEquals(
            result, "bemnru"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.ANTI_SHUFFLE.anti_shuffle("abcd");
        org.junit.Assert.assertEquals(
            result, "abcd"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.ANTI_SHUFFLE.anti_shuffle("Hello World!!!");
        org.junit.Assert.assertEquals(
            result, "Hello !!!Wdlor"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.ANTI_SHUFFLE.anti_shuffle("");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.ANTI_SHUFFLE.anti_shuffle("Hi. My name is Mister Robot. How are you?");
        org.junit.Assert.assertEquals(
            result, ".Hi My aemn is Meirst .Rboot How aer ?ouy"
        );
    }
}
