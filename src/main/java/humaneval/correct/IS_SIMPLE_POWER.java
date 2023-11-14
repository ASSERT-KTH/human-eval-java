package humaneval.correct;

// Your task is to write a function that returns true if a number x is a simple
// power of n and false in other cases.
// x is a simple power of n if n**int=x
// For example:
// is_simple_power(1, 4) => true
// is_simple_power(2, 2) => true
// is_simple_power(8, 2) => true
// is_simple_power(3, 2) => false
// is_simple_power(3, 1) => false
// is_simple_power(5, 3) => false

public class IS_SIMPLE_POWER {
    public static boolean is_simple_power(int x, int n) {
        if (n == 1)
            return x == 1;
        int power = 1;
        while (power < x) {
            power *= n;
        }
        return power == x;
    }
}
