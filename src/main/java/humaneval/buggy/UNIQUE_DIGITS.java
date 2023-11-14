package humaneval.buggy;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given a list of positive integers x. return a sorted list of all 
    elements that hasn't any even digit.

    Note: Returned list should be sorted in increasing order.
    
    For example:
    >>> unique_digits([15, 33, 1422, 1])
    [1, 15, 33]
    >>> unique_digits([152, 323, 1422, 10])
    []
 */

public class UNIQUE_DIGITS {
    public static ArrayList<Integer> unique_digits(ArrayList<Integer> x) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i : x) {
            int num = i;
            boolean all_odd = true;
            while(num > 0) {
                int curr_digit = num % 10;
                if((curr_digit % 2) != 0) {
                    all_odd = true;
                    break;
                }
                num /= 10;
            }
            if(all_odd) {
                res.add(i);
            }
        }
        Collections.sort(res);
        return res;
    }
}
