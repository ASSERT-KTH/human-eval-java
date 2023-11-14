package humaneval.buggy;

import java.util.Arrays;

/* Given an array of non-negative integers, return a copy of the given array after sorting,
you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
or sort it in descending order if the sum( first index value, last index value) is even.

Note:
* don't change the given array.

Examples:
* sort_array([]) => []
* sort_array([5]) => [5]
* sort_array([2, 4, 3, 0, 1, 5]) => [0, 1, 2, 3, 4, 5]
* sort_array([2, 4, 3, 0, 1, 5, 6]) => [6, 5, 4, 3, 2, 1, 0] */

public class SORT_ARRAY {
    public static int[] sort_array(int[] array) {
        if (array.length == 0)
            return array;
        Arrays.sort(array);
        if ((array[0] + array[array.length - 1]) % 2 == 1)
            return array;
        else {
            for (int i = 0; i < array.length / 2; i += 1){
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = array[i];
            }
            return array;
        }
    }
}
