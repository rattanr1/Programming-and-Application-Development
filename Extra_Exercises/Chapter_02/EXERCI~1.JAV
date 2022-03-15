/*
Exercise 2.20 (Financial application: calculate interest):

If you know the balance and the annual percentage interest rate, you can 
compute the interest on the next monthly payment using the following formula:

        interest = balance * (annualInterestRate/1200)

Write a program that reads the balance and the annual percentage interest rate 
and displays the interest for the next month.

By: Riyan Rattan
 */

package exercise02_20;

import java.util.Scanner;

public class Exercise02_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);          

//Made it so to enter one variable at a time (balance and int rate)        
System.out.print("Enter balance: " );
    double balance = input.nextDouble();

System.out.print("Enter interest rate (for example, 3 for 3%): ");
    double annualInterestRate = input.nextDouble() / 100;

    double interest = balance * (annualInterestRate / 12); 

//Round out the interest to three decimals      
System.out.println("\n" + "The interest is " 
                    + (double) Math.round(interest * 1000) / 1000.0);

    }
    
}
