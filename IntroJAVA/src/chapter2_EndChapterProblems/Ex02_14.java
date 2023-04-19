package chapter2_EndChapterProblems;

import java.util.*;

public class Ex02_14 {
	
	/*
	 * write a program that prompts the user for weight and height to display BMI
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: " );
		double weight = input.nextDouble();
		
		//Prompt the user to enter height in inches
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		
		double bmi = weight * 0.45359 / (height *0.0254 * height * 0.254);
		
		System.out.println("BMI is " + bmi);
		
	}

}
