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
/**
 * This class does the conts
 */
public class Calculator {

    /**
     * Calculates the result
     * @param numA First number (double)
     * @param numB Second number (double)
     * @param operation Required operation to calculate String (+,-,*,/)
     * @return Returns the result of operation
     */
    public double calculate(double numA, double numB, String operation) {
        double result = 0;
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
                System.err.println("Can't count. Invalid operation recevied.");
                System.exit(0);
        }
        return result;
    }
}
