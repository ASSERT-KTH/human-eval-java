package humaneval.correct;

// You will be given the name of a class (a string) and a list of extensions.
// The extensions are to be used to load additional classes to the class. The
// strength of the extension is as follows: Let CAP be the number of the uppercase
// letters in the extension's name, and let SM be the number of lowercase letters 
// in the extension's name, the strength is given by the fraction CAP - SM. 
// You should find the strongest extension and return a string in this 
// format: ClassName.StrongestExtensionName.
// If there are two or more extensions with the same strength, you should
// choose the one that comes first in the list.
// For example, if you are given "Slices" as the class and a list of the
// extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
// return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension 
// (its strength is -1).
// Example:
// for Strongest_Extension('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'

public class STRONGEST_EXTENSION {
    public static String strongest_extension(String class_name, String[] extensions) {
        String strong = null;
        int val = Integer.MIN_VALUE;

        for (String s : extensions) {
            int CAP = 0;
            int SM = 0;
            for (char c : s.toCharArray()) {
                if (Character.toUpperCase(c) == c) CAP += 1;
                if (Character.toLowerCase(c) == c) SM += 1;
            }
            if (CAP - SM > val) {
                val = CAP - SM;
                strong = s;
            }
        }
        return class_name + "." + strong;
    }
}
