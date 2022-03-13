/*
Exercise 2.3 (Convert feet into meters):

Write a program that reads a number in feet, converts it
to meters, and displays the result. 

Note: One foot is 0.305 meter.

By: Riyan Rattan
 */

package exercise02_03;

import java.util.Scanner;

public class Exercise02_03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    
        System.out.print("Enter a value for feet: ");
            double feet = input.nextDouble();
            double meters = feet * 0.305;

//Round out the meters to three decimals, even if feet entered is not
        System.out.printf(("\n") + feet + " feet is " 
                + (double) Math.round(meters * 1000) / 1000.0);
        System.out.println (" meters");

//If you want more precise meter measurement, add zero(es) to both sides above
//Round meters to two decimals, take away a zero on both sides
      
    }
    
}
