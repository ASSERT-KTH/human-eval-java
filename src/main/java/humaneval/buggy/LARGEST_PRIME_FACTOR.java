package humaneval.buggy;

// Return the largest prime factor of n. Assume n > 1 and is not a prime.
// >>> largest_prime_factor(13195)
// 29
// >>> largest_prime_factor(2048)
// 2

public class LARGEST_PRIME_FACTOR {
    public static boolean is_prime(int k) {
        if (k < 2)
            return false;
        for (int i = 2; i < k; i += 1){
            if (k % i == 0)
                return false;
        }
        return true;
    }

    public static int largest_prime_factor(int n) {
        int largest = 1;
        for (int j = 2; j < n; j += 1) {
            if (is_prime(j)){
                largest = n % j;
            }
        }
        return largest;
    }
}
