package humaneval.correct;

/*
 * You are given a list of two strings, both strings consist of open
    parentheses '(' or close parentheses ')' only.
    Your job is to check if it is possible to concatenate the two strings in
    some order, that the resulting string will be good.
    A string S is considered to be good if and only if all parentheses in S
    are balanced. For example: the string '(())()' is good, while the string
    '())' is not.
    Return 'Yes' if there's a way to make a good string, and return 'No' otherwise.

    Examples:
    match_parens(['()(', ')']) == 'Yes'
    match_parens([')', ')']) == 'No'
 */

public class MATCH_PARENS {
    public static boolean check(String s) {
        int val = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') val++;
            else val--;
            if(val < 0) return false;
        }
        return val == 0;
    }
    public static String match_parens(String[] lst) {
        String S1 = lst[0] + lst[1];
        String S2 = lst[1] + lst[0];
        if(check(S1) || check(S2)) return "Yes";
        return "No";
    }
}
