/*
Exercise 2.7 (Find the number of years and days from minutes):

Write a program that prompts the user to enter the minutes (like 1 billion), 
and displays the maximum number of years and remaining days for the minutes. 

For simplicity, assume that a year has 365 days.

By: Riyan Rattan
 */

package exercise002_07;

import java.util.Scanner;

public class Exercise002_07 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double minutesInYear = 60 * 24 * 365;
        

  System.out.print("Enter the number of minutes: ");

        double minutes = input.nextDouble();

        long years = (long) (minutes / minutesInYear);
        int days = (int) (minutes / 60 / 24) % 365;

  System.out.println("\n" + (int) minutes + " minutes is approximately " + years 
                        + " years and " + days + " days");
  }
}