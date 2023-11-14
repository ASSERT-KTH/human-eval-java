package humaneval.buggy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* Write a function which sorts the given list of integers
in ascending order according to the sum of their digits.
Note: if there are several items with similar sum of their digits,
order them based on their index in original list.

For example:
>>> order_by_points([1, 11, -1, -11, -12]) == [-1, -11, 1, -12, 11]
>>> order_by_points([]) == [] */

public class ORDER_BY_POINTS {
    public static Integer[] order_by_points(Integer[] nums) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        HashMap<Integer, ArrayList<Integer>> digits_number = new HashMap<Integer, ArrayList<Integer>>();

        for (int i = 0; i < nums.length; i += 1){
            int neg = 1;
            int n = nums[i];
            if (n < 0) {
                n = -1 * n;
                neg = -1;
            }
            int digit = 0;
            for (int j = 0; j < (n + "").toCharArray().length; j += 1){
                digit += ((n + "").toCharArray()[j] - '0') * neg;
            }
            digits.add(digit);
            if (! digits_number.containsKey(digit))
                digits_number.put(digit, new ArrayList<Integer>());
            digits_number.get(digit).add(nums[i]);
        }
        Collections.sort(digits);
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < digits.size(); i += 1) {
            result.addAll(digits_number.get(digits.get(i)));
        }
        return result.toArray(new Integer[] {});
    }
}
