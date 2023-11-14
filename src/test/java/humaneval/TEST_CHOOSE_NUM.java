package humaneval;

public class TEST_CHOOSE_NUM {
    @org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(12, 15);
        org.junit.Assert.assertEquals(result, 14);
    }
    @org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(13, 12);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(33, 12354);
        org.junit.Assert.assertEquals(result, 12354);
    }
    @org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(5234, 5233);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(6, 29);
        org.junit.Assert.assertEquals(result, 28);
    }
    @org.junit.Test(timeout = 3000)
	public void test_5() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(27, 10);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 3000)
	public void test_6() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(7, 7);
        org.junit.Assert.assertEquals(result, -1);
    }
    @org.junit.Test(timeout = 3000)
	public void test_7() throws java.lang.Exception {
        int result = humaneval.buggy.CHOOSE_NUM.choose_num(546, 546);
        org.junit.Assert.assertEquals(result, 546);
    }
}
