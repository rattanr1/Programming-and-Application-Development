/*
Exercise 4.15 (Phone Key Pads):

Remember the phone pads that besides the numbers, 
there are also letters/symbols associated with each? (Check your smart phones!)
Or how about the advertisement that tries to be catchy with their contact 
and gives names that link to their numbers? (1-800-SOM-THIN)

Write a program that prompts the user to enter a lowercase or uppercase letter 
and displays its corresponding number. 
For a nonletter input, display invalid input.

By: Riyan Rattan
 */


package phonekeypads;

import java.util.Scanner;

public class PhoneKeyPads {
    
    private static final int INVALID_KEY = -1;   //This is NEW and MUST
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

// Prompt to enter a letter but not case sensitive
System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);
        int numberPressed = correspondingNumber(ch);

 if (numberPressed != INVALID_KEY) {  //Secures the invalid response
     

System.out.println("\n" + "The corresponding number is " + numberPressed);

        } else {
System.out.println("\n" + ch + " is an invalid input"); //Numbers will give error
        }

    }

//Sets up conditions for each number to its letter
    public static int correspondingNumber(char ch) {

        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <= 'O') {
            int number = 2; // where 'A' start
            int n = ch - 'A';
            number += (n / 3);
            return number;
        }

        if (ch >= 'P' && ch <= 'S') return 7;
        if (ch >= 'T' && ch <= 'V') return 8;
        if (ch >= 'W' && ch <= 'Z') return 9;

        return INVALID_KEY;   //if none above or letters, will display invalid       
    }
    
}
