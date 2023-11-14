package humaneval.buggy;

import java.util.ArrayList;
import java.util.List;

/* Return list with elements incremented by 1.
>>> incr_list([1, 2, 3])
[2, 3, 4]
>>> incr_list([5, 3, 5, 2, 3, 3, 9, 0, 123])
[6, 4, 6, 3, 4, 4, 10, 1, 124] */

public class INCR_LIST {
    public static List<Integer> incr_list(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();

        for (Integer n : l) {
            result.add(n - 1);
        }
        return result;
    }
}
