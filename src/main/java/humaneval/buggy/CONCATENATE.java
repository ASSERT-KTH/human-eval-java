package humaneval.buggy;

public class CONCATENATE {
    public static String concatenate(String[] strings) {
        String result = null;
        for (String string : strings)
            result += string;
        return result;
    }
}
