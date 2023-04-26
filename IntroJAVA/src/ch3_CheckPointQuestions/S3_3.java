package ch3_CheckPointQuestions;

public class S3_3 {

	public static void main(String[] args) {
		// 1. Write an if statement that assigns 1 to x if y is greater than 0
		
		int y = 1;
		int x;
		
		if(y > 0) {
			x = 1;
			System.out.println(x);
		}
		
		// 2. Write an if statement that increases pay by 3% if score is greater than 90
		
		double salary= 10000;
		int score = 95;
		
		if(score > 90) {
			salary = (salary * .03) + salary;
			System.out.println(salary);
		}
		
		salary = 10000;
		
		//better if statement
		if(score > 90) {
			salary *= 1.03;
			System.out.println(salary);
			
		}
		
		

	}
	
	/**
	 * What is wrong in the following code?
	 * 
	 * if radius >= 0 { 
	 * area = radius * radius * PI; 
	 * System.out.println("The area for the circle of " + " radius " + radius
	 * + " is " + area); 
	 * }
	 * 
	 * The parentheses is required for the condition radius >=0
	 * 
	 */

}
