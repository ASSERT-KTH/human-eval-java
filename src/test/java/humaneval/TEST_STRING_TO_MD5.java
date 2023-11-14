package humaneval;

public class TEST_STRING_TO_MD5 {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_TO_MD5.string_to_md5("Hello world");
        org.junit.Assert.assertEquals(
            result, "3e25960a79dbc69b674cd4ec67a72c62"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_TO_MD5.string_to_md5("");
        org.junit.Assert.assertEquals(
            result, null
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_TO_MD5.string_to_md5("A B C");
        org.junit.Assert.assertEquals(
            result, "0ef78513b0cb8cef12743f5aeb35f888"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.STRING_TO_MD5.string_to_md5("password");
        org.junit.Assert.assertEquals(
            result, "5f4dcc3b5aa765d61d8327deb882cf99"
        );
    }
}
