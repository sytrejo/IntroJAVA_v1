package chapter3_EndChapterProblems;

import java.util.*;

public class Ex03_10 {

	public static void main(String[] args) {
		
		// Generate two random single-digit integers
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		//Prompt the user to answer the question
		System.out.println("What is " + number1 + " + " + number2 + " ?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		//Grade the answer and display the result
		String replyString;
		if (number1 + number2 == answer)
			replyString = "You are correct!";
		else
			replyString = "Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2);
		
		System.out.println(replyString);
		
		

	}

}
