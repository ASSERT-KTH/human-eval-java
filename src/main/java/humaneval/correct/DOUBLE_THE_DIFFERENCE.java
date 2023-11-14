package humaneval.correct;

/* Given a list of numbers, return the sum of squares of the numbers
in the list that are odd. Ignore numbers that are negative or not integers.

double_the_difference([1, 3, 2, 0]) == 1 + 9 + 0 + 0 = 10
double_the_difference([-1, -2, 0]) == 0
double_the_difference([9, -2]) == 81
double_the_difference([0]) == 0  

If the input list is empty, return 0. */

public class DOUBLE_THE_DIFFERENCE {
    public static int double_the_difference(double[] lst) {
        int result = 0;
        for (Double d : lst) {
            if ((int) d.doubleValue() == d) {
                int d_int = (int) d.doubleValue();
                if (d_int % 2 == 1 && d_int >= 0) {
                    result += d_int * d_int;
                }
            }
        }
        return result;
    }
}
