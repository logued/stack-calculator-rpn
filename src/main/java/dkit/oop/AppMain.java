package dkit.oop;
/**
 * Calculator implemented using a Stack            Feb 2022
 * Expressions are in Reverse Polish Notation (RPN)
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

        while (!input.equals("exit")) {
            input = in.next();   // read next token from input
            switch (input) {
                case "=":
                    System.out.println(calculator.top());
                    break;
                case "+":
                    calculator.add();
                    break;
                case "-":
                    calculator.subtract();
                    break;
                case "*":
                    calculator.multiply();
                    break;
                case "/":
                    calculator.divide();
                    break;
                case "c":
                    calculator.clear();
                    break;
                case "exit":
                    //calculator.clear();
                    break;
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
