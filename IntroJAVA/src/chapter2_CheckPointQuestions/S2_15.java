package chapter2_CheckPointQuestions;

public class S2_15 {
	
	/*
	 * 1. Which of these statements are true?
	 * 	a. Any expression can be used as a statement.
	 * 	b. The expression x++ can be used as a statement.
	 * 	c. The statement x=x+5 is also an expression
	 * 	d. The statement x=y=x=o is illegal
	 * 
	 * Answer: B and C are true.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// 2. Show the output of the following code:
		
		int a = 6;
		int b = a++; //assigns the value of a(6) to be before the incrementation
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
		

	}

}
