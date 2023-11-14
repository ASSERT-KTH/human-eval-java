package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_ODD_COUNT {
    @org.junit.Test(timeout=3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("1234567"));
        ArrayList<String> result = humaneval.buggy.ODD_COUNT.odd_count(input);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList(
            "the number of odd elements 4n the str4ng 4 of the 4nput."
        ));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("3", "11111111"));
        ArrayList<String> result = humaneval.buggy.ODD_COUNT.odd_count(input);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList(
            "the number of odd elements 1n the str1ng 1 of the 1nput.",
            "the number of odd elements 8n the str8ng 8 of the 8nput."
        ));
        org.junit.Assert.assertEquals(desired, result);
    }
    @org.junit.Test(timeout=3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("271", "137", "314"));
        ArrayList<String> result = humaneval.buggy.ODD_COUNT.odd_count(input);
        ArrayList<String> desired = new ArrayList<>(Arrays.asList(
            "the number of odd elements 2n the str2ng 2 of the 2nput.",
            "the number of odd elements 3n the str3ng 3 of the 3nput.",
            "the number of odd elements 2n the str2ng 2 of the 2nput."
        ));
        org.junit.Assert.assertEquals(desired, result);
    }
}
