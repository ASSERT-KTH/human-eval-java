package humaneval;

public class TEST_FIX_SPACES {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.FIX_SPACES.fix_spaces(
            "Example"
        );
        org.junit.Assert.assertEquals(
            result, "Example"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.FIX_SPACES.fix_spaces(
            "Mudasir Hanif "
        );
        org.junit.Assert.assertEquals(
            result, "Mudasir_Hanif_"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.FIX_SPACES.fix_spaces(
            "Yellow Yellow  Dirty  Fellow"
        );
        org.junit.Assert.assertEquals(
            result, "Yellow_Yellow__Dirty__Fellow"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.FIX_SPACES.fix_spaces(
            "Exa   mple"
        );
        org.junit.Assert.assertEquals(
            result, "Exa-mple"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.FIX_SPACES.fix_spaces(
            "   Exa 1 2 2 mple"
        );
        org.junit.Assert.assertEquals(
            result, "-Exa_1_2_2_mple"
        );
    }
}
