package humaneval.correct;

import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_SUBSTRING {
    public static List<String> filter_by_substring(List<String> strings, String substring) {
        List<String> result = new ArrayList<String>();
        for (String string : strings){
            if (string.contains(substring)){
                result.add(string);
            }
        }
        return result;
    }
}
