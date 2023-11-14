package humaneval.correct;

/*
 * Create a function which returns the largest index of an element which
    is not greater than or equal to the element immediately preceding it. If
    no such element exists then return -1. The given array will not contain
    duplicate values.

    Examples:
    can_arrange([1,2,4,3,5]) = 3
    can_arrange([1,2,3]) = -1

 */

public class CAN_ARRANGE {
    public static int can_arrange(int[] arr) {
        int ind = -1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) ind = i;
        }
        return ind;
    }
}
