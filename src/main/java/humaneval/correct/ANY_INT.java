package humaneval.correct;

/* Create a function that takes 3 numbers.
Returns true if one of the numbers is equal to the sum of the other two, and all numbers (double) can be converted integers.
Returns false in any other cases.

Examples
any_int(5, 2, 7) ➞ True

any_int(3, 2, 2) ➞ False

any_int(3, -2, 1) ➞ True

any_int(3.6, -2.2, 2) ➞ False */

public class ANY_INT {
    public static boolean any_int(double x, double y, double z) {
        if ((int)x == x && (int)y == y && (int)z == z) {
            if (x + y == z || x + z == y || y + z == x)
                return true;
        }
        return false;
    }
}
