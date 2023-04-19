package chapter2_CheckPointQuestions;

public class S2_9_2 {
	/*
	 * Find the largest and smallest byte, short, int, long float, and double. 
	 * Which of these data types requires the least amount of memory? 
	 * 		For byte, from -128 to 127, inclusive.
			For short, from -32768 to 32767, inclusive.
			For int, from -2147483648 to 2147483647, inclusive.
			For long, from -9223372036854775808 to 9223372036854775807.
			For float, the smallest positive float is 1.40129846432481707e-45 and the largest float is 3.40282346638528860e+38.
			For double, the smallest positive double is 4.94065645841246544e-324 and the largest double is 1.79769313486231570e+308d.

	 */

	public static void main(String[] args) {
		
		//Show the result of the following remainders
		System.out.println("******2.9.2******");
		System.out.println(56%6);
		System.out.println(78%-4);
		System.out.println(-34%5);
		System.out.println(-34%-5);
		System.out.println(5%1);
		System.out.println(1%5);
		
		//if today is Tuesday, what will be the day in 100 days?
		System.out.println("************2.9.2.2**********");
		
		System.out.println((2+100)%7); //4 so the day is Thursday
		
		//What is the result of 25/4? How would you rewrite the expression if you wished the result to be a floating-point number?
		System.out.println("***********2.9.2.3***************");
		System.out.println(25/4); //6
		
		//if you want the quotient to be a floating-point number, rewrite it as:
		System.out.println(25.0/4.0);
		System.out.println(25.0/4);
		System.out.println(25/4.0);
		
		//Show the result of the following code
		System.out.println("***********2.9.2.4***************");
		System.out.println(2 * (5 / 2 + 5 / 2));  //8
		System.out.println(2 * 5 / 2 + 2 * 5 / 2); //10
		System.out.println(2 * (5 / 2)); //4
		System.out.println(2 * 5 / 2); //5
		
		//Are the following statements correct? If so, show the output.
		System.out.println("***********2.9.2.5***************");
		
		System.out.println("25 / 4 is " + 25 / 4); //6
		System.out.println("25 / 4.0 is " + 25 / 4.0); //6.25
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4); //1
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4); //1.5
		
		//the statements are correct but you need to remember what type of arithmetic the compiler will complete
		

	}

}
