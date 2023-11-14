package humaneval.correct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

/*
 * Given an array of integers, sort the integers that are between 1 and 9 inclusive,
    reverse the resulting array, and then replace each digit by its corresponding name from
    "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".

    For example:
      arr = [2, 1, 1, 4, 5, 8, 2, 3]   
            -> sort arr -> [1, 1, 2, 2, 3, 4, 5, 8] 
            -> reverse arr -> [8, 5, 4, 3, 2, 2, 1, 1]
      return ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
    
      If the array is empty, return an empty array:
      arr = []
      return []
    
      If the array has any strange number ignore it:
      arr = [1, -1 , 55] 
            -> sort arr -> [-1, 1, 55]
            -> reverse arr -> [55, 1, -1]
      return = ['One']
 */

public class BY_LENGTH {
    public static ArrayList<String> by_length(ArrayList<Integer> a) {
        Map<Integer, String> digit_map = new HashMap<>();
        digit_map.put(1, "One");
        digit_map.put(2, "Two");
        digit_map.put(3, "Three");
        digit_map.put(4, "Four");
        digit_map.put(5, "Five");
        digit_map.put(6, "Six");
        digit_map.put(7, "Seven");
        digit_map.put(8, "Eight");
        digit_map.put(9, "Nine");
        Collections.sort(a, Collections.reverseOrder());
        ArrayList<String> result = new ArrayList<>();
        for(int num : a) {
            if(digit_map.get(num) != null) {
                result.add(digit_map.get(num));
            }
        }
        return result;
    }
}
