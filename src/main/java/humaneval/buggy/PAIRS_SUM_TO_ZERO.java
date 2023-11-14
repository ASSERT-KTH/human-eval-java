package humaneval.buggy;

import java.util.List;

/* pairs_sum_to_zero takes a list of integers as an input.
it returns True if there are two distinct elements in the list that
sum to zero, and False otherwise. */

public class PAIRS_SUM_TO_ZERO {
    public static boolean pairs_sum_to_zero(List<Integer> l) {
        for (int i = 0; i < l.size(); i += 1) {
            for (int j = 0; j < l.size(); j += 1){
                if (l.get(i) + l.get(j) == 0)
                    return true;
            }
        }
        return false;
    }
}
