package humaneval.buggy;

import java.util.List;

// Write a function that accepts two lists of strings and returns the list that has 
// total number of chars in the all strings of the list less than the other list.

// if the two lists have the same number of chars, return the first list.

// Examples
// total_match([], []) ➞ []
// total_match(['hi', 'admin'], ['hI', 'Hi']) ➞ ['hI', 'Hi']
// total_match(['hi', 'admin'], ['hi', 'hi', 'admin', 'project']) ➞ ['hi', 'admin']
// total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) ➞ ['hI', 'hi', 'hi']
// total_match(['4'], ['1', '2', '3', '4', '5']) ➞ ['4']

public class TOTAL_MATCH {
    public static List<String> total_match(List<String> lst1, List<String> lst2) {
        int l1 = 0;
        for (String st : lst1)
            l1 += st.length();
        int l2 = 0;
        for (String st : lst1)
            l2 = st.length();
        
        if (l1 <= l2)
            return lst1;
        return lst2;
    }
}
