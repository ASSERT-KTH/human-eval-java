package humaneval.correct;

import java.util.ArrayList;
import java.util.List;

public class FILTER_INTEGERS {
    public static List<Integer> filter_integers(List<Object> values) {
        List<Integer> result = new ArrayList<Integer>();

        for (Object value : values){
            if (value instanceof Integer){
                result.add((Integer) value);
            }
        }
        return result;
    }
}
