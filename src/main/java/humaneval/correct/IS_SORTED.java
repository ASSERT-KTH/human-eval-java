package humaneval.correct;

import java.util.HashMap;

/*
 * Given a list of numbers, return whether or not they are sorted
    in ascending order. If list has more than 1 duplicate of the same
    number, return False. Assume no negative numbers and only integers.

    Examples
    is_sorted([5]) ➞ True
    is_sorted([1, 2, 3, 4, 5]) ➞ True
    is_sorted([1, 3, 2, 4, 5]) ➞ False
    is_sorted([1, 2, 3, 4, 5, 6]) ➞ True
    is_sorted([1, 2, 3, 4, 5, 6, 7]) ➞ True
    is_sorted([1, 3, 2, 4, 5, 6, 7]) ➞ False
    is_sorted([1, 2, 2, 3, 3, 4]) ➞ True
    is_sorted([1, 2, 2, 2, 3, 4]) ➞ False
 */

public class IS_SORTED {
    public static boolean is_sorted(int[] lst) {
        HashMap<Integer, Integer> count_num = new HashMap<>();
        for(int i = 0; i < lst.length; i++) {
            count_num.put(lst[i], 0);
        }
        for(int i = 0; i < lst.length; i++) {
            count_num.put(lst[i], count_num.get(lst[i]) + 1);
        }
        for(int i = 0; i < lst.length; i++) {
            if(count_num.get(lst[i]) > 2) return false;
        }
        for(int i = 0; i < lst.length - 1; i++) {
            if(lst[i] > lst[i + 1]) return false;
        }
        return true;
    }
}
