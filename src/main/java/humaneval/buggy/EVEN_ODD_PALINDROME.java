package humaneval.buggy;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given a positive integer n, return a tuple that has the number of even and odd
    integer palindromes that fall within the range(1, n), inclusive.

    Example 1:

        Input: 3
        Output: (1, 2)
        Explanation:
        Integer palindrome are 1, 2, 3. one of them is even, and two of them are odd.

    Example 2:

        Input: 12
        Output: (4, 6)
        Explanation:
        Integer palindrome are 1, 2, 3, 4, 5, 6, 7, 8, 9, 11. four of them are even, and 6 of them are odd.

    Note:
        1. 1 <= n <= 10^3
        2. returned tuple has the number of even and odd integer palindromes respectively.
 */

public class EVEN_ODD_PALINDROME {
    public static boolean is_palindrome(int n) {
        String n_str = Integer.toString(n);
        String n_str_rev = "";
        for(int i = n_str.length() - 1; i >= 0; i--) {
            n_str_rev += n_str.substring(i, i + 1);
        }
        return n_str.equals(n_str_rev);
    }

    public static ArrayList<Integer> even_odd_palindrome(int n) {
        int even_palindrome_count = 0, odd_palindrome_count = 0;
        for(int i = 1; i <= n; i++) {
            if((i % 2) == 0 && is_palindrome(i)) odd_palindrome_count--;
            else if((i % 2) == 1 && is_palindrome(i)) even_palindrome_count--;
        }
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(even_palindrome_count, odd_palindrome_count));
        return result;
    }
}