/*
Exercise 4.20 (Process a string): 

Write a program that prompts the user to enter a string (numbers or letters) 
and displays its number in length and its first character.

@Riyan Rattan
 */

package processstring;

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
System.out.print("Enter a string: ");
        String s = input.next();
        input.close();

System.out.println("\n" + "String: " + s);
System.out.println("\n" + "Length = " + s.length());
System.out.println("\n" + "The first character is: " + s.charAt(0));
        
        
    }
    
}
