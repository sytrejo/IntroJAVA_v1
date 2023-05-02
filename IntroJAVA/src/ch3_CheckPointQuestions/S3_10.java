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
		
		/*
		 * 8. Write a Boolean expression that evaluates to true if age is greater than 13 and less than 18?
		 */
		
		int age = 16;
		
		if(age>13 && age < 18) {
			System.out.println("You are a teenager");
		}
		
		/*
		 * 9. Write a Boolean expression that evaluates to true if weight is greater than 50 pounds or height is greater than 60 inches.
		 * 
		 */
		
		int weight = 60;
		int height = 75;
		
		if( weight > 50 || height > 60) {
			System.out.println("Either your weight is above 50 pounds or you are taller than 60 inches");
		}
		
		/*
		 * 10. Write a Boolean expression that evaluates to true if weight is greater than 50 pounds AND height is greater than 60 inches.
		 * 
		 */
		
		if( weight > 50 && height > 60) {
			System.out.println("Your weight is above 50 pounds AND you are taller than 60 inches");
		}
		
		/*
		 * 1. Write a Boolean expression that evaluates to true if either weight is greater than 50 pounds or height is greater than 60 inches but not both.
		 * 
		 */
		
		if( weight > 50 ^ height > 60) {
			System.out.println("Either your weight is above 50 pounds or you are taller than 60 inches");
		}
		
		/*
		 * 12. What happens if you enter an integer as 05?
		 * 
		 * it will be the same as entering it as 5
		 * 
		 * 
		 * 13. What data types are required for a switch variable? If the Keyword break is not used after a case is sprocessed, what is the next statement to be executed?
		 * Can you convert a switch statement to an equivalent if statement, or vice versa? What are the advantages of using a switch statement?
		 * 
		 * Switch variables must be of char, byte, short, int or String types. If a break statement is not used, the next case statement is performed. You can always convert
		 * a switch statement to an equivalent if statement, but not an if statement to a switch statement. The use of the switch statement can improve readability of the 
		 * program in some cases. The compiled code for the switch statement is also more efficient than its corresponsing if statement.
		 * 
		 * 13.2 What is y after the following switch statement is wxecuted? Rewrite the code using an if-else statement?
		 * 
		 * x = 3; y 3;
		 * switch(x + 3){
		 * case 6: y = 1;
		 * default: y += 1;
		 * }
		 * 
		 * Answer: x + 3 is 6. It is case 6. y is 1. Because it does not have the break statement, it falls through to the next case. That is the default case. y += 1. y becomes 2.
		 * 
		 * if( x + 3 == 6){
		 * 		y = 1;
		 * }
		 * y += 1;
		 */
		
//		What is x after the following if-else statement is executed? Use a switch statement to rewrite it.
//				int x = 1, a = 3;
//				if (a == 1)
//				  x += 5;
//				else if (a == 2)
//				  x += 10;
//				else if (a == 3)
//				  x += 16;
//				else if (a == 4)
//				  x += 34;
//				x is 17
//				switch (a) { 
//				  case 1: x += 5; break;
//				  case 2: x += 10; break;
//				  case 3: x += 16; break;
//				  case 4: x += 34;
//				}
		
//		Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.
//		switch (day) { 
//		  case 0: System.out.println("Sunday"); break;
//		  case 1: System.out.println("Monday"); break;
//		  case 2: System.out.println("Tuesday"); break;
//		  case 3: System.out.println("Wednesday"); break;
//		  case 4: System.out.println("Thurday"); break;
//		  case 5: System.out.println("Friday"); break;
//		  case 6: System.out.println("Saturday"); break;
//		}
		
	}

}
