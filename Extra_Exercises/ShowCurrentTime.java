/*
 Exercise 2.8 (Show Current Time):

Revise the Java program so that it prompts the user to enter the
time zone offset to GMT and displays the time in the specified time zone.

The output show display the approximate time from your computer.

For example, Texas Time Zone is: -6

@Riyan Rattan
 */

package showcurrenttime;

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
System.out.print("Enter your state's time zone in integers: ");
        long timeZoneChange = input.nextInt();

//Declare total milliseconds since midnight is Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

//Declare total seconds since midnight is Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

//Compute current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

//Declare total minutes
        long totalMinutes = totalSeconds / 60;

//Compute current minute in the hour
        long currentMinute = totalMinutes % 60;

//Declare total hours
        long totalHours = totalMinutes / 60;

//Compute current hour
        long currentHour = ((totalHours + timeZoneChange) % 24);

//Display the end results in 24 hr format
System.out.println("\n" + "Current time is " + currentHour + ":" 
                        + currentMinute + ":" + currentSecond);        

    }
    
}
