package humaneval;

public class TEST_ENCODE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.ENCODE.encode("TEST");
        org.junit.Assert.assertEquals(
            result, "tgst"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.ENCODE.encode("Mudasir");
        org.junit.Assert.assertEquals(
            result, "mWDCSKR"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.ENCODE.encode("YES");
        org.junit.Assert.assertEquals(
            result, "ygs"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.ENCODE.encode("This is a message");
        org.junit.Assert.assertEquals(
            result, "tHKS KS C MGSSCGG"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.ENCODE.encode("I DoNt KnOw WhAt tO WrItE");
        org.junit.Assert.assertEquals(
            result, "k dQnT kNqW wHcT Tq wRkTg"
        );
    }
}
