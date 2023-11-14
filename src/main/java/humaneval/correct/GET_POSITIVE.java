package humaneval.correct;

import java.util.ArrayList;
import java.util.List;

public class GET_POSITIVE {
    public static List<Integer> get_positive(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();

        for (Integer number : numbers) {
            if (number > 0){
                result.add(number);
            }
        }
        return result;
    }
}
