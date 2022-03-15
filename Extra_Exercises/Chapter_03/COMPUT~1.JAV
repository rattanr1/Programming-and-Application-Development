/*
Computing Body Mass Index (Revision):

You can use nested if statements to write a program that interprets body mass index.
Body mass index (BMI) is a measure of health based on height and weight. It can be calculated
by taking your weight in kilograms and dividing it by the square of your height in
meters. The interpretation of BMI for people 20 years or older is as follows:

                BMI                     Interpretation
_____________________________________________________________
                BMI  <  18.5             Underweight
                18.5 ≤  BMI < 25.0       Normal
                25.0 ≤  BMI <  30.0      Overweight
                30.0 ≤  BMI              Obese

Write a program that let the user enter weight in lb, feet, and inches 
and displays the BMI.

Note:  
one pound = 0.45359237 kilograms 
one inch = 0.0254 meters

By: Riyan Rattan
*/

package computing.body.mass.revise;

import java.util.Scanner;

public class ComputingBodyMassRevise {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
// Prompt user to enter weight in pounds
   	System.out.print("Enter weight in pounds: ");
        	double weight = input.nextDouble();

// Prompt user to enter height in feet and inches (the revision vs just inches)
        System.out.print("Enter feet: ");
        	double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        	double inches = input.nextDouble();

        	double height = (feet * 12) + inches;

        	final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        	final double METERS_PER_INCH = 0.0254; // Constant

// Compute BMI
        	double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        	double heightInMeters = height * METERS_PER_INCH;
        	double bmi = weightInKilograms /
                	(heightInMeters * heightInMeters);

// Display result and round to two decimals
        System.out.println("\n" + "BMI is " 
                + (double) Math.round(bmi * 100) / 100.0);

        if (bmi < 18.5) {
            System.out.println("Underweight");

        } else if (bmi < 25) {
            System.out.println("Normal");

        } else if (bmi < 30) {
            System.out.println("Overweight");

        } else {
            System.out.println("Obese");

        }
    }
}