package humaneval.correct;

import java.util.ArrayList;

/* The Fib4 number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
fib4(0) -> 0
fib4(1) -> 0
fib4(2) -> 2
fib4(3) -> 0
fib4(n) -> fib4(n-1) + fib4(n-2) + fib4(n-3) + fib4(n-4).
Please write a function to efficiently compute the n-th element of the fib4 number sequence.  Do not use recursion.
>>> fib4(5)
4
>>> fib4(6)
8
>>> fib4(7)
14 */

public class FIB4 {
    public static int fib4(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        result.add(0);
        result.add(0);
        result.add(2);
        result.add(0);

        if (n < 4)
            return result.get(n);
        for (int i = 4; i < n + 1; i += 1) {
            result.add(
                result.get(0) + result.get(1) + result.get(2) + result.get(3)
            );
            result.remove(0);
        }
        return result.get(result.size() - 1);
    }
}
