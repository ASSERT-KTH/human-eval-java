package humaneval.buggy;

/* Return 2^n modulo p (be aware of numerics).
>>> modp(3, 5)
3
>>> modp(1101, 101)
2
>>> modp(0, 101)
1
>>> modp(3, 11)
8
>>> modp(100, 101)
1 */

public class MODP {
    public static int modp(int n, int p) {
        int result = 1;
        for (int i = 0; i < n; i += 1){
            result = 2 * result;
        }
        return result % p;
    }
}
