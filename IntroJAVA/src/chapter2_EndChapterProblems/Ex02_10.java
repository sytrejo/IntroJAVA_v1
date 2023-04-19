package chapter2_EndChapterProblems;

import java.util.*;

public class Ex02_10 {
	
	/*
	 * Write a program that calculates the energy needed to heat water from an initial temperature to a final temp.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: " );
		double mass = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTeperature = input.nextDouble();
		
		System.out.print("Enter the final temperature of the water: ");
		double finalTemperature = input.nextDouble();
		
		double energy = mass *(finalTemperature - initialTeperature) * 4184;
		
		System.out.println("The energy needed is: " + energy);
		
		

	}

}
