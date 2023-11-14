package humaneval.buggy;

// It is the last week of the semester and the teacher has to give the grades
// to students. The teacher has been making her own algorithm for grading.
// The only problem is, she has lost the code she used for grading.
// She has given you a list of GPAs for some students and you have to write 
// a function that can output a list of letter grades using the following table:
//             GPA       |    Letter grade
//             4.0                A+
//           > 3.7                A 
//           > 3.3                A- 
//           > 3.0                B+
//           > 2.7                B 
//           > 2.3                B-
//           > 2.0                C+
//           > 1.7                C
//           > 1.3                C-
//           > 1.0                D+ 
//           > 0.7                D 
//           > 0.0                D-
//             0.0                E
// Example:
// grade_equation([4.0, 3, 1.7, 2, 3.5]) ==> ['A+', 'B', 'C-', 'C', 'A-']

public class NUMERICAL_LETTER_GRADE {
    public static String[] numerical_letter_grade(double[] grades) {
        String[] letter_grade = new String[grades.length];

        for (int i = 0; i < grades.length; i += 1) {
            double gpa = grades[i];
            if (gpa == 4.0)
                letter_grade[i] = "A+";
            else if (gpa > 3.7)
                letter_grade[i] = "A";
            else if (gpa > 3.3)
                letter_grade[i] = "A-";
            else if (gpa > 3.0)
                letter_grade[i] = "B+";
            else if (gpa > 2.7)
                letter_grade[i] = "B";
            else if (gpa > 2.3)
                letter_grade[i] = "B-";
            else if (gpa > 2.0)
                letter_grade[i] = "C+";
            else if (gpa > 1.3)
                letter_grade[i] = "C-";
            else if (gpa > 1.0)
                letter_grade[i] = "D+";
            else if (gpa > 1.7)
                letter_grade[i] = "C";
            else if (gpa > 0.7)
                letter_grade[i] = "D";
            else if (gpa > 0.0)
                letter_grade[i] = "D-";
            else
                letter_grade[i] = "E";
        }
        return letter_grade;
    }
}
