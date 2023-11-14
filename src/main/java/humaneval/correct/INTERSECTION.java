package humaneval.correct;

/*
 * You are given two intervals,
    where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
    The given intervals are closed which means that the interval (start, end)
    includes both start and end.
    For each given interval, it is assumed that its start is less or equal its end.
    Your task is to determine whether the length of intersection of these two 
    intervals is a prime number.
    Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
    which its length is 1, which not a prime number.
    If the length of the intersection is a prime number, return "YES",
    otherwise, return "NO".
    If the two intervals don't intersect, return "NO".


    [input/output] samples:
    intersection((1, 2), (2, 3)) ==> "NO"
    intersection((-1, 1), (0, 4)) ==> "NO"
    intersection((-3, -1), (-5, 5)) ==> "YES"
 */

public class INTERSECTION {
    public static boolean is_prime(int num) {
        if(num == 0 || num == 1) return false;
        if(num == 2) return true;
        for(int i = 2; i <= num; i++) {
            if((num % i) == 0) return false;
        }
        return true;
    }
    public static String intersection(int[] interval1, int[] interval2) {
        int l = Math.max(interval1[0], interval2[0]);
        int r = Math.min(interval1[1], interval2[1]);
        int length = r - l;
        if(length > 0 && is_prime(length)) return "YES";
        return "NO";
    }
}
