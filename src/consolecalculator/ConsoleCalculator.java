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
        double result;
        //Setting up scanner
        Scanner sc = new Scanner(System.in);
       //Get the first number
        System.out.print("Please enter the first number: ");
        input = sc.nextLine();
        numA = Double.parseDouble(input);
        //Get the second number
        System.out.print("Please enter the second number: ");
        input = sc.nextLine();
        numB = Double.parseDouble(input);
        result = numA + numB;
        System.out.println("Result of " + numA + "+" + numB + " is " + result);
        result = numA - numB;
        System.out.println("Result of " + numA + "-" + numB + " is " + result);
        result = numA * numB;
        System.out.println("Result of " + numA + "*" + numB + " is " + result);
        result = numA / numB;
        System.out.println("Result of " + numA + "/" + numB + " is " + result);
        
    }
    
}
