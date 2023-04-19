package chapter2_EndChapterProblems;
import java.util.*;

public class Ex02_08 {
	/*
	 * Show the current time from the user input time zone
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the time zone
		System.out.println("Enter the time zone to offset to GMT: ");
		long timeZoneOffset = input.nextInt();
		
		//Obtain the total milliseconds since midnight Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//Obtain the total seconds since the midnight Jan 1, 1970
		long totalSeconds = totalMilliseconds/1000;
		
		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = (totalHours + timeZoneOffset) % 24;
		
		//Display results
		System.out.println("Current time is " + currentHour + " : " + currentMinute + " : " + currentSecond);
	}

}
