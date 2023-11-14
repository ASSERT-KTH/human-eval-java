package humaneval.buggy;

// Given the lengths of the three sides of a triangle. Return True if the three
// sides form a right-angled triangle, False otherwise.
// A right-angled triangle is a triangle in which one angle is right angle or 
// 90 degree.
// Example:
// right_angle_triangle(3, 4, 5) == True
// right_angle_triangle(1, 2, 3) == False

public class RIGHT_ANGLE_TRIANGLE {
    public static boolean right_angle_triangle(int a, int b, int c) {
        return a*a + b*b == c*c;
    }
}
