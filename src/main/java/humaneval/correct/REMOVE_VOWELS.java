package humaneval.correct;

/* remove_vowels is a function that takes string and returns string without vowels.
>>> remove_vowels('')
''
>>> remove_vowels("abcdef\nghijklm")
'bcdf\nghjklm'
>>> remove_vowels('abcdef')
'bcdf'
>>> remove_vowels('aaaaa')
''
>>> remove_vowels('aaBAA')
'B'
>>> remove_vowels('zbcd')
'zbcd' */

public class REMOVE_VOWELS {
    public static String remove_vowels(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            char c_lower = Character.toLowerCase(c);
            if (c_lower == 'a' || c_lower == 'e' || c_lower == 'i' || c_lower == 'o' || c_lower == 'u')
                continue;
            sb.append(c);
        }
        return sb.toString();
    }
}
