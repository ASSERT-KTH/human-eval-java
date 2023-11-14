package humaneval.correct;

import java.util.Arrays;

// Return True is list elements are monotonically increasing or decreasing.
// >>> monotonic([1, 2, 4, 20])
// True
// >>> monotonic([1, 20, 4, 10])
// False
// >>> monotonic([4, 1, 0, -10])
// True

public class MONOTONIC {
    public static boolean monotonic(int[] l) {
        int[] sorted = new int[l.length];
        int[] reverse_sorted = new int[l.length];

        System.arraycopy(l, 0, sorted, 0, l.length);
        
        Arrays.sort(sorted);
        
        for (int i = 0; i < l.length; i += 1)
            reverse_sorted[i] = sorted[l.length - i - 1]; 
        
        if (Arrays.equals(l, sorted) || Arrays.equals(l, reverse_sorted))
            return true;
        return false;
    }
}
