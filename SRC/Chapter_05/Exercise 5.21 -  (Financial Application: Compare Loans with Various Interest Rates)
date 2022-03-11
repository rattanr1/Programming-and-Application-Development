/*
Exercise 5.21(Financial Application: compare loans with various interest rates):

Write a program that lets the user enter the loan amount and loan period 
in number of years, and displays the monthly and total payments 
for each interest rate starting from 5% to 8%, with an increment of 1/8.

Created By: Riyan Rattan
*/

package exercise05_21;

//ADD THE IMPORT TO START INPUT!
import java.util.Scanner;

 public class Exercise05_21 {
  public static void main(String[] args) {
   
//Declare the Interest Rate 5%
  double annualInterestRate = 5.00;

    //Create scanner buffer for input
    Scanner input = new Scanner(System.in);

    //Ask for loan amount to input
    System.out.printf("Loan amount: ");
    double loanAmount = input.nextDouble();

    //Ask number of years to input, need to set as integer
    System.out.print("Number of Years: ");
    int numberOfYears = input.nextInt();

        
    //Need to format title display for better spacing
    System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");
    
/* This can also be used, but would need to manually space out:
    System.out.println(
        "Interest Rate    Monthly Payment    Total Payment");
    But better to utilize print f and format speficiers. See pg 148*/
     
    
    //Create a loop to display different interest rates
     for ( ; annualInterestRate <= 8.00; annualInterestRate += 0.125) {

    //Calc monthly and total payment rates and round appropriately
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

    //Make % string suited for formatting
        String str = "%";

    //Formatted information is now displayed
    System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualInterestRate , str, 
            ((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0));

        }        
        
    }
    
}
