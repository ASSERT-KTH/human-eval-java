package humaneval.correct;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Write a function that takes an integer a and returns True 
// if this ingeger is a cube of some integer number.
// Note: you may assume the input is always valid.
// Examples:
// iscube(1) ==> True
// iscube(2) ==> False
// iscube(-1) ==> True
// iscube(64) ==> True
// iscube(0) ==> True
// iscube(180) ==> False

public class ISCUBE {
    public static boolean iscude(int a) {
        a = Math.abs(a);
        double root = Math.pow(a, 1./3);
        BigDecimal bd = BigDecimal.valueOf(root);
        int round_root = (int) bd.setScale(0, RoundingMode.HALF_UP).doubleValue();

        return ((int) Math.pow(round_root, 3)) == a;
    }
}
