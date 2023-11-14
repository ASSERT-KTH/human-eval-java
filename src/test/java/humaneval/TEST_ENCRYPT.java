package humaneval;

public class TEST_ENCRYPT {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.ENCRYPT.encrypt("hi");
        org.junit.Assert.assertEquals(
            result, "lm"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.ENCRYPT.encrypt("asdfghjkl");
        org.junit.Assert.assertEquals(
            result, "ewhjklnop"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.ENCRYPT.encrypt("gf");
        org.junit.Assert.assertEquals(
            result, "kj"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.ENCRYPT.encrypt("et");
        org.junit.Assert.assertEquals(
            result, "ix"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.ENCRYPT.encrypt("faewfawefaewg");
        org.junit.Assert.assertEquals(
            result, "jeiajeaijeiak"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.ENCRYPT.encrypt("hellomyfriend");
        org.junit.Assert.assertEquals(
            result, "lippsqcjvmirh"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.ENCRYPT.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh");
        org.junit.Assert.assertEquals(
            result, "hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.ENCRYPT.encrypt("a");
        org.junit.Assert.assertEquals(
            result, "e"
        );
    }
}
