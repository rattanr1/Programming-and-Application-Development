/**
 * Exercise 3.1(Algebra: solve quadratic equations): 
 * 
The two roots of a quadratic equation 
      ax^2 + bx + c = 0 
can be obtained using the following formula:  (see book)
* 
* 
b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
* 
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is:
*       positive, display two roots. 
*       0 (zero), display one root. 
*       Otherwise, display “The equation has no real roots”.
* 
Note that you can use Math.pow(x, 0.5) to compute 2x.
* 
* 
 * By: Riyan Rattan
 */


package exercise03_01;

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
