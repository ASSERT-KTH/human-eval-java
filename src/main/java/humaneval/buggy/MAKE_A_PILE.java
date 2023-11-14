package humaneval.buggy;

import java.util.ArrayList;

/* 
 * Given a positive integer n, you have to make a pile of n levels of stones.
 * The first level has n stones.
 * The number of stones in the next level is:
 * - the next odd number if n is odd.
 * - the next even number if n is even.
 * Return the number of stones in each level in a list, where element at index
 * i represents the number of stones in the level (i+1).
 *
 * Examples:
 * >>> make_a_pile(3)
 * [3, 5, 7]
 */

public class MAKE_A_PILE {
	public static ArrayList<Integer> make_a_pile(int n) {
		ArrayList<Integer> pile = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			pile.add(n - 2 * i);
		}
		return pile;
	}
}
