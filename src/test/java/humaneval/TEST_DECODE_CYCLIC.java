package humaneval;

public class TEST_DECODE_CYCLIC {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.DECODE_CYCLIC.decode_cyclic("bcaefdg");
        org.junit.Assert.assertEquals(
            result, "abcdefg"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.DECODE_CYCLIC.decode_cyclic("bcaefdhigkljmn");
        org.junit.Assert.assertEquals(
            result, "abcdefghijklmn"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.DECODE_CYCLIC.decode_cyclic("zwqecxvtrynb");
        org.junit.Assert.assertEquals(
            result, "qzwxecrvtbyn"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.DECODE_CYCLIC.decode_cyclic("aaaaaa");
        org.junit.Assert.assertEquals(
            result, "aaaaaa"
        );
    }
}
