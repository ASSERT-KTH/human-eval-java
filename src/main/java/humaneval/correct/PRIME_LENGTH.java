package humaneval.correct;

/* Write a function that takes a string and returns True if the string
length is a prime number or False otherwise
Examples
prime_length('Hello') == True
prime_length('abcdcba') == True
prime_length('kittens') == True
prime_length('orange') == False */

public class PRIME_LENGTH {
    public static boolean prime_length(String string) {
        int l = string.length();
        if (l <= 1)
            return false;
        for (int i = 2; i < l; i += 1) {
            if (l % i == 0)
                return false;
        }
        return true;
    }
}
