package humaneval.buggy;

/*
 * Create a function that returns True if the last character
    of a given string is an alphabetical character and is not
    a part of a word, and False otherwise.
    Note: "word" is a group of characters separated by space.

    Examples:
    check_if_last_char_is_a_letter("apple pie") ➞ False
    check_if_last_char_is_a_letter("apple pi e") ➞ True
    check_if_last_char_is_a_letter("apple pi e ") ➞ False
    check_if_last_char_is_a_letter("") ➞ False 

 */

public class CHECK_IF_LAST_CHAR_IS_A_LETTER {
    public static boolean check_if_last_char_is_a_letter(String txt) {
        String[] parts = txt.split(" ");
        String last = " ";
        last = parts[parts.length - 1];
        if(txt.charAt(txt.length() - 1) == ' ') last = " ";
        if(txt.length() == 1) last = " ";
        int last_char_pos = Character.toUpperCase(last.charAt(0)) - 'a';
        return (last.length() == 1) || (0 <= last_char_pos || last_char_pos <= 25);
    }
}
