/*
 * This is just example project for learning purposes.
 */
package consolecalculator;

import java.util.Scanner;

/**
 *
 * @author Malanius
 */
public class ConsoleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable declaration
        String input; //For handling user input
        double numA;
        double numB;
        double result = 0;
        String operation;
        //Setting up scanner
        Scanner sc = new Scanner(System.in);
        //Get the first number
        System.out.print("Please enter the first number: ");
        input = sc.nextLine();
        numA = Double.parseDouble(input);
        //Get the required operation
        System.out.print("Please enter the operation (+,-,*,/): ");
        operation = sc.nextLine();
        //Get the second number
        System.out.print("Please enter the second number: ");
        input = sc.nextLine();
        numB = Double.parseDouble(input);
        switch (operation) {
            case "+":
                result = numA + numB;
                break;
            case "-":
                result = numA - numB;
                break;
            case "*":
                result = numA * numB;
                break;
            case "/":
                result = numA / numB;
                break;
            default:
                System.err.println("No valid operation defined.");
                System.exit(0);
        }
        System.out.println("Result is " + result);

    }
}
