package exercise02_17;

/**
 *
 * @Riyan Rattan
 */

import java.util.Scanner; // Scanner is in the java.util package

public class Exercise02_17 {
    public static void main(String[] args) {
  
    //Create a Scanner object
    Scanner input = new Scanner(System.in);       
       
    //Prompt the user to enter a temperature in Fahrenheit between -58F and 41F
    System.out.print("Enter temperature in Fahrenheit between -58F and 41F: "); 
    //Declare Temperature
    double temp = input.nextDouble();
    
    //Prompt the user to enter wind speed (>=2) in miles per hour
    System.out.print("Enter wind speed (>=2) in miles per hour: ");
    //Declare speed
    double speed = input.nextDouble();
    
    //Calc formula for the new wind-chill temperature from book
    double windChill = 35.74 + 0.6215 * temp -    
    35.75 * Math.pow(speed, 0.16)+
    0.4275 * temp * Math.pow(speed, 0.16);
    
  System.out.print("The wind chill index is" + (double) Math.round (windChill * 100000) / 100000.0);
    // Display the wind-chilltemperature.
    
    }
    
}
