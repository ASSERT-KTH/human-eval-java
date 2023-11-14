package humaneval.buggy;

public class MAKE_PALINDROME {
    public static boolean is_palindrome(String str){
        for (int i = 0; i < str.length(); i += 1){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static String make_palindrome(String str){
        if (str.length() == 0)
            return "";

        int beginning_of_suffix = 0;
        while (! is_palindrome(str.substring(beginning_of_suffix))){
            beginning_of_suffix += 1;
        }
        
        String result = str;
        result += str.substring(0, beginning_of_suffix);
        return result;
    }
}
