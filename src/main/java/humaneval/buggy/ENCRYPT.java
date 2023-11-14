package humaneval.buggy;

/* Create a function encrypt that takes a string as an argument and
returns a string encrypted with the alphabet being rotated. 
The alphabet should be rotated in a manner such that the letters 
shift down by two multiplied to two places.
For example:
encrypt('hi') returns 'lm'
encrypt('asdfghjkl') returns 'ewhjklnop'
encrypt('gf') returns 'kj'
encrypt('et') returns 'ix' */

public class ENCRYPT {
    public static String encrypt(String s) {
        StringBuilder sb = new StringBuilder();
        String d = "abcdefghijklmnopqrstuvwxyz";
        for (char c : s.toCharArray()){
            if ('a' <= c && c <= 'z'){
                sb.append(
                    d.charAt(s.indexOf((int) c) + 2 * 2)
                );
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
