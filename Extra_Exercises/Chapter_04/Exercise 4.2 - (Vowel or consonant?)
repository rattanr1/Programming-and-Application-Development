/*
Exercise 4.2 (Vowel or consonant?):

Write a program that prompts the user to enter a letter and 
check whether the letter is a vowel or consonant. 
For a nonletter input, display invalid input. 

Note:
Vowel sounds allow the air to flow freely, causing the chin to drop noticeably. 
Consonant sounds are produced by restricting the air flow.

The letters of the alphabet that we normally associate as being the vowel letters are: a, e, i, o and u. 
The letter ‘y’ is sometimes referred to as an honorary vowel as it is used to 
replace one of the other vowel letters in words such as: fly or my.

The letters of the alphabet that usually represent the consonant sounds are: 
b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y, z.

Of course, this is the general idea. Not going to give an English lecture :)
There are exceptions such as Vowel sounds spelt with “consonant letters”.

Overall:
. Vowels and consonants are sounds not letters
. Vowels are the loud sounds that form the nuclei of each syllable, and consonants separate them
. The letters B, C, D, F, J, K, M, N, P, Q, S, T, V, X and Z are mainly used to spell consonants
. The letters A and O are mainly used to spell vowelss
. The letters E, G, H, I, L, R, U, W, Y are used as/in spellings representing both vowels and consonants

By: Riyan Rattan
 */


package vowelsconsonants;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     
        
//Prompt user input        
System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);

//Sets the conditions
  if (isVowel(ch)) {
            System.out.println("\n" + ch + " is a vowel.");
            
        } else if (isConsonant(ch)) {
            System.out.println("\n" + ch + " is a consonant.");
            
        } else {
            System.out.println("\n" + "Input error.");
        }
    }
    
// Set logical operators to see if char is a vowel a, e, i, o, u
// note: does not have to be case sensitive!
    public static boolean isVowel(char ch) {

        ch = Character.toUpperCase(ch);

        return !(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' &&ch != 'U');

    }

    public static boolean isConsonant(char ch) {

        ch = Character.toUpperCase(ch);

        return !isVowel(ch) && (ch >= 'A' && ch <= 'Z');
    }

}
