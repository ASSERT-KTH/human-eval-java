package humaneval.buggy;

/* sum_to_n is a function that sums numbers from 1 to n.
>>> sum_to_n(30)
465
>>> sum_to_n(100)
5050
>>> sum_to_n(5)
15
>>> sum_to_n(10)
55
>>> sum_to_n(1)
1 */

public class SUM_TO_N {
    public static int sum_to_n(int n) {
        return (n + 1) * (n / 2);
    }
}
