package humaneval.buggy;

public class IS_PRIME {
    public static boolean is_prime(int n){
        if (n < 2)
            return false;
        for (int k = 0; k < n; k += 1){
            if (n % k == 0)
                return false;
        }
        return true;
    }
}
