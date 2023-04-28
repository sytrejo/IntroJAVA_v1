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
		
		double x = 10.3;
		//3a. Write a boolean expression for |x-5| < 4.5
		
		if((x - 5) < 4.5 && (x - 5) > -4.5) {
			System.out.println("I'm the absolute value of |x-5| which is less than 4.5");
			
		}
		
		
		//3b. Write a Boolean expression for |x-5| > 4.5
		
		if((x - 5) < 4.5 || (x - 5) > -4.5) {
			System.out.println("I'm the absolute value of |x-5| which is greater than 4.5");
			
		}
		
		/*
		 * 4. Assume that x and y are int type. Which of the following are legal Java expressions?
		 * 
		 * a. x > y > 0  //incorrect not valid
		 * b. x = y && y //incorrect not valid
		 * c. x /= y 	 // correct divide x by y and set the result as the new value for x
		 * d. x or y	 // incorrect not valid
		 * e. x and y	// incorrect not valid	
		 * f. (x != 0) || (x = 0) // incorrect on x = 0...it should be x == 0
		 * 
		 * 
		 */
		
//		5. Are the following two expressions the same?
//				(a) x % 2 == 0 && x % 3 == 0 
//				(b) x % 6 == 0 
		//Answer: yes
		
		/*
		 * 6. What is the value of the expression x >= 50 && x <= 100 if x is 45, 67, or 101?
		 * a. if x is 45, the expression is false
		 * b. if x is 67, the expression is true
		 * c. if x is 101, the expression is false
		 * 
		 */
		
	}

}
