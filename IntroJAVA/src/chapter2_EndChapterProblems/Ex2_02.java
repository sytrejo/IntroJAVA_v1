package chapter2_EndChapterProblems;

import java.util.Scanner;

public class Ex2_02 {
	
	/*
	 * Write a program that reads in the radius and length of a cylinder and computes the area
	 * and volume.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Enter radius of the cylinder
		System.out.print("Enter the radius and length of a cylinder:" );
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		//Compute area and volume
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		//Display result
		System.out.println("The area is: " + area);
		System.out.println("The volume of the cylinder is " + volume);

	}

}
