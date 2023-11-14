package humaneval;

public class TEST_SORT_NUMBERS {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("three");
        org.junit.Assert.assertEquals(
            result, "three"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("three five nine");
        org.junit.Assert.assertEquals(
            result, "three five nine"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("five zero four seven nine eight");
        org.junit.Assert.assertEquals(
            result, "zero four five seven eight nine"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.SORT_NUMBERS.sort_numbers("six five four three two one zero");
        org.junit.Assert.assertEquals(
            result, "zero one two three four five six"
        );
    }
}
