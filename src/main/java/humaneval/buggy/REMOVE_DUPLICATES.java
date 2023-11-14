package humaneval.buggy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class REMOVE_DUPLICATES {
    public static List<Integer> remove_duplicates(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for (Integer n : numbers){
            count.put(n, count.get(n) + 1);
        }

        for (Integer n : numbers){
            if (count.get(n) == 1)
                result.add(n);
        }

        return result;
    }
}
