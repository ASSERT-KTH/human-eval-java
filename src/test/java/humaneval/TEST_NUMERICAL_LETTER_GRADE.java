package humaneval;

public class TEST_NUMERICAL_LETTER_GRADE {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {4.0, 3, 1.7, 2, 3.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"A+", "B", "C-", "C", "A-"}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1.2}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D+"}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.5}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D-"}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0.0}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E"}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {1, 0.3, 1.5, 2.8, 3.3}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"D", "D-", "C-", "B", "B+"}
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String[] result = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(
            new double[] {0, 0.7}
        );
        org.junit.Assert.assertArrayEquals(
            result, new String[] {"E", "D-"}
        );
    }
}
