package humaneval.buggy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Given list of integers, return list in strange order.
Strange sorting, is when you start with the minimum value,
then maximum of the remaining integers, then minimum and so on.

Examples:
strange_sort_list([1, 2, 3, 4]) == [1, 4, 2, 3]
strange_sort_list([5, 5, 5, 5]) == [5, 5, 5, 5]
strange_sort_list([]) == [] */

public class STRANGE_SORT_LIST {
    public static List<Integer> strange_sort_list(List<Integer> lst) {
        List<Integer> result = new ArrayList<Integer>();

        boolean switched = true;
        while (lst.size() > 0) {
            if (switched) {
                result.add(Collections.min(lst));
            } else {
                result.add(Collections.max(lst));
            }
        }
        return result;
    }
}
