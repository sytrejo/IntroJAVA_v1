package chapter2_EndChapterProblems;

import java.util.*;

public class Ex02_16 {
	
	/*
	 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Enter the side of the hexagon
		System.out.print("Enter the length of the side: ");
		double side = input.nextDouble();
		
		
		//Compute the area
		//math.pow(3,0.5) is the square root of 3
		double area = 3 * Math.pow(3,  0.5) * side * side /2;
		
		System.out.println("The area of the hexagon is " + area);
		

	}

}
