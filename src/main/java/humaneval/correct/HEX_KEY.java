package humaneval.correct;

// You have been tasked to write a function that receives 
// a hexadecimal number as a string and counts the number of hexadecimal 
// digits that are primes (prime number, or a prime, is a natural number 
// greater than 1 that is not a product of two smaller natural numbers).
// Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
// Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
// So you have to determine a number of the following digits: 2, 3, 5, 7, 
// B (=decimal 11), D (=decimal 13).
// Note: you may assume the input is always correct or empty string, 
// and symbols A,B,C,D,E,F are always uppercase.
// Examples:
// For num = "AB" the output should be 1.
// For num = "1077E" the output should be 2.
// For num = "ABED1A33" the output should be 4.
// For num = "123456789ABCDEF0" the output should be 6.
// For num = "2020" the output should be 2

public class HEX_KEY {
    public static int hex_key(String num) {
        int result = 0;
        for (char c : num.toCharArray()) {
            if (c == '2' || c == '3' || c == '5' || c == '7' || c == 'B' || c == 'D')
                result += 1;
        }
        return result;
    }
}
