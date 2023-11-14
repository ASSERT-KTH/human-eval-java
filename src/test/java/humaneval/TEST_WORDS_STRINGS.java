package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_WORDS_STRINGS {
	@org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {
		ArrayList<String> result = humaneval.buggy.WORDS_STRINGS.words_strings("Hi, my name is John");
		ArrayList<String> desired = new ArrayList<String>(Arrays.asList("Hi", "my", "name", "is", "John"));
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {
		ArrayList<String> result = humaneval.buggy.WORDS_STRINGS.words_strings("One, two, three, four, five, six");
		ArrayList<String> desired = new ArrayList<String>(Arrays.asList("One", "two", "three", "four", "five", "six"));
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {
		ArrayList<String> result = humaneval.buggy.WORDS_STRINGS.words_strings("Hi, my name");
		ArrayList<String> desired = new ArrayList<String>(Arrays.asList("Hi", "my", "name"));
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {
		ArrayList<String> result = humaneval.buggy.WORDS_STRINGS.words_strings("One,, two, three, four, five, six,");
		ArrayList<String> desired = new ArrayList<String>(Arrays.asList("One", "two", "three", "four", "five", "six"));
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {
		ArrayList<String> result = humaneval.buggy.WORDS_STRINGS.words_strings("");
		ArrayList<String> desired = new ArrayList<String>();
		org.junit.Assert.assertEquals(result, desired);
	}
	@org.junit.Test(timeout = 3000)
	public void test_5() throws java.lang.Exception {
		ArrayList<String> result = humaneval.buggy.WORDS_STRINGS.words_strings("ahmed     , gamal");
		ArrayList<String> desired = new ArrayList<String>(Arrays.asList("ahmed", "gamal"));
		org.junit.Assert.assertEquals(result, desired);
	}
}
