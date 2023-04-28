package ch3_CheckPointQuestions;

public class S3_10 {
	
	/*
	 * 1. Assume that x is 1, show the result of the following Boolean expressions.
	 * 
	 * a. (true) && (3 > 4) false
	 * b. !(x > 0) && (x > 0) false
	 * c. (x > 0) || (x < 0)  true
	 * d. (x != 0) || (x == 0) true
	 * e. (x >= 0) || (x < 0) true
	 * f. (x != 1) == !(x == 1) true
	 */

	public static void main(String[] args) {
		
		double num = -4;
		//2a. Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100.
		
		if((num > 1) && (num < 100)) {
			System.out.println("I am between 1 and 100");
		}
		
		//2b. Write a Boolean expression that evaluates to true if a number stored in variable num is between 1 and 100 or the number is negative.
		
		if((num > 1) && (num < 100) || num < 0) {
			System.out.println("I am a random number");
		}
		
	}

}
