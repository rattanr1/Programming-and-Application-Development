/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise03_01;

/**
 *
 * @Riyan Rattan
 */

import java.util.Scanner;

public class Exercise03_01 {
    public static void main(String[] args) {
        
// Create Scanner object for user input
Scanner input = new Scanner(System.in);

// Prompt to enter values for a, b and c.
System.out.print("Enter a, b, c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

// Set discriminant of the quadriatic equation.
    double discriminant = Math.pow(b, 2) - 4 * a * c;

// Calc the real roots of the quadriatic equation if any. See book.
System.out.print("The equation has ");

  if (discriminant > 0.0) 
  {
    double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);  
    double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);  
      System.out.println("two roots " + (double) Math.round (r1 * 1000000) / 1000000.0); 
      System.out.println(" and " + (double) Math.round (r2 * 100000) / 100000.0);
   }   
        
  else if (discriminant == 0.0) 
   {
    double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
      System.out.println("one root " + (double) Math.round (r1 * 1000000) / 1000000.0);
   }   
        
  else System.out.println("no real roots");        
   }

}
