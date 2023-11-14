package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_EXCHANGE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        String result = humaneval.buggy.EXCHANGE.exchange(lst1, lst2);
        org.junit.Assert.assertEquals(result, "YES");
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 5, 3, 4));
        String result = humaneval.buggy.EXCHANGE.exchange(lst1, lst2);
        org.junit.Assert.assertEquals(result, "NO");
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 1, 4, 3));
        String result = humaneval.buggy.EXCHANGE.exchange(lst1, lst2);
        org.junit.Assert.assertEquals(result, "YES");
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(5, 7, 3));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 6, 4));
        String result = humaneval.buggy.EXCHANGE.exchange(lst1, lst2);
        org.junit.Assert.assertEquals(result, "YES");
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(5, 7, 3));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 6, 3));
        String result = humaneval.buggy.EXCHANGE.exchange(lst1, lst2);
        org.junit.Assert.assertEquals(result, "NO");
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(3, 2, 6, 1, 8, 9));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(3, 5, 5, 1, 1, 1));
        String result = humaneval.buggy.EXCHANGE.exchange(lst1, lst2);
        org.junit.Assert.assertEquals(result, "NO");
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(100, 200));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(200, 200));
        String result = humaneval.buggy.EXCHANGE.exchange(lst1, lst2);
        org.junit.Assert.assertEquals(result, "YES");
    }
}
