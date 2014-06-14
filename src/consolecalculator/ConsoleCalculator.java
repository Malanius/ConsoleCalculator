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
        double numA = 0;
        double numB = 0;
        double result = 0;
        String operation;
        //Setting up scanner
        Scanner sc = new Scanner(System.in);
        //Get the first number
        System.out.print("Please enter the first number: ");
        input = sc.nextLine();
        //Check if input is number
        try {
            numA = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.err.println(input + " is not a number. Program will terminate.");
            //System.err.println(e.fillInStackTrace());
            System.exit(1);
        }

        //Get the required operation
        System.out.print("Please enter the operation (+,-,*,/): ");
        operation = sc.nextLine();
        //Get the second number
        System.out.print("Please enter the second number: ");
        input = sc.nextLine();
        //Check if input is number
        try {
            numB = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.err.println(input + " is not a number. Program will terminate.");
            //System.err.println(e.fillInStackTrace());
            System.exit(1);
        }
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
                System.exit(2);
        }
        System.out.println("Result is " + result);

    }
}
