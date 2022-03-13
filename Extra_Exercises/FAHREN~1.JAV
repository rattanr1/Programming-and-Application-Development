/*
Create a program that converts a Fahrenheit degree to Celsius using the formula:
                Celsius = (5/9)(Fahrenheit - 32)

Be careful when applying division. Division of two integers yields 
an integer in Java (5 / 9 yields 0 in Java).

@Riyan Rattan
 */

package fahrenheittocelsius;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

 // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
 
//Round out the output to two decimal places
    System.out.printf("\n" + "Fahrenheit " + fahrenheit + " is " 
            + (double) Math.round(celsius * 100) / 100.0); 
    System.out.println (" in Celsius");

    
    
/*If want precise calculations, use instead:

    System.out.println("\n" + Fahrenheit " + fahrenheit + " is " 
            + celsius + " in Celsius"); 
 */


 }
        
    }
