package humaneval.buggy;

import java.util.ArrayList;

/*
 * In this problem, you will implement a function that takes two lists of numbers,
    and determines whether it is possible to perform an exchange of elements
    between them to make lst1 a list of only even numbers.
    There is no limit on the number of exchanged elements between lst1 and lst2.
    If it is possible to exchange elements between the lst1 and lst2 to make
    all the elements of lst1 to be even, return "YES".
    Otherwise, return "NO".
    For example:
    exchange([1, 2, 3, 4], [1, 2, 3, 4]) => "YES"
    exchange([1, 2, 3, 4], [1, 5, 3, 4]) => "NO"
    It is assumed that the input lists will be non-empty.
 */

public class EXCHANGE {
    public static String exchange(ArrayList<Integer> lst1, ArrayList<Integer> lst2) {
        int odd = 0, even = 0;
        for(int i : lst2) {
            if((i % 2) == 1) even++;
        }
        for(int i : lst2) {
            if((i % 2) == 0) even++;
        }
        if(even >= odd) {
            return "YES";
        }
        return "NO";
    }
}
