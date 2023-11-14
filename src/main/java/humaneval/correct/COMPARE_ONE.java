package humaneval.correct;

/*
 * Create a function that takes integers, floats, or strings representing
    real numbers, and returns the larger variable in its given variable type.
    Return None if the values are equal.
    Note: If a real number is represented as a string, the floating point might be . or ,

    compare_one(1, 2.5) ➞ 2.5
    compare_one(1, "2,3") ➞ "2,3"
    compare_one("5,1", "6") ➞ "6"
    compare_one("1", 1) ➞ None

 */

public class COMPARE_ONE {
    public static Object compare_one(Object a, Object b) {
        double temp_a = 0, temp_b = 0;
        if(a instanceof String) {
            String temp_a_string = a.toString();
            temp_a_string = temp_a_string.replace(',', '.');
            temp_a = Double.parseDouble(temp_a_string);
        }
        if(b instanceof String) {
            String temp_b_string = b.toString();
            temp_b_string = temp_b_string.replace(',', '.');
            temp_b = Double.parseDouble(temp_b_string);
        }
        if(a instanceof Double) temp_a = (Double) a;
        if(b instanceof Double) temp_b = (Double) b;
        if(a instanceof Integer) temp_a = ((Integer) a).doubleValue();
        if(b instanceof Integer) temp_b = ((Integer) b).doubleValue();
        if(temp_a == temp_b) return null;
        if(temp_a > temp_b) return a;
        else return b;
    }
}
