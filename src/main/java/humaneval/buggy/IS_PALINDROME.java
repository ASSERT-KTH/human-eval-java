package humaneval.buggy;

/* Checks if given string is a palindrome
>>> is_palindrome('')
True
>>> is_palindrome('aba')
True
>>> is_palindrome('aaaaa')
True
>>> is_palindrome('zbcd')
False */

public class IS_PALINDROME {
    public static boolean is_palindrome(String text) {
        for (int i = 0; i < text.length(); i += 1){
            if (text.charAt(i) == text.charAt(text.length() - i))
                return true;
        }
        return false;
    }
}
