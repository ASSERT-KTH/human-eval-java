package humaneval.correct;

/*
 * Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
    should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
    alphabet, ord('a') = 0, ord('b') = 1, ... ord('z') = 25
    Examples
    split_words("Hello world!") ➞ ["Hello", "world!"]
    split_words("Hello,world!") ➞ ["Hello", "world!"]
    split_words("abcdef") == 3 
 */

public class SPLIT_WORDS {
    public static String[] split_words(String txt) {
        if(txt.contains(" ")) {
            return txt.split(" ");
        } else if(txt.contains(",")) {
            return txt.split(",");
        } else {
            int count = 0;
            for(int i = 0; i < txt.length(); i++) {
                char curr = txt.charAt(i);
                if(Character.isLowerCase(curr) && ((curr - 'a') % 2) == 1) count++;
            }
            String[] result = {Integer.toString(count)};
            return result;
        }
    }
}
