package humaneval.correct;

/* Circular shift the digits of the integer x, shift the digits right by shift
and return the result as a string.
If shift > number of digits, return digits reversed.
>>> circular_shift(12, 1)
"21"
>>> circular_shift(12, 2)
"12" */

public class CIRCULAR_SHIFT {
    public static String circular_shift(int x, int shift) {
        String s = x + "";

        if (shift > s.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i -= 1)
                sb.append(s.charAt(i));
            return sb.toString();
        } else {
            return s.substring(s.length() - shift) + s.substring(0, s.length() - shift);
        }
    }
}
