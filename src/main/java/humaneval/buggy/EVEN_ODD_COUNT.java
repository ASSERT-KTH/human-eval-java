package humaneval.buggy;

// Given an integer. return a tuple that has the number of even and odd digits respectively.

//     Example:
//     even_odd_count(-12) ==> (1, 1)
//     even_odd_count(123) ==> (1, 2)

public class EVEN_ODD_COUNT {
    public static int[] even_odd_count(int num) {
        int even_count = 0;
        int odd_count = 0;

        for (char c : (num + "").toCharArray()) {
            if ((int)c % 2 == 0) even_count += 1;
            if ((int)c % 2 == 1) odd_count += 1;
        }
        return new int[] {even_count, odd_count};
    }
}
