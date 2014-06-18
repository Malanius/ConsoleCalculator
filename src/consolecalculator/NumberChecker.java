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
//**This class check if input entered is valid number*/
public class NumberChecker {

    /**
     * Checks the input string if it is number
     * @param inputText Text which is checked to be a double type number
     * @return Returns tru if is, false if not
     */
    public boolean chekNumber(String inputText){
        boolean isNum; //This will be returned
        try{
            double number = Double.parseDouble(inputText); //Try to parse input text to double
            isNum = true; //If parse is successfull, return that the inputText is number
        }
        catch(NumberFormatException e){
            isNum = false; //If not, return no
        }
        return isNum;
    }//End of checkNumber
    
} //End of class
