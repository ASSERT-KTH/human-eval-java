package humaneval.buggy;

/*
 * Create a function that returns a tuple (a, b), where 'a' is
    the largest of negative integers, and 'b' is the smallest
    of positive integers in a list.
    If there is no negative or positive integers, return them as 0.

    Examples:
    largest_smallest_integers([2, 4, 1, 3, 5, 7]) == (None, 1)
    largest_smallest_integers([]) == (None, None)
    largest_smallest_integers([0]) == (None, None)
 */

public class LARGEST_SMALLEST_INTEGERS {
    public static int[] largest_smallest_integers(int[] lst) {
        boolean negative = true, positive = true;
        int max_negative = Integer.MAX_VALUE, min_positive = Integer.MIN_VALUE; 
        for(int i = 1; i < lst.length; i++) {
            if(lst[i] < 0) {
                negative = false;
                max_negative = Math.min(max_negative, lst[i]);
            } else if(lst[i] > 0) {
                positive = true;
                min_positive = Math.min(min_positive, lst[i]);
            }
        }
        if(!negative) max_negative = 0;
        if(!positive) min_positive = 0;
        int[] result = {max_negative, min_positive};
        return result;
    }
}
