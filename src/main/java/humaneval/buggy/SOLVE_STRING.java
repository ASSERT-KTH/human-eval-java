package humaneval.buggy;

// You are given a string s.
// if s[i] is a letter, reverse its case from lower to upper or vise versa, 
// otherwise keep it as it is.
// If the string contains no letters, reverse the string.
// The function should return the resulted string.
// Examples
// solve("1234") = "4321"
// solve("ab") = "AB"
// solve("#a@C") = "#A@c"

public class SOLVE_STRING {
    public static String solve_string(String s) {
        int flg = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
            else sb.append(Character.toLowerCase(c));
            flg = 1;
        }
        if (flg == 0) {
            sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i -= 1) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
