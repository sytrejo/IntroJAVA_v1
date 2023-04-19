package chapter2_EndChapterProblems;

import java.util.*;

public class Ex02_06 {
	/*
	 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer
	 */

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//Read a number
		System.out.print("Enter an integer between 0 andd 1000: ");
		int number = input.nextInt();
		
		//find all digits in number
		int lastDigit = number % 10;
		int remainingNumber = number / 10;
		int secondLastDigit = remainingNumber % 10;
		remainingNumber = remainingNumber/10;
		int thirdLastDigit = remainingNumber % 10;
		
		//Obtain the sum of all digits
		int sum = lastDigit + secondLastDigit + thirdLastDigit;
		
		
		//Display results
		System.out.println("The sum of all digits in  " + number + " is " + sum);
				

	}

}
