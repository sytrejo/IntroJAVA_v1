package chapter2_CheckPointQuestions;

public class S2_7 {
	
	/*
	 * What are the benefits of using constants? Declare an int constant SIZE with value 20.
	 * 
	 * There are three benefits of using constants:
	 * 		1. you don't have to repeatedly type the same value;
	 * 		2. the value can be changed in a single location, if necessary;
	 * 		3. the program is easy to read
	 * 
	 * 		final int SIZE = 20;
	 * 
	 */

	public static void main(String[] args) {
		
		/*
		 * Translate the following algorithm into Java code:
				Step 1: Declare a double variable named miles with initial value 100.
				Step 2: Declare a double constant named KILOMETERS_PER_MILE with value 1.609.
				Step 3: Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers.
				Step 4: Display kilometers to the console.
			What is kilometers after Step 4?
		 */
		
		//Step 1:
		double miles = 100;
		
		//Step 2: 
		final double KILOMETERS_PER_MILE = 1.609;
		
		//Step 3: 
		double kilometers = KILOMETERS_PER_MILE * miles;
		
		System.out.println(kilometers);
		
		//value = 160.9

	}

}
