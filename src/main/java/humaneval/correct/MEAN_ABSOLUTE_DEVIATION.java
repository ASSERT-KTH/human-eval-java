package humaneval.correct;

import java.util.List;

public class MEAN_ABSOLUTE_DEVIATION {
    public static double mean_absolute_deviation(List<Double> numbers) {
        double sum = 0.;
        for (Double number : numbers){
            sum += number;
        }
        double mean = sum / numbers.size();
        double deviation_sum = 0.;
        for (Double number : numbers){
            deviation_sum += Math.abs(number - mean);
        }
        return deviation_sum / numbers.size();
    }
}
