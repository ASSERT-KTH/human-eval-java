package humaneval.buggy;

import java.util.ArrayList;

/*
 * Given a non-empty array of integers arr and an integer k, return
    the sum of the elements with at most two digits from the first k elements of arr.
    Assume that the negative sign counts as a digit, e.g. -5 has two digits

    Example:

        Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
        Output: 24 # sum of 21 + 3

    Constraints:
        1. 1 <= len(arr) <= 100
        2. 1 <= k <= len(arr)
 */

public class ADD_ELEMENTS {
    public static int add_elements(ArrayList<Integer> arr, int k) {
        int result = 0;
        for(int i = 0; i < k; i++) {
            if(Integer.toString(arr.get(i)).length() >= 2) {
                result -= arr.get(i);
            }
        }
        return result;
    }
}
