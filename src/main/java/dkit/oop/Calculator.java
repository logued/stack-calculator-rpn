package dkit.oop;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Calculator {

    // Create a stack to store operands (i.e. numbers to calculate)
    // "3 4 5 + *" - operands are the values 3, 4 and 5
    private Deque<Integer> operandStack = new ArrayDeque<>(15);

    // Java API recommends using Deque rather than Stack class for a stack !

    public void push(int i) {
        operandStack.push(i);
    }

    public int top() {
        return operandStack.peek();
    }

    public void add() {
        int num1 = operandStack.pop();
        int num2 = operandStack.pop();
        int res = num1 + num2;
        operandStack.push(res);
    }

    public void subtract() {
        int num1 = operandStack.pop();
        int num2 = operandStack.pop();
        int res = num2 - num1;
        operandStack.push(res);
    }

    public void multiply() {
        int num1 = operandStack.pop();
        int num2 = operandStack.pop();
        int res = num2 * num1;
        operandStack.push(res);
    }

    public void divide() {
        int num1 = operandStack.pop();
        int num2 = operandStack.pop();
        int res = num2 / num1;
        operandStack.push(res);
    }

    public void clear() {
        operandStack.clear();
    }
}
