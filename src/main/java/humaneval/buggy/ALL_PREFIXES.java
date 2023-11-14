package humaneval.buggy;

import java.util.ArrayList;
import java.util.List;

public class ALL_PREFIXES {
    public static List<String> all_prefixes(String string){
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < string.length(); i += 1){
            result.add(string.substring(i + 1));
        }

        return result;
    }
}
