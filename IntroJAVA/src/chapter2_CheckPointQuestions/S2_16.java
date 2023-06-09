package chapter2_CheckPointQuestions;

/*
 * 1. Can different types of numeric values be used together in a computation?
 * 
 * 	A: Yes. Different types of numeric values can be used in the smae computation through numeric conversions referred to as
 * casting
 * 
 * 2. What does an explicit casting from a double to an int do with the fractional part of the double value? Does casting
 * change the variable being cast?
 * 
 * 	A: The fractional part is truncated. Casting does not change the vaariable being cast.
 * 
 * 
 * 
 */

public class S2_16 {
	
	public static void main(String[] args) {
	//3. Show the output of the following code
	float f = 12.5F;
	int i = (int) f;
	System.out.println("f is " + f);
	System.out.println("i is " + i);
	
	//5. Show the output of the following code:
	
	double amount = 5;
	System.out.println(amount/2);
	System.out.println(5/2);
	
	}
	
	/*
	 * Write an expression that rounds down a double value in variable d to an integer. Write an expression that rounds a double value in variable d to an integer.
			Rounding down d to an integer: (int)(d)
			Rounding d to an integer: (int)(d + 0.5)
			Correction: In the last paragraph in Section 2.16 in the book, replace "rounded up" with "rounded". Note: In mathematics, 
			roundup(7.1) is 8. round(7.1) is 7. rounddown(7.6) is 7. round(7.6) is 8.

	 */
	
	
	

}
