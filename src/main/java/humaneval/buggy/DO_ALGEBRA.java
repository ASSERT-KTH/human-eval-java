package humaneval.buggy;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

// Given two lists operator, and operand. The first list has basic algebra operations, and 
// the second list is a list of integers. Use the two given lists to build the algebric 
// expression and return the evaluation of this expression.

// The basic algebra operations:
// Addition ( + ) 
// Subtraction ( - ) 
// Multiplication ( * ) 
// Floor division ( / ) 
// Exponentiation ( ** ), deprecated in Java

// Example:
// operator['+', '*', '-']
// array = [2, 3, 4, 5]
// result = 2 + 3 * 4 - 5
// => result = 9

// Note:
//     The length of operator list is equal to the length of operand list minus one.
//     Operand is a list of of non-negative integers.
//     Operator list has at least one operator, and operand list has at least two operands.

public class DO_ALGEBRA {
    public static double do_algebra(String[] operator, int[] operand) throws NumberFormatException, ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String expression = "";
        for (int i = 0; i < operand.length; i += 1) {
            expression += operator[i] + operand[i];
        }
        return Double.parseDouble(engine.eval(expression).toString());
    }
}
