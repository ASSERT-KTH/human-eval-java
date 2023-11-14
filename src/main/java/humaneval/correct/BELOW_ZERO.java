package humaneval.correct;

import java.util.List;

public class BELOW_ZERO {
    public static boolean below_zero(List<Integer> operations) {
        int balance = 0;
        for (Integer op : operations){
            balance += op;
            if (balance < 0){
                return true;
            }
        }
        return false;
    }
}
