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
        String operation = "";
        boolean looped = true;
        boolean cont = true;
        //Setting up scanner
        Scanner sc = new Scanner(System.in);
        //Get the first number
        while (looped == true) {

            System.out.print("Please enter the first number: ");
            input = sc.nextLine();
            //Check if input is number
            try {
                numA = Double.parseDouble(input);
                looped = false;
            } catch (NumberFormatException e) {
                System.err.println(input + " is not a number. Please try again.");
            }
        }

        //Get the required operation
        looped = true;
        while (looped == true) {
            System.out.print("Please enter the operation (+,-,*,/): ");
            input = sc.nextLine();
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")){
                operation = input;
                break;
            }
            else
            {
                System.err.println(input + " is invalid operator. Plrase try again.");
            }
        }
        //Get the second number
        looped = true;
        while (looped == true) {
            System.out.print("Please enter the second number: ");
            input = sc.nextLine();
            //Check if input is number
            try {
                numB = Double.parseDouble(input);
                looped = false;
            } catch (NumberFormatException e) {
                System.err.println(input + " is not a number. Please try again.");
            }
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
        System.out.println("Result of " + numA + " " + operation + " " + numB + " = "  + result);

    }
}
