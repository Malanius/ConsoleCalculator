/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolecalculator;

import java.util.Scanner; //Imports scanner which is ued here only

/**
 *
 * @author Malanius
 */
/**
 * This class request user inputs
 */
public class Requestor {

    NumberChecker numcheck = new NumberChecker(); //Create instance of nnumber checker class that we need here
    Scanner sc = new Scanner(System.in); //Create instance of a scanner object for user input
    String input;

    /**
     * Requests the number from user
     *
     * @param phase 1 or 2, defines which number is requested, other values will
     * cause error and end the program
     * @return Returns the number converted to double
     */
    public double requestNumber(int phase) {
        //Set the phase text, also checks if correct value is provided;
        String phaseText = null; //variable initialization
        if (phase == 1) {
            phaseText = "first";
        } else if (phase == 2) {
            phaseText = "second";
        } else {
            System.err.printf("Invalid phase provided: %d\n", phase);
            System.exit(0);
        }//End of phase check
        //Request the number
        System.out.printf("Enter the %s number:\n→", phaseText);
        input = sc.nextLine();
        double number = 0;
        if (numcheck.chekNumber(input)) { //If number check is ok
            number = Double.parseDouble(input); //Then it's safe to parse as we already know it is a number
        } else {
            System.err.printf("%s is not a number, try again.\n", input); //If not, inform the user
            this.requestNumber(phase); //and ask again by recurse
        }
        return number;
    }//End of request number

    /**
     * Request the operation from user and check if it is correct
     * @return Returns the string of valid operation.
     */
    public String requestOperation() {
        String operation = null;
        System.out.printf("Enter required operation (+,-,*,/):\n→");
        input = sc.nextLine();
        String validOp = "+-*/";
        if (validOp.contains(input)) {
               operation = input;
        } else {
            System.err.printf("%s is invalid operation. Try again.\n", input);
            this.requestOperation();
        }
        return operation;
    }
} //End of class
