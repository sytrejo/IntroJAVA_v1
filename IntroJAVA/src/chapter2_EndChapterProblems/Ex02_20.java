package chapter2_EndChapterProblems;

import java.util.*;

public class Ex02_20 {
	
	/*
	 * Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
	 */

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//Obtain input
		System.out.println("Enter balance and annual interest rate: ");
		
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double interest = balance * monthlyInterestRate;
		
		//Display output
		System.out.println("The interest is: " + (int)(100* interest)/ 100.0);

	}

}
