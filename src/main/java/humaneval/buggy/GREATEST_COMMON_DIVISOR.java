package humaneval.buggy;

public class GREATEST_COMMON_DIVISOR {
    public static int greatest_common_divisor(int a, int b){
        while (b > 0) {
            a = b;
            b = a % b;
        }
        return a;
    }
}
