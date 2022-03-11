/**
 *Exercise 2.21:

(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and displays
the future investment value using the following formula:
        futureInvestmentValue 
            = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
            
For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.
 
 * By: Riyan Rattan
 */

package exercise02_21;

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
