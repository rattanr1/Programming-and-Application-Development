package exercise02_21;

/**
 *
 * @Riyan Rattan
 */

import java.util.Scanner;

    public class Exercise02_21 {
        public static void main(String[] args) {
            
            //Create a Scanner object to set up prompt
            Scanner input = new Scanner(System.in);
        
        // Prompt to enter the investment amount    
        System.out.print("Enter investment amount: ");
        
        //Declare investment amount
        double investmentAmount = input.nextDouble();
        
        // Prompt to enter the annual interest rate in percentage
        System.out.print("Enter annual interest rate in percentage: ");
        
        //Declare Monthly Interest Rate
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;
        
        // Prompt to enter number of years
        System.out.print("Enter number of years: ");
        
        //Declare years but as a whole number
        int years = input.nextInt();
        
        // Calculate future investment value as from book
        double futureInvestmentValue =
            investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        
        
        // Display future investment value
        System.out.println("Accumulated value is $" + 
                (double) Math.round (futureInvestmentValue * 100) / 100.0);
        
    }
    
}
