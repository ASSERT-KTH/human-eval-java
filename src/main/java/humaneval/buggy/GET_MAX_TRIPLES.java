package humaneval.buggy;

/* You are given a positive integer n. You have to create an integer array a of length n.
    For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
    Return the number of triples (a[i], a[j], a[k]) of a where i < j < k, 
and a[i] + a[j] + a[k] is a multiple of 3.

Example :
    Input: n = 5
    Output: 1
    Explanation: 
    a = [1, 3, 7, 13, 21]
    The only valid triple is (1, 7, 13). */

public class GET_MAX_TRIPLES {
    public static int get_max_triples(int n) {
        int[] A = new int[n];
        for (int i = 1; i <= n; i += 1)
            A[i - 1] = i * i - i + 1;
        
        int result = 0;
        for (int i = 0; i < n-2; i += 1) {
            for (int j = 0; j < n-1; j += 1) {
                for (int k = 0; k < n; k += 1) {
                    if ((A[i] + A[j] + A[k]) % 3 == 0) result += 1;
                }
            }
        }
        return result;
    }
}
