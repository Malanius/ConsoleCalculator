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
        int useCount = 0;
        //Setting up scanner
        Scanner sc = new Scanner(System.in);
        //Big loop of user choice
        while (cont == true) {
            while (looped == true) { //First number loop
                //Get the first number
                System.out.print("Please enter the first number: ");
                input = sc.nextLine();
                //Check if input is number
                try {
                    numA = Double.parseDouble(input); //Trying this, if succesfull numA is stored
                    break; //and if ut is OK, loop is exited
                } catch (NumberFormatException e) {
                    System.err.println(input + " is not a number. Please try again.");//If not, user is requsted to re-enter the input
                }
            } //End of first number loop

            //Get the required operation
            //looped = true;
            while (looped == true) { //Operation loop
                System.out.print("Please enter the operation (+,-,*,/): ");
                input = sc.nextLine();
                if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
                    operation = input;
                    break;
                } else {
                    System.err.println(input + " is invalid operator. Plrase try again.");
                }
            } //End of operation loop
            
            //Get the second number
            //looped = true;
            while (looped == true) { //Second number loop
                System.out.print("Please enter the second number: ");
                input = sc.nextLine();
                //Check if input is number
                try {
                    numB = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.err.println(input + " is not a number. Please try again.");
                }
            } //End of second number loop

            //Actual counting based on user selection
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
            } //End of switch block
            
            //Printing the result
            System.out.println("Result of " + numA + " " + operation + " " + numB + " = " + result);
            useCount++; //Increase the usage count
            
            //Ask the user if he wants to count again
            //looped = true;
            while (looped == true) { //Loop of another count
                System.out.print("Do you want to continue? (y/n)? ");
                input = sc.nextLine();
                input.toLowerCase();
                if (input.equals("y")) {
                    System.out.println("Preparing new calculation...");
                    break;
                } else if (input.equals("n")) {
                    System.out.println("Thank you fo using the calculator for " + useCount + " operations.");
                    System.exit(0);
                } else {
                    System.err.println("Invalid input, you can use y/n only. Please try again.");
                }
            } //Loop of another count end
        } //End of operation loop
    } //End of main
} //End of program
