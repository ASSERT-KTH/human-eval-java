package humaneval.correct;

// Create a function that takes a value (string) representing a number
// and returns the closest integer to it. If the number is equidistant
// from two integers, round it away from zero.

// Examples
// >>> closest_integer("10")
// 10
// >>> closest_integer("15.3")
// 15

// Note:
// Rounding away from zero means that if the given number is equidistant
// from two integers, the one you should return is the one that is the
// farthest from zero. For example closest_integer("14.5") should
// return 15 and closest_integer("-14.5") should return -15.

public class CLOSEST_INTEGER {
    public static int closest_integer(String value) {
        if (value.indexOf('.') >= 0) {
            while (value.charAt(value.length() - 1) == '0')
                value = value.substring(0, value.length() - 1);
        }

        double num = Double.parseDouble(value);
        int result = 0;
        if (value.length() >= 2 && value.substring(value.length() - 2).equals(".5")) {
            result = num > 0 ? (int)Math.ceil(num) : (int)Math.floor(num);
        } else if (value.length() > 0){
            result = (int)Math.round(num);
        }

        return result;
    }
}
