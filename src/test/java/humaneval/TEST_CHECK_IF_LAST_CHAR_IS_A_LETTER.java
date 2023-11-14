package humaneval;

public class TEST_CHECK_IF_LAST_CHAR_IS_A_LETTER {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("eeeee"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(true, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("A"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Pumpkin pie "));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Pumpkin pie 1"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(""));
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("eeeee e "));
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie"));
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        org.junit.Assert.assertEquals(false, humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e "));
    }
}
