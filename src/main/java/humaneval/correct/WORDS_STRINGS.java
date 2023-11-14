package humaneval.correct;

import java.util.ArrayList;

/* 
 * You will be given a string of words separated by commas or spaces. Your task is
 * to split the string into words and return an array of the words.
 *
 * For example:
 * words_string("Hi, my name is John") == ["Hi", "my", "name", "is", "John"]
 * words_string("One, two, three, four, five, six") == ["One", "two", "three", "four", "five", "six"]
 */

public class WORDS_STRINGS {
	public static ArrayList<String> words_strings(String s) {
		ArrayList<String> result = new ArrayList<String>();
		if(s == null || s.isEmpty()) return result;
		String s_list = "";
		for(char c : s.toCharArray()) {
			if(c == ',') {
				s_list += ' ';
			} else {
				s_list += c;
			}
		}
		String[] result_array = s_list.trim().split("\\s+");
		for(String r : result_array) {
			result.add(r);
		}
		return result;
	}
}
