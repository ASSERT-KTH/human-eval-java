package humaneval.buggy;

/* Return True if all numbers in the list l are below threshold t.
>>> below_threshold([1, 2, 4, 10], 100)
True
>>> below_threshold([1, 20, 4, 10], 5)
False */

public class BELOW_THRESHOLD {
    public static boolean below_threshold(int[] l, int t) {
        for (int i = 0; i < l.length; i += 1) {
            if (l[i] <= t)
                return true;
        }
        return false;
    }
}
