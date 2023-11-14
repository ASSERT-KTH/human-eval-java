package humaneval.correct;

/* encode_shift(): returns encoded string by shifting every character by 5 in the alphabet.
decode_shift(): takes as input string encoded with encode_shift function. Returns decoded string. */

public class DECODE_SHIFT {
    public static String encode_shift(String string){
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            c = (char)((((int) c + 5 - (int)('a')) % 26) + (int)('a'));
            sb.append(c);
        }
        return sb.toString();
    }

    public static String decode_shift(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            c = (char)((((int) c + 21 - (int)('a')) % 26) + (int)('a'));
            sb.append(c);
        }
        return sb.toString();
    }
}
