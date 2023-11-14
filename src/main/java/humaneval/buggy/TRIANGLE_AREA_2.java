package humaneval.buggy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* Given the lengths of the three sides of a triangle. Return the area of
the triangle rounded to 2 decimal points if the three sides form a valid triangle. 
Otherwise return -1
Three sides make a valid triangle when the sum of any two sides is greater 
than the third side.
Example:
triangle_area(3, 4, 5) == 6.00
triangle_area(1, 2, 10) == -1 */

public class TRIANGLE_AREA_2 {
    public static double triangle_area_2(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return -1;
        
        double s = (a + b + c) / 2.;
        double result = Math.pow(s, 0.5);
        
        BigDecimal bd = BigDecimal.valueOf(result);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
