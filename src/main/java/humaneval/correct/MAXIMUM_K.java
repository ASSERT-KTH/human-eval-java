package humaneval.correct;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given an array arr of integers and a positive integer k, return a sorted list 
    of length k with the maximum k numbers in arr.

    Example 1:

        Input: arr = [-3, -4, 5], k = 3
        Output: [-4, -3, 5]

    Example 2:

        Input: arr = [4, -4, 4], k = 2
        Output: [4, 4]

    Example 3:

        Input: arr = [-3, 2, 1, 2, -1, -2, 1], k = 1
        Output: [2]

    Note:
        1. The length of the array will be in the range of [1, 1000].
        2. The elements in the array will be in the range of [-1000, 1000].
        3. 0 <= k <= len(arr)
 */

public class MAXIMUM_K {
    public static ArrayList<Integer> maximum_k(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = arr.size() - k; i <= arr.size() - 1; i++) {
            result.add(arr.get(i));
        }
        return result;
    }
}
