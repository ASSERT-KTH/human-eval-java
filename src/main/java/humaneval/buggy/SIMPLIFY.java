package humaneval.buggy;

/* Your task is to implement a function that will simplify the expression
x * n. The function returns True if x * n evaluates to a whole number and False
otherwise. Both x and n, are string representation of a fraction, and have the following format,
<numerator>/<denominator> where both numerator and denominator are positive whole numbers.

You can assume that x, and n are valid fractions, and do not have zero as denominator.

simplify("1/5", "5/1") = True
simplify("1/6", "2/1") = False
simplify("7/10", "10/2") = False */

public class SIMPLIFY {
    public static boolean simplify(String x, String n) {
        int a = Integer.parseInt(x.split("/")[0]);
        int b = Integer.parseInt(x.split("/")[1]);
        int c = Integer.parseInt(n.split("/")[0]);
        int d = Integer.parseInt(n.split("/")[1]);

        int numerator = a * c;
        int denom = b * d;
        if (numerator / denom == (int) (numerator / denom))
            return true;
        return false;
    }
}
