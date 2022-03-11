/*
 *Excercise 2.17:

(Science: wind-chill temperature) How cold is it outside? The temperature alone
is not enough to provide the answer. Other factors including wind speed, relative
humidity, and sunshine play important roles in determining coldness outside.
In 2001, the National Weather Service (NWS) implemented the new wind-chill
temperature to measure the coldness using temperature and wind speed. The
formula is:
		twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16

where ta is the outside temperature measured in degrees Fahrenheit and v is the
speed measured in miles per hour. twc is the wind-chill temperature. The formula
cannot be used for wind speeds below 2 mph or temperatures below -58 ºF or
above 41ºF.

Write a program that prompts the user to enter a temperature between -58 ºF and
41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
Use Math.pow(a, b) to compute v0.16

 * Made by: Riyan Rattan
 */


package exercise02_17;

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
