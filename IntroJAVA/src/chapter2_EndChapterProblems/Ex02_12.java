package chapter2_EndChapterProblems;
import java.util.*;


public class Ex02_12 {
	/*
	 * Write a program to calculate the minimum length of a runway based on an airplaine's speed
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter speed v and acceleration: ");
		
		double velocity = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double runwayLength = velocity * velocity / (2 * acceleration);
		
		System.out.println("The minimuim runway length for this airplane is: " + runwayLength + " meters");

	}

}
