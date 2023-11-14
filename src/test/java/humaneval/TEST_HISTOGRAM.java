package humaneval;

import java.util.HashMap;

public class TEST_HISTOGRAM {
	@org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b b a");
		HashMap<Character, Integer> desired = new HashMap<>();
        desired.put('a', 2);
        desired.put('b', 2);
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c a b");
		HashMap<Character, Integer> desired = new HashMap<>();
        desired.put('a', 2);
        desired.put('b', 2);
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a b c d g");
		HashMap<Character, Integer> desired = new HashMap<>();
        desired.put('a', 1);
        desired.put('b', 1);
        desired.put('c', 1);
        desired.put('d', 1);
        desired.put('g', 1);
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("r t g");
		HashMap<Character, Integer> desired = new HashMap<>();
        desired.put('r', 1);
        desired.put('t', 1);
        desired.put('g', 1);
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("b b b b a");
		HashMap<Character, Integer> desired = new HashMap<>();
        desired.put('b', 4);
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_5() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("r t g");
		HashMap<Character, Integer> desired = new HashMap<>();
        desired.put('r', 1);
        desired.put('t', 1);
        desired.put('g', 1);
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_6() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("");
		HashMap<Character, Integer> desired = new HashMap<>();
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_7() throws java.lang.Exception {
		HashMap<Character, Integer> result = humaneval.buggy.HISTOGRAM.histogram("a");
		HashMap<Character, Integer> desired = new HashMap<>();
        desired.put('a', 1);
		org.junit.Assert.assertEquals(result, desired);
	}
}
