package chapter2_EndChapterProblems;
import java.util.*;

public class Ex02_04 {
	/*
	 * Write a program that converts pounds to Kilograms.
	 */

	public static void main(String[] args) {
		//Prompt the input
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds+ " pounds is " + kilograms + " kilograms"); 

	}

}
