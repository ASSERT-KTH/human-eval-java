package humaneval;

public class TEST_INT_TO_MINI_ROMAN {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(19);
        org.junit.Assert.assertEquals(
            result, "xix"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(152);
        org.junit.Assert.assertEquals(
            result, "clii"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(251);
        org.junit.Assert.assertEquals(
            result, "ccli"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(426);
        org.junit.Assert.assertEquals(
            result, "cdxxvi"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(500);
        org.junit.Assert.assertEquals(
            result, "d"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(1);
        org.junit.Assert.assertEquals(
            result, "i"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(4);
        org.junit.Assert.assertEquals(
            result, "iv"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int[] inputs = new int[] {43, 90, 94, 532, 900, 994, 1000};
        String[] outputs = new String[] {"xliii", "xc", "xciv", "dxxxii", "cm", "cmxciv", "m"};
        for (int i = 0; i < inputs.length; i += 1){
            String result = humaneval.buggy.INT_TO_MINI_ROMAN.int_to_mini_roman(inputs[i]);
            org.junit.Assert.assertEquals(
                result, outputs[i]
            );
        }
    }

}
