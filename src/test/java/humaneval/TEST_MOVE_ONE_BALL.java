package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_MOVE_ONE_BALL {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2));
        boolean result = humaneval.buggy.MOVE_ONE_BALL.move_one_ball(input);
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 5, 10, 1, 2));
        boolean result = humaneval.buggy.MOVE_ONE_BALL.move_one_ball(input);
        org.junit.Assert.assertEquals(result, true);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, 3, 1, 2));
        boolean result = humaneval.buggy.MOVE_ONE_BALL.move_one_ball(input);
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 5, 4, 1, 2));
        boolean result = humaneval.buggy.MOVE_ONE_BALL.move_one_ball(input);
        org.junit.Assert.assertEquals(result, false);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> input = new ArrayList<>();
        boolean result = humaneval.buggy.MOVE_ONE_BALL.move_one_ball(input);
        org.junit.Assert.assertEquals(result, true);
    }
}
