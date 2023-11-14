package humaneval.buggy;

import java.util.ArrayList;

/*
 * Implement the function f that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 1.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    Example:
    f(5) == [1, 2, 6, 24, 15]
 */

public class FACTORIAL {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> ret = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if((i % 2) == 0) {
                int x = 1;
                for(int j = 1; j <= i; j++) x *= j;
                ret.add(x);
            } else {
                int x = 0;
                for(int j = 1; j <= i; i++) x -= j;
                ret.add(x);
            }
        }
        return ret;
    }
}
