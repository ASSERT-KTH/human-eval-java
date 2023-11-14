package humaneval;

import java.util.List;

public class TEST_PARSE_MUSIC {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_MUSIC.parse_music("");
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_MUSIC.parse_music("o o o o");
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {4, 4, 4, 4}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_MUSIC.parse_music(".| .| .| .|");
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {1, 1, 1, 1}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_MUSIC.parse_music("o| o| .| .| o o o o");
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {2, 2, 1, 1, 4, 4, 4, 4}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        List<Integer> result = humaneval.buggy.PARSE_MUSIC.parse_music("o| .| o| .| o o| o o|");
        org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {2, 1, 2, 1, 4, 2, 4, 2}
        );
    }
}
