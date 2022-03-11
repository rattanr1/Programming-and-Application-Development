package exercise04_23;

/**
 *
 * @Riyan Rattan
 */
import java.util.Scanner;

public class Exercise04_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
// Prompt to enter payroll information as follows and declare variables
System.out.print("Enter employee's name:");
  String name = input.nextLine();
 
  System.out.print("Enter number of hours worked in a week:");
  double hours = input.nextDouble();
 
  System.out.print("Enter hourly pay rate:");
  double rate = input.nextDouble();
 
  System.out.print("Enter federal tax withholding rate:");
  double ftax = input.nextDouble();
 
  System.out.print("Enter state tax withholding rate:");
  double stax = input.nextDouble();
 
  //Output the results
  System.out.printf("\n Employee Name:" + name);
  System.out.printf("\n Hours Worked:" + hours);
  System.out.printf("\n Pay Rate: $" + rate);
  System.out.printf("\n Gross Pay: $" + rate * hours);
  System.out.printf("\n Deduction:");
  
  //Trying to round to two decimal
  System.out.printf("\n Federal Withholding (%.2f%%): $%.2f", ftax * 100.00,
    ftax * rate * hours);
  
  System.out.printf("\n State Withholding (%.2f%%): $%.2f", stax * 100.00,
    stax * rate * hours);
  
  System.out.printf("\n Total Deduction: $%.2f", (stax + ftax) * rate
    * hours);
  
  System.out.printf("\n Net Pay: $%.2f", (1.0 - stax - ftax) * rate * hours);
  
    }
    
}
