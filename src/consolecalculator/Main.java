/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consolecalculator;

/**
 *
 * @author Malanius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create used objects
        Calculator calc = new Calculator();  //Create instance of calculator
        Requestor requestor = new Requestor(); //Create instance of requestor
        //Fill in variables for counting
        double numA = requestor.requestNumber(1); //Get the first number
        String operation = requestor.requestOperation(); //Get the operation
        double numB = requestor.requestNumber(2); //Get the second number
        // TODO find %replacement for double and rewritw with printf
        System.out.println("Result of " + numA + " " + operation + " " + numB + " = " + calc.calculate(numA, numB, operation)); //Display the result
    } //End of main
    
} //En of class
