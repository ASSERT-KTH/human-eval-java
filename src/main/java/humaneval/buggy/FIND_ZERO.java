package humaneval.buggy;

import java.util.List;

public class FIND_ZERO {
    public static double poly(List<Double> xs, double x) {
        double sum = 0;
        for (int i = 0; i < xs.size(); i += 1){
            sum += xs.get(i) * Math.pow(x, i);
        }
        return sum;
    }

    public static double find_zero(List<Double> xs){
        double begin = -1.;
        double end = 1.;

        while (poly(xs, begin) * poly(xs, end) > 0) {
            begin *= 2.;
            end *= 2.;
        }
        while (end - begin > 1e-10) {
            double center = (begin + end) / 2.;
            
            if (poly(xs, begin) * poly(xs, end) < 0) {
                begin = center;
            } else {
                end = center;
            }
        }
        return begin;
    }
}
