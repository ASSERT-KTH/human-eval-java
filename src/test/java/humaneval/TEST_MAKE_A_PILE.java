package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_MAKE_A_PILE {
	@org.junit.Test(timeout=3000)
	public void test_0() throws java.lang.Exception {
		ArrayList<Integer> result = humaneval.buggy.MAKE_A_PILE.make_a_pile(3);
		ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(3, 5, 7));
		org.junit.Assert.assertEquals(result, desired);
	}
	public void test_1() throws java.lang.Exception {
		ArrayList<Integer> result = humaneval.buggy.MAKE_A_PILE.make_a_pile(4);
		ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(4, 6, 8, 10));
		org.junit.Assert.assertEquals(result, desired);
	}
	public void test_2() throws java.lang.Exception {
		ArrayList<Integer> result = humaneval.buggy.MAKE_A_PILE.make_a_pile(5);
		ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(5, 7, 9, 11, 13));
		org.junit.Assert.assertEquals(result, desired);
	}
	public void test_3() throws java.lang.Exception {
		ArrayList<Integer> result = humaneval.buggy.MAKE_A_PILE.make_a_pile(6);
		ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(6, 8, 10, 12, 14, 16));
		org.junit.Assert.assertEquals(result, desired);
	}
	public void test_4() throws java.lang.Exception {
		ArrayList<Integer> result = humaneval.buggy.MAKE_A_PILE.make_a_pile(8);
		ArrayList<Integer> desired = new ArrayList<Integer>(Arrays.asList(8, 10, 12, 14, 16, 18, 20, 22));
		org.junit.Assert.assertEquals(result, desired);
	}
}
