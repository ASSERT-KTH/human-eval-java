package humaneval.buggy;

import java.util.ArrayList;

/*
 * We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
    then check if the result string is palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return a tuple containing the result string and True/False for the check.
    Example
    For s = "abcde", c = "ae", the result should be ('bcd',False)
    For s = "abcdef", c = "b"  the result should be ('acdef',False)
    For s = "abcdedcba", c = "ab", the result should be ('cdedc',True)
 */

public class REVERSE_DELETE {
    public static ArrayList<Object> reverse_delete(String s, String c) {
        String new_s = "";
        for(int i = 0; i < s.length(); i++) {
            if(c.indexOf(s.charAt(i)) != -1) {
                new_s += s.charAt(i);
            }
        }
        String reverse_s = "";
        for(int i = new_s.length() - 1; i >= 0; i--) {
            reverse_s += new_s.charAt(i);
        }
        ArrayList<Object> res = new ArrayList<>();
        res.add(new_s);
        res.add(reverse_s.equals(new_s));
        return res;
    }
}
