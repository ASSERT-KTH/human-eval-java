package humaneval;

public class TEST_MATCH_PARENS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String[] input = {"()(", ")"};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("Yes", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String[] input = {")", ")"};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("No", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String[] input = {"(()(())", "())())"};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("No", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String[] input = {")())", "(()()("};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("Yes", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String[] input = {"(())))", "(()())(("};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("Yes", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String[] input = {"()", "())"};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("No", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String[] input = {"(()(", "()))()"};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("Yes", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String[] input = {"((((", "((())"};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("No", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        String[] input = {")(()", "(()("};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("No", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        String[] input = {")(", ")("};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("No", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        String[] input = {"(", ")"};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("Yes", result);
    }
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        String[] input = {")", "("};
        String result = humaneval.buggy.MATCH_PARENS.match_parens(input);
        org.junit.Assert.assertEquals("Yes", result);
    }
}
