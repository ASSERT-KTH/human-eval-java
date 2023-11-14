package humaneval.buggy;

import java.util.ArrayList;

/*
 * Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
    minSubArraySum([-1, -2, -3]) == -6
 */

public class MIN_SUBARRAY_SUM {
    public static long min_subarray_sum(ArrayList<Long> nums) {
        long max_sum = 0;
        long s = 0;
        for(long num : nums) {
            s += num;
            if(s < 0) {
                s = 0;
            }
            max_sum = Math.max(s, max_sum);
        }
        if(max_sum == 0) {
            max_sum = -nums.get(0);
            for(int i = 1; i < nums.size(); i++) {
                max_sum = Math.max(max_sum, -nums.get(i));
            }
        }
        long min_sum = -max_sum;
        return min_sum;
    }
}
