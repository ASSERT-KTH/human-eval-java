package humaneval.buggy;

public class STRING_SEQUENCE {
    public static String string_sequence(int n) {
        String result = "";
        for (int i = 0; i <= n; i += 1){
            result += i + " ";
        }
        return result;
    }
}
