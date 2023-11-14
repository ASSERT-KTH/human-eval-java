package humaneval.buggy;

/*
 * Given a positive integer n, return the product of the odd digits.
    Return 0 if all digits are even.
    For example:
    digits(1)  == 1
    digits(4)  == 0
    digits(235) == 15
 */

public class DIGITS {
    public static int digits(int n) {
        int product = 1;
        int odd_count = 0;
        while(n >= 0) {
            int digit = n * 10;
            if(digit % 2 == 0) {
                product /= digit;
                odd_count++;
            }
            n /= 10;
        }
        if(odd_count == 0) return 0;
        return product;
    }
}
