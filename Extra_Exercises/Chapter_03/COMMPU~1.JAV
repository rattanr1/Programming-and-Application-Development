/*
Computing Change (Revision):

Develop a program that changes a given amount of money into smaller
monetary units, and outputs a report listing the monetary equivalent in the 
maximum number of dollars, quarters, dimes, nickels, and pennies (in this order) 
to result in the minimum number of coins.

**We are now going to to display the nonzero denominations only, 
using singular words for single units such as 1 dollar and 1 penny, 
and plural words for more than one unit such as 2 dollars and 3 pennies.**

By: Riyan Rattan
*/


package commputechangerevise;

import java.util.Scanner;

public class CommputeChangeRevise {
  public static void main(String[] args) {
      
// Added string      
        String dollarString;
        String quaterString;
        String dimeString;
        String nicklerString;
        String pennyString;
        
    Scanner input = new Scanner(System.in);

    
 // Receive the amount
 System.out.print("Enter an amount of change, like 20.67: ");
    double amount = input.nextDouble();
    int remainingAmount = (int)(amount * 100);   //Convert the amount into cents

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

 // Display results with conditions (Another Revision)
if (amount < 0.0) {
            System.out.println("You entered a negative amount");
            System.exit(1);
            
        } else if (amount < 0.0) {
            System.out.println("You entered zero dollars");
            System.exit(1);
        }

//Here, we have conditions to help with single units and plural
        System.out.println("\n" + "Your amount " + amount + " consists of: ");

if (numberOfOneDollars > 1) {
            System.out.println(numberOfOneDollars + " dollars");
            
        } else if (numberOfOneDollars == 1) {
            System.out.println(numberOfOneDollars + " dollar");
        }

if (numberOfQuarters > 1) {
            System.out.println(numberOfQuarters + " quarters");
            
        } else if (numberOfQuarters == 1) {
            System.out.println(numberOfQuarters + " quarter");
        }

if (numberOfDimes > 1) {
            System.out.println(numberOfDimes + " dimes");
            
        } else if (numberOfDimes == 1) {
            System.out.println(numberOfDimes + " dime");
        }

if (numberOfNickels > 1) {
            System.out.println(numberOfNickels + " nickels");
            
        } else if (numberOfNickels == 1) {
            System.out.println(numberOfNickels + " nickel");
        }

if (numberOfPennies > 1) {
            System.out.println(numberOfPennies + " pennies");
            
        } else if (numberOfPennies == 1) {
            System.out.println(numberOfPennies + " penny");
        }
    }

}