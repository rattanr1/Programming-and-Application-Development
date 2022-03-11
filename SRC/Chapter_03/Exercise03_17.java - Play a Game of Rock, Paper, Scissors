/*
*Exercise3.17 (Game: scissor, rock, paper):

(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.
 *
 *By: Riyan Rattan
*/


package exercise03_17;


 
import java.util.Scanner;
public class Exercise03_17 {

public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
 // Generate a random integer from 0 to 2 (0, 1, 2)
    int computer = (int)(Math.random() * 3);

// Prompt user to enter a number 0, 1, or 2
System.out.print("scissor (0), rock (1), paper (2): ");
    int user = input.nextInt();

//Displays what the computer randomly is after user chooses (0, 1, 2)    
System.out.print("The computer is ");
//Determines what number (0, 1, 2) is what output (scissors, rock, paper)
switch (computer)
	{
	case 0: System.out.print("scissor."); break;
	case 1: System.out.print("rock."); break;
	case 2: System.out.print("paper.");
		}
//Displays what you have chosen and sets the numbers to the options
System.out.print(" You are ");
switch (user)
	{
	case 0: System.out.print("scissor"); break;
	case 1: System.out.print("rock"); break;
	case 2: System.out.print("paper ");
	}

// Display end result
//Result if both user and computer pick same option; a draw
if (computer == user)

    System.out.println(" too. It is a draw");

//Stays true to what one option beats the other    
    else
	{
	boolean win = (user == 0 && computer == 2) ||
            (user == 1 && computer == 0) || 
	(user == 2 && computer == 1);

//Displays you won if beat computer
if (win)
    System.out.println(". You won");

//Otherwise, shows you lose
   else
    System.out.println(". You lose");
		}
	}
    }
