package humaneval.correct;

import java.util.ArrayList;
import java.util.List;

// Implement a function that takes an non-negative integer and returns an array of the first n
// integers that are prime numbers and less than n.
// for example:
// count_up_to(5) => [2,3]
// count_up_to(11) => [2,3,5,7]
// count_up_to(0) => []
// count_up_to(20) => [2,3,5,7,11,13,17,19]
// count_up_to(1) => []
// count_up_to(18) => [2,3,5,7,11,13,17]

public class COUNT_UP_TO {
    public static List<Integer> count_up_to(int n) {
        List<Integer> primes = new ArrayList<Integer>();

        for (int i = 2; i < n; i += 1){
            boolean is_prime = true;
            for (int j = 2; j < i; j += 1){
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) primes.add(i);
        }
        return primes;
    }
}
