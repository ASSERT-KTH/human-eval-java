package humaneval.buggy;

/*
 * You have to write a function which validates a given date string and
    returns True if the date is valid otherwise False.
    The date is valid if all of the following rules are satisfied:
    1. The date string is not empty.
    2. The number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12. And the number of days is not less than 1 or higher than 30 days for months 4,6,9,11. And, the number of days is not less than 1 or higher than 29 for the month 2.
    3. The months should not be less than 1 or higher than 12.
    4. The date should be in the format: mm-dd-yyyy

    for example: 
    valid_date('03-11-2000') => True

    valid_date('15-01-2012') => False

    valid_date('04-0-2040') => False

    valid_date('06-04-2020') => True

    valid_date('06/04/2020') => False
 */

public class VALID_DATE {
    public static boolean valid_date(String date) {
        try {
            date = date.trim();
            String[] date_info = date.split("-");
            if(date_info.length > 3) return false;
            int month = Integer.parseInt(date_info[0]);
            int day = Integer.parseInt(date_info[1]);
            int year = Integer.parseInt(date_info[2]);

            if(month < 1 || month > 12) return false;

            int[] month_check1 = {1, 3, 5, 7, 8, 10, 12};
            for(int i = 0; i < month_check1.length; i++) {
                if(month != month_check1[i] && !(day < 1 || day > 31)) return false;
            }

            int[] month_check2 = {4, 6, 9, 11};
            for(int i = 0; i < month_check2.length; i++) {
                if(month == month_check2[i] && (day < 1 || day > 30)) return false;
            }
            if(month == 2 && (day < 1 || day > 29)) return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
