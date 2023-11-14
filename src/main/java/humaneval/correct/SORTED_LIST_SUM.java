package humaneval.correct;

import java.util.ArrayList;
import java.util.Collections;

/* Write a function that accepts a list of strings as a parameter,
deletes the strings that have odd lengths from it,
and returns the resulted list with a sorted order,
The list is always a list of strings and never an array of numbers,
and it may contain duplicates.
The order of the list should be ascending by length of each word, and you
should return the list sorted by that rule.
If two words have the same length, sort the list alphabetically.
The function should return a list of strings in sorted order.
You may assume that all words will have the same length.
For example:
assert list_sort(["aa", "a", "aaa"]) => ["aa"]
assert list_sort(["ab", "a", "aaa", "cd"]) => ["ab", "cd"] */

public class SORTED_LIST_SUM {
    public static ArrayList<String> sorted_list_sum(ArrayList<String> lst) {
        ArrayList<String> result = new ArrayList<String>();
        for (String str : lst) {
            if (str.length() % 2 == 1) continue;
            result.add(str);
        }

        Collections.sort(
            result,
            (s1, s2) -> {
                if (s1.length() == s2.length()) return s1.compareTo(s2);
                return s1.length() - s2.length();
            }
        );

        return result;
    }
}
