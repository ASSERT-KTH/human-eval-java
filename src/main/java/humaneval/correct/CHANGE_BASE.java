package humaneval.correct;

/* Change numerical base of input number x to base.
return string representation after the conversion.
base numbers are less than 10.
>>> change_base(8, 3)
'22'
>>> change_base(8, 2)
'1000'
>>> change_base(7, 2)
'111' */

public class CHANGE_BASE {
    public static String change_base(int x, int base) {
        String result = "";

        while (x > 0) {
            result = (x % base) + result;
            x = (int) x / base;
        }
        return result;
    }
}
