package humaneval;

public class TEST_SOLVE_STRING {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE_STRING.solve_string("AsDf");
        org.junit.Assert.assertEquals(
            result, "aSdF"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE_STRING.solve_string("1234");
        org.junit.Assert.assertEquals(
            result, "4321"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE_STRING.solve_string("ab");
        org.junit.Assert.assertEquals(
            result, "AB"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE_STRING.solve_string("#a@C");
        org.junit.Assert.assertEquals(
            result, "#A@c"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE_STRING.solve_string("#AsdfW^45");
        org.junit.Assert.assertEquals(
            result, "#aSDFw^45"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE_STRING.solve_string("#6@2");
        org.junit.Assert.assertEquals(
            result, "2@6#"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE_STRING.solve_string("#$a^D");
        org.junit.Assert.assertEquals(
            result, "#$A^d"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.SOLVE_STRING.solve_string("#ccc");
        org.junit.Assert.assertEquals(
            result, "#CCC"
        );
    }
}
