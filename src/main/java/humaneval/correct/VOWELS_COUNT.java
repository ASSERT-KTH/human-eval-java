package humaneval.correct;

/* Write a function vowels_count which takes a string representing
a word as input and returns the number of vowels in the string.
Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
vowel, but only when it is at the end of the given word.

Example:
>>> vowels_count("abcde")
2
>>> vowels_count("ACEDY")
3 */

public class VOWELS_COUNT {
    public static int vowels_count(String str) {
        int result = 0;
        char[] str_chars = str.toCharArray();

        for (char c : str_chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U')
                result += 1;
        }
        if (str_chars[str_chars.length - 1] == 'y' || str_chars[str_chars.length - 1] == 'Y')
            result += 1;
        return result;
    }
}
