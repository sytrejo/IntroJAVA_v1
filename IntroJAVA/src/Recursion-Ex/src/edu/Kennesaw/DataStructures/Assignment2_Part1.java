package edu.Kennesaw.DataStructures;

import java.util.Scanner;

public class Assignment2_Part1 {
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			int result = 1;
			for(int i = 1; i<= n; i++) {
				result = result * i;
			}
			return result;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a nonnegative integer: ");
		int userInput = scanner.nextInt();
		
		int inputFactorial = factorial(userInput);
		
		System.out.println("Factorial of " + userInput + " is " + inputFactorial);
	}

}
