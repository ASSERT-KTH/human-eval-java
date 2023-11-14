package humaneval.correct;

import java.util.Arrays;

/* Return median of elements in the list l.
>>> median([3, 1, 2, 4, 5])
3
>>> median([-10, 4, 6, 1000, 10, 20])
15.0 */

public class MEDIAN {
    public static double median(int[] list) {
        Arrays.sort(list);

        if (list.length % 2 == 1) {
            return list[(int) (list.length / 2)];
        } else {
            return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
        }
    }
}
