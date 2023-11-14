package humaneval.buggy;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * You are given a word. Your task is to find the closest vowel that stands between 
    two consonants from the right side of the word (case sensitive).
    
    Vowels in the beginning and ending doesn't count. Return empty string if you didn't
    find any vowel met the above condition. 

    You may assume that the given string contains English letter only.

    Example:
    get_closest_vowel("yogurt") ==> "u"
    get_closest_vowel("FULL") ==> "U"
    get_closest_vowel("quick") ==> ""
    get_closest_vowel("ab") ==> ""
 */

public class GET_CLOSET_VOWEL {
    public static String get_closet_vowel(String word) {
        if(word.length() < 3) return "";
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for(int i = word.length() - 2; i >= 0; i--) {
            if(vowels.contains(word.charAt(i))) {
                if(!vowels.contains(word.charAt(i + 1)) && !vowels.contains(word.charAt(i - 1))) {
                    return word.substring(i, i + 1);
                }
            }
        }
        return "";
    }
}
