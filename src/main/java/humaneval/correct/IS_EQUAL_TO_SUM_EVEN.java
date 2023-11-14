package humaneval.correct;

/*
 * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
    Example
    is_equal_to_sum_even(4) == False
    is_equal_to_sum_even(6) == False
    is_equal_to_sum_even(8) == True

 */

public class IS_EQUAL_TO_SUM_EVEN {
    public static boolean is_equal_to_sum_even(int n) {
        return ((n % 2 == 0) && (n >= 8));
    }
}
