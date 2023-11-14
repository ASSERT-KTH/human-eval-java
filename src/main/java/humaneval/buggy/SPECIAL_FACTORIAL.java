package humaneval.buggy;

/*
 * he Brazilian factorial is defined as:
    brazilian_factorial(n) = n! * (n-1)! * (n-2)! * ... * 1!
    where n > 0

    For example:
    >>> special_factorial(4)
    288

    The function will receive an integer as input and should return the special
    factorial of this integer.

 */

public class SPECIAL_FACTORIAL {
    public static long special_factorial(long n) {
        long fact_i = 1, special_fact = 1;
        for(long i = n; i >= 1; i--) {
            fact_i *= i * fact_i;
            special_fact += i * fact_i;
        }
        return special_fact;
    }
}
