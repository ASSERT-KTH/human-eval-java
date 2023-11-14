package humaneval.correct;

/*
 * You are given two positive integers n and m, and your task is to compute the
    average of the integers from n through m (including n and m). 
    Round the answer to the nearest integer (if the number ends in 0.5 round down)
    and convert that to binary.
    If n is greater than m, return -1.
    Example:
    rounded_avg(1, 5) => "11"
    rounded_avg(7, 5) => -1
 */

public class ROUNDED_AVG {
    public static String rounded_avg(int n, int m) {
        if(m < n) return "-1";
        int summation = 0;
        for(int i = n; i < m + 1; i++) {
            summation += i;
        }
        double avg = ((double) summation)/((double) (m - n + 1));
        double rem = avg - Math.floor(avg);
        int avg_rounded = 0;
        if(rem <= 0.5) {
            avg_rounded = (int) Math.floor(avg);
        } else {
            avg_rounded = (int) Math.ceil(avg);
        }
        return Integer.toBinaryString(avg_rounded);
    }
}
