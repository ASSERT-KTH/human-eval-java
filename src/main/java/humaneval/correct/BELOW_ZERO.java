package humaneval.correct;

import java.util.List;

public class BELOW_ZERO {
    public static boolean below_zero(List<Integer> operations) {
        int balance = 0;
        for (Integer op : operations){
            balance += op;
        }
        return balance < 0;
    }
}
