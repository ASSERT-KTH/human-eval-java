package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_EVEN_ODD_PALINDROME {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(123);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(8, 13));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(12);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4, 6));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1, 2));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(63);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(6, 8));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(25);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5, 6));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(25);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5, 6));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(19);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4, 6));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(9);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4, 5));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        ArrayList<Integer> result = humaneval.buggy.EVEN_ODD_PALINDROME.even_odd_palindrome(1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0, 1));
        org.junit.Assert.assertEquals(result, desired);
    }
}