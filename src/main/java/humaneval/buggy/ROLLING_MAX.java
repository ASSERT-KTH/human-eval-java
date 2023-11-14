package humaneval.buggy;

import java.util.ArrayList;
import java.util.List;

public class ROLLING_MAX {
    public static List<Integer> rolling_max(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        Integer running_max = null;

        for (Integer n : numbers){
            running_max = Math.max(running_max, n);
            result.add(running_max);
        }
        return result;
    }
}
