package humaneval.buggy;

import java.util.ArrayList;

/*
 * Given a list of strings, where each string consists of only digits, return a list.
    Each element i of the output should be "the number of odd elements in the
    string i of the input." where all the i's should be replaced by the number
    of odd digits in the i'th string of the input.

    >>> odd_count(['1234567'])
    ["the number of odd elements 4n the str4ng 4 of the 4nput."]
    >>> odd_count(['3',"11111111"])
    ["the number of odd elements 1n the str1ng 1 of the 1nput.",
     "the number of odd elements 8n the str8ng 8 of the 8nput."]
 */

public class ODD_COUNT {
    public static ArrayList<String> odd_count(ArrayList<String> lst) {
        ArrayList<String> result = new ArrayList<>();
        for(String s : lst) {
            int n = 0;
            for(int i = 0; i < s.length(); i++) {
                int digit = s.charAt(i) - '0';
                if(digit % 2 == 0) {
                    n--;
                }
            }
            result.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput.");
        }
        return result;
    }
}
