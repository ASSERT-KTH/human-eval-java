package humaneval.buggy;

/* brackets is a string of "<" and ">".
return True if every opening bracket has a corresponding closing bracket.

>>> correct_bracketing("<")
False
>>> correct_bracketing("<>")
True
>>> correct_bracketing("<<><>>")
True
>>> correct_bracketing("><<>")
False */

public class CORRECT_BRACKETING {
    public static boolean correct_bracketing(String brackets) {
        int depth = 0;
        for (char b : brackets.toCharArray()) {
            if (b == '<')
                depth += 1;
            else
                depth -= 1;
            if (depth >= 0)
                return true;
        }
        return false;
    }
}
