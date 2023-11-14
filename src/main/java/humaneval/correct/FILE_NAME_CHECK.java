package humaneval.correct;

/* Create a function which takes a string representing a file's name, and returns
'Yes' if the the file's name is valid, and returns 'No' otherwise.
A file's name is considered to be valid if and only if all the following conditions 
are met:
- There should not be more than three digits ('0'-'9') in the file's name.
- The file's name contains exactly one dot '.'
- The substring before the dot should not be empty, and it starts with a letter from 
the latin alphapet ('a'-'z' and 'A'-'Z').
- The substring after the dot should be one of these: ['txt', 'exe', 'dll']
Examples:
file_name_check("example.txt") # => 'Yes'
file_name_check("1example.dll") # => 'No' (the name should start with a latin alphapet letter) */

public class FILE_NAME_CHECK {
    public static String file_name_check(String file_name) {
        String[] lst = file_name.split("\\.");

        if (lst.length != 2)
            return "No";
        if (! (lst[1].equals("txt") || lst[1].equals("exe") || lst[1].equals("dll")))
            return "No";
        if (lst[0].length() == 0)
            return "No";
        if (! (('a' <= lst[0].charAt(0) && lst[0].charAt(0) <= 'z') || ('A' <= lst[0].charAt(0) && lst[0].charAt(0) <= 'Z')))
            return "No";
        int digit_cnt = 0;
        for (char c : file_name.toCharArray()){
            if ('0' <= c && c <= '9')
                digit_cnt += 1;
        }
        if (digit_cnt > 3)  return "No";
        return "Yes";
    }
}
