package humaneval.correct;

// Given a positive integer, obtain its roman numeral equivalent as a string,
// and return it in lowercase.
// Restrictions: 1 <= num <= 1000

// Examples:
// >>> int_to_mini_roman(19) == 'xix'
// >>> int_to_mini_roman(152) == 'clii'
// >>> int_to_mini_roman(426) == 'cdxxvi'

public class INT_TO_MINI_ROMAN {
    public static String int_to_mini_roman(int number) {
        int[] num = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] sym = new String[] {
            "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"
        };

        int i = 12;
        String result = "";
        while (number > 0) {
            int div = (int) (number / num[i]);
            while (div > 0) {
                result += sym[i];
                div -= 1;
            }
            number %= num[i];
            i -= 1;
        }
        return result.toLowerCase();
    }
}
