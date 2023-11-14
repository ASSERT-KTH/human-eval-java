package humaneval.buggy;

import java.util.HashSet;

public class COUNT_DISTINCT_CHARACTERS {
    public static int count_distinct_characters(String string) {
        HashSet<Character> distinct = new HashSet<Character>();

        for (char c : string.toCharArray()) {
            if (! distinct.contains(Character.toLowerCase(c)))
                distinct.add(c);
        }
        return distinct.size();
    }
}
