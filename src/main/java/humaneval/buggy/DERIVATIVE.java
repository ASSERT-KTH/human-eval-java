package humaneval.buggy;

import java.util.ArrayList;
import java.util.List;

/* xs represent coefficients of a polynomial.
xs[0] + xs[1] * x + xs[2] * x^2 + ....
    Return derivative of this polynomial in the same form.
>>> derivative([3, 1, 2, 4, 5])
[1, 4, 12, 20]
>>> derivative([1, 2, 3])
[2, 6] */

public class DERIVATIVE {
    public static List<Integer> derivative(List<Integer> xs) {
        List<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < xs.size(); i += 1)
            result.add(xs.get(i));
        return result;
    }
}
