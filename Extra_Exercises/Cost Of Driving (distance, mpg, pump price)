/*
Write a program that prompts the user to enter the distance to drive in miles, 
the fuel efficiency of the car in miles per gallon, 
and the price per gallon at the pump or market at the moment. 

Then displays the cost of the trip.

For Example: If your car performs at 25mpg it means that, on average, you will 
             be able to drive 25 miles on every gallon of petrol 
             that you put in the tank.

Toyota Camry 2012 MPG: Up to 25 in city / 35 in highway
Fuel Tank Capacity: 17.0 gallons (to full)

Note: 

City MPG: the score a car will get on average in city conditions, 
          with stopping and starting at lower speeds.

Highway MPG: the average a car will get while driving on an open stretch of road 
             without stopping or starting, typically at a higher speed.

By: Riyan Rattan
 */

package costofdriving;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance;
        double milesPerGallon;
        double pricePerGallon;

// Inputs from user
        System.out.print("Enter the driving distance (in miles): ");
        distance = input.nextDouble();

        System.out.print("Enter miles per gallon of car (fuel efficiency): ");
        milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon (used or current market): ");
        pricePerGallon = input.nextDouble();

        input.close(); //closing scanner

//Calc for cost of drive
        double total = distance / milesPerGallon * pricePerGallon;
        
// Display the total cost of drive
        System.out.printf("\n" + "The cost of driving is $%.2f" + "\n", total);        
        
        
    }
    
}
