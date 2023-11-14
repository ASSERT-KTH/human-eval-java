package humaneval.buggy;

import java.util.ArrayList;

/*
 * Given a string s and a natural number n, you have been tasked to implement 
    a function that returns a list of all words from string s that contain exactly 
    n consonants, in order these words appear in the string s.
    If the string s is empty then the function should return an empty list.
    Note: you may assume the input string contains only letters and spaces.
    Examples:
    select_words("Mary had a little lamb", 4) ==> ["little"]
    select_words("Mary had a little lamb", 3) ==> ["Mary", "lamb"]
    select_words("simple white space", 2) ==> []
    select_words("Hello world", 4) ==> ["world"]
    select_words("Uncle sam", 3) ==> ["Uncle"]
 */

public class SELECT_WORDS {
    public static ArrayList<String> select_words(String s, int n) {
        ArrayList<String> result = new ArrayList<>();
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++) {
            int num_consonants = 0;
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            for(int j = 0; j < words[i].length(); j++) {
                boolean consonant = true;
                for(int k = 0; k < vowels.length; k++) {
                    if(vowels[k] == words[i].charAt(j)) {
                        consonant = false;
                        break;
                    }
                }
                if(consonant) num_consonants++;
            }
            if(num_consonants == n) result.add(words[i]);
        }
        return result;
    }
}
