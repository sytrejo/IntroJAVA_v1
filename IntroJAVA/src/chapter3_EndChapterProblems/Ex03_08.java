package chapter3_EndChapterProblems;

import java.util.*;

public class Ex03_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Enter three numbers
		System.out.println("Enter three integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		if (number2 > number3) {
			int temp = number2;
			number2 = number3;
			number3 = temp;
		}
		
		if (number1 > number2 ) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.println("The sorted numbers are " + number1 + " " + number2 + " " + number3);

	}

}
