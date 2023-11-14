package humaneval.correct;

import java.util.ArrayList;

// Given two positive integers a and b, return the even digits between a
// and b, in ascending order.

// For example:
// generate_integers(2, 8) => [2, 4, 6, 8]
// generate_integers(8, 2) => [2, 4, 6, 8]
// generate_integers(10, 14) => []

public class GENERATE_INTEGERS {
    public static ArrayList<Integer> generate_integers(int a, int b) {
        int lower = Math.max(2, Math.min(a, b));
        int upper = Math.min(8, Math.max(a, b));

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = lower; i <= upper; i += 1) {
            if (i % 2 == 0) result.add(i);
        }
        return result;
    }
}
