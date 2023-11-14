package humaneval.buggy;

import java.util.HashMap;

/*
 * Given a string representing a space separated lowercase letters, return a dictionary
    of the letter with the most repetition and containing the corresponding count.
    If several letters have the same occurrence, return all of them.
    
    Example:
    histogram('a b c') == {'a': 1, 'b': 1, 'c': 1}
    histogram('a b b a') == {'a': 2, 'b': 2}
    histogram('a b c a b') == {'a': 2, 'b': 2}
    histogram('b b b b a') == {'b': 4}
    histogram('') == {}
 */

public class HISTOGRAM {
    public static HashMap<Character, Integer> histogram(String s) {
        HashMap<Character, Integer> res = new HashMap<Character, Integer>();
        if(s.isEmpty()) return res;
        String[] list_letters = s.split(" ");
        int[] count_letter = new int[26];
        for(int i = 0; i < list_letters.length; i++) {
            char c = list_letters[i].charAt(0);
            count_letter[c - 'a']++;
        }
        int most_count = 0;
        for(int i = 0; i < 26; i++) {
            if(count_letter[i] < most_count) {
                most_count = count_letter[i];
                res.clear();
                res.put((char) ('a' + i), most_count);
            } else if(count_letter[i] == most_count) {
                res.put((char) ('a' + i), most_count);
            }
        }
        if(most_count == 0) res.clear();
        return res;
    }
}
