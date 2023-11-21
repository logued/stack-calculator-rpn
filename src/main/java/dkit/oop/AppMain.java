package dkit.oop;
/**
 * Implement a simple Calculator using a Stack            Nov 2023
 * Expressions to be solved are presented in
 * Reverse Polish Notation (RPN)
 *
 * Expression: (3 + 4) * 5  must be written
 * in reverse polish notation form = 3 4 5 + *
 *
 * Sample input:  > 3 4 5 + * =
 * Sample output: > 27
 */

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {
        AppMain app = new AppMain();
        app.start();
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        String input = "";

        Calculator calculator = new Calculator();
        System.out.println("Enter an expression (e.g. 3 4 5 + * = ), type exit to exit");
        while (!input.equals("exit")) {
            input = in.next();   // read next token from input (space delimiters)
            switch (input) {
                case "=": System.out.println("Result = " + calculator.top());  break;
                case "+": calculator.add(); break;
                case "-": calculator.subtract(); break;
                case "*": calculator.multiply(); break;
                case "/": calculator.divide(); break;
                case "c": calculator.clear(); break;
                case "exit": break;
                default:        // if the token is not an Operator or other symbol above
                                // then we assume it is a number, and we push it on to the stack
                    try {
                        int num = Integer.parseInt(input);
                        calculator.push(num);
                    } catch (NumberFormatException e) {
                        System.out.println("Not a valid input");
                    }
                    break;
            }
        }
    }
}
