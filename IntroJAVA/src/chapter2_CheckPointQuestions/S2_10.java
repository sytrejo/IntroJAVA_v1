package chapter2_CheckPointQuestions;

public class S2_10 {
	/*
	 * 1. How many accurate digits are stored in a float or double type variable?
	 * 		A: A float value has 7 to 8 number of accurate digits and a double value has 15 to 17 number of accurate digits.
	 * 
	 * 2. Which of the following are correct literals for floating-point numbers?
	 * 12.3, 12.3e+2, 23.4e-2,-334.4, 20.5, 39F, 40D
	 * 
	 * All can be sused as literals for floating-point numbers. In Java, floating-point numbers has two types:
	 * float and double.
	 * 39F is a float type and the others are double type.
	 * 
	 * 3. Which of the following are the same as 52.534?
	 * 		a. 5.2534e+1
	 * 		b. 0.52534e+2
	 * 		c. 525.34e-1
	 * 		d. 5.2534e+0
	 * 
	 * Answer: A,B,C are the same as 52.534
	 * 
	 * 
	 * 
	 * 4. Which of the following are correct literals?
	 * 	a. 5_2534e+1
	 * 	b. _2534
	 * 	c. 5_2
	 * 	d. 5_
	 * 
	 * Answer: 5_2534e+1 and 5_2 are correct literals
	 * 
	 * Section 2.11
	 * 
	 * 1. What does REPL stand for? How do you launch JShell?
	 * 		REPL stands for Read-Evaluate-Print Loop.
	 * 		You can launch Jshell from the command window and type jshell
	 * 
	 * Section 2.13
	 * 
	 * 1. How do you obtain the current second minute, and hour?
	 * 
	 * long totalMills = System.currentTimeMillis() returns the milliseconds since Jan 1, 1970.
		long totalSeconds = totalMills / 1000 returns the total seconds.
		long totalMinutes = totalSeconds / 60 returns the total minutes.
		totalSeconds % 60 returns the current second.
		totalMinutes % 60 returns the current minute.
		totalMinutes / 60 % 24 returns the current hour
	 * 
	 * 
	 */

	public static void main(String[] args) {
		//Show the output of the following code
		
		double a = 6.5;
		a += a + 1; //a = 6.5 + 7.5. 
		System.out.println(a);
		a=6;
		a /= 2;
		System.out.println(a);
		


	}

}
