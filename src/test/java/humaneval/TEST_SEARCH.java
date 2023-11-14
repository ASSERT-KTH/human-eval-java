package humaneval;

public class TEST_SEARCH {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {5, 5, 5, 5, 1}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {4, 1, 4, 1, 4, 4}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {3, 3}
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {8, 8, 8, 8, 8, 8, 8, 8}
        );
        org.junit.Assert.assertEquals(
            result, 8
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {2, 3, 3, 2, 2}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {3, 2, 8, 2}
        );
        org.junit.Assert.assertEquals(
            result, 2
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {6, 7, 1, 8, 8, 10, 5, 8, 5, 3, 10}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {8, 8, 3, 6, 5, 6, 4}
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {6, 9, 6, 7, 1, 4, 7, 1, 8, 8, 9, 8, 10, 10, 8, 4, 10, 4, 10, 1, 2, 9, 5, 7, 9}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {1, 9, 10, 1, 3}
        );
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {6, 9, 7, 5, 8, 7, 5, 3, 7, 5, 10, 10, 3, 6, 10, 2, 8, 6, 5, 4, 9, 5, 3, 10}
        );
        org.junit.Assert.assertEquals(
            result, 5
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {9, 2, 4, 1, 5, 1, 5, 2, 5, 7, 7, 7, 3, 10, 1, 5, 4, 2, 8, 4, 1, 9, 10, 7, 10, 2, 8, 10, 9, 4}
        );
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = humaneval.buggy.SEARCH.search(
            new int[] {10}
        );
        org.junit.Assert.assertEquals(
            result, -1
        );
    }
}
