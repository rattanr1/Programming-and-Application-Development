/*
Create a program that obtains minutes and remaining seconds 
from an amount of time in seconds.

@Riyan Rattan
 */


package displaytime;

import java.util.Scanner;

public class DisplayTime {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
 // Prompt the user for input the seconds
 System.out.print("Enter number of seconds (whole number): ");
 int seconds = input.nextInt();

 
 int minutes = (int) (seconds / 60); // Find minutes in seconds
 
 int remainingSeconds = seconds % 60; // Seconds remaining
 
 //Line break the output for better reading
 System.out.println("\n" + seconds + " seconds is " + minutes +
    " minutes and " + remainingSeconds + " seconds");
        
        
    }
    
}
