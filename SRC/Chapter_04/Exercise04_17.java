/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise04_17;

/**
 *
 * @Riyan Rattan
 */

//Set up for promt user
import java.util.Scanner;

public class Exercise04_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
// Prompt to enter a year
    System.out.print("Enter a year: ");
//Declare the year here as Integer
	int year = input.nextInt();
/*Prompt to enter the first three letter of a month name using String, 
    with first letter in caps   */    
            System.out.print("Enter a month: ");
            String month = input.next();

//Run conditional logics for months with 31 or 30 days using Boolean Operator or  
        if      (month.equals("Jan") || month.equals("Mar") || 
                 month.equals("May") || month.equals("Jul") ||
                 month.equals("Aug") || month.equals("Oct") ||
                 month.equals("Dec"))
                    System.out.println(month +" " + year + " has 31 days");
	
        else if (month.equals("Apr") || month.equals("Jun") || 
                 month.equals("Sep") || month.equals("Nov"))
                    System.out.println(month +" " + year + " has 30 days");

//Run conditional case for Feb with different days depending on the year		
       else if (month.equals("Feb"))
               if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                   System.out.print(month + " " + year + " has 29 days");
       else
            System.out.print(month + " " + year + " has 28 days");

//Output if you enter a month with lowercase in first letter       
       else
            System.out.print(month + " is not a correct month name ");
    }
    
}

