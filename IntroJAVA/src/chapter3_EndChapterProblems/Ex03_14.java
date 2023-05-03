package chapter3_EndChapterProblems;

import java.util.*;

public class Ex03_14 {

	public static void main(String[] args) {
		//Obtain the random number 0 to 1
		int number = (int)(Math.random() * 2);
		
		//Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.println("Guess head or tail? " + "Enter 0 for heads and 1 for tails: ");
		int guess = input.nextInt();
		
		//Check the guess
		if(guess == number)
			System.out.println("Correct guess");
		else if (number == 0)
			System.out.println("Sorry, it is heads");
		else
			System.out.println("Sorry, it is tails");

	}

}
