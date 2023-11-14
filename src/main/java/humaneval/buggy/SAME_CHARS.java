package humaneval.buggy;

import java.util.*;

/* Check if two words have the same characters.
>>> same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc')
True
>>> same_chars('abcd', 'dddddddabc')
True
>>> same_chars('dddddddabc', 'abcd')
True
>>> same_chars('eabcd', 'dddddddabc')
False
>>> same_chars('abcd', 'dddddddabce')
False
>>> same_chars('eabcdzzzz', 'dddzzzzzzzddddabc')
False */

public class SAME_CHARS {
    public static boolean same_chars(String s0, String s1) {
        ArrayList<Character> set0 = new ArrayList<Character>();
        ArrayList<Character> set1 = new ArrayList<Character>();

        for (char c0 : s0.toCharArray()) {
            set0.add(c0);
        }
        for (char c1 : s1.toCharArray()) {
            set1.add(c1);
        }
        return set0.equals(set1);
    }
}
