package humaneval.correct;

import java.util.List;

public class LONGEST {
    public static String longest(List<String> strings){
        int maxlen = 0;
        for (String string : strings){
            if (string.length() > maxlen){
                maxlen = string.length();
            }
        }
        for (String string : strings){
            if (string.length() == maxlen){
                return string;
            }
        }
        return null;
    }
}
