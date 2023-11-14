package humaneval.correct;

public class CONCATENATE {
    public static String concatenate(String[] strings) {
        String result = "";
        for (String string : strings)
            result += string;
        return result;
    }
}
