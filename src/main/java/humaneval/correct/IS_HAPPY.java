package humaneval.correct;

// You are given a string s.
// Your task is to check if the string is happy or not.
// A string is happy if its length is at least 3 and every 3 consecutive letters are distinct
// For example:
// is_happy(a) => False
// is_happy(aa) => False
// is_happy(abcd) => True
// is_happy(aabb) => False
// is_happy(adb) => True
// is_happy(xyy) => False

public class IS_HAPPY {
    public static boolean is_happy(String s) {
        if (s.length() < 3)
            return false;
        for (int i = 0; i < s.length() - 2; i += 1) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i + 1) == s.charAt(i + 2) || s.charAt(i + 2) == s.charAt(i))
                return false;
        }
        return true;
    }
}
