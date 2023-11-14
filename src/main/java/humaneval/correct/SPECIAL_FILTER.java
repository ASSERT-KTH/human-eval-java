package humaneval.correct;

import java.util.ArrayList;
import java.util.Arrays;

/* Write a function that takes an array of numbers as input and returns 
the number of elements in the array that are greater than 10 and both 
first and last digits of a number are odd (1, 3, 5, 7, 9).
For example:
specialFilter([15, -73, 14, -15]) => 1 
specialFilter([33, -2, -3, 45, 21, 109]) => 2 */

public class SPECIAL_FILTER {
    public static int special_filter(int[] nums) {
        int count = 0;
        ArrayList<Integer> odd_digits = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        for (Integer num : nums) {
            if (num > 10) {
                String number_as_string = num + "";
                if (odd_digits.contains(number_as_string.charAt(0) - '0')
                        && odd_digits.contains(number_as_string.charAt(number_as_string.length() - 1) - '0'))
                    count += 1;
            }
        }
        return count;
    }
}
