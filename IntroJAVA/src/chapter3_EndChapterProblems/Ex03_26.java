package chapter3_EndChapterProblems;

import java.util.*;

public class Ex03_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("Is " + number + " divisible by 5 and 6? " +
			      ((number % 5 == 0) && (number % 6 == 0)));
		
	    System.out.println("Is " + number + " divisible by 5 or 6? " +
	    	      ((number % 5 == 0) || (number % 6 == 0)));

	    System.out.println("Is " + number +
	    	      " divisible by 5 or 6, but not both? " +
	    	      ((number % 5 == 0) ^ (number % 6 == 0)));

	}

}
