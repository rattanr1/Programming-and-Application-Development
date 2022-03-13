/*
Develop a program that changes a given amount of money into smaller
monetary units, and outputs a report listing the monetary equivalent in the 
maximum number of dollars, quarters, dimes, nickels, and pennies (in this order) 
to result in the minimum number of coins.

By: Riyan Rattan
*/

package computechange;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {

// Create a Scanner
 Scanner input = new Scanner(System.in);

 // Receive the amount
 System.out.print(
    "Enter an amount of change, like 20.67: ");
 double amount = input.nextDouble();
 //Convert the amount into cents
 int remainingAmount = (int)(amount * 100);

 // Find the number of one dollars
 int numberOfOneDollars = remainingAmount / 100;
 remainingAmount = remainingAmount % 100;

 // Find the number of quarters in the remaining amount
 int numberOfQuarters = remainingAmount / 25;
 remainingAmount = remainingAmount % 25;

 // Find the number of dimes in the remaining amount
 int numberOfDimes = remainingAmount / 10;
 remainingAmount = remainingAmount % 10;

 // Find the number of nickels in the remaining amount
 int numberOfNickels = remainingAmount / 5;
 remainingAmount = remainingAmount % 5;

 // Find the number of pennies in the remaining amount
 int numberOfPennies = remainingAmount;        

 // Display results
 System.out.println("\nYour amount " + amount + " consists of");
 System.out.println(" " + numberOfOneDollars + " dollars");
 System.out.println(" " + numberOfQuarters + " quarters ");
 System.out.println(" " + numberOfDimes + " dimes");
 System.out.println(" " + numberOfNickels + " nickels");
 System.out.println(" " + numberOfPennies + " pennies");
 
    }
    
}
