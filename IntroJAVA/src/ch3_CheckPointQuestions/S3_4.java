package ch3_CheckPointQuestions;

public class S3_4 {

	public static void main(String[] args) {
		// Write an if statement that increases pay by 3% if score is greter than 90, otherwise increases pay by 1%
		
		double salary = 10_000;
		int score = 86;
		
		if(score > 90) {
			salary *= 1.03;
			System.out.println("After a 3% raise, your new salary is : " + salary);
		} else {
			salary *= 1.01;
			System.out.println("After a 1% raise, your new salary is : " + salary);
		}
		
		// test the following code
		
		int thirty = 30;
		int thirtyFive = 35;
		
		
//a number = thirty
		if (thirty % 2 == 0) 
		  System.out.println(thirty + " is even.");

		System.out.println(thirty + " is odd.");  // poor control

//b number = thirty	
		if (thirty % 2 == 0) 
		  System.out.println(thirty + " is even.");
		else   
		  System.out.println(thirty + " is odd.");
		
		//a number = thirtyFive
				if (thirtyFive % 2 == 0) 
				  System.out.println(thirtyFive + " is even.");

				System.out.println(thirtyFive + " is odd.");  // poor control

		//b number = thirtyFive	
				if (thirtyFive % 2 == 0) 
				  System.out.println(thirtyFive + " is even.");
				else   
				  System.out.println(thirtyFive + " is odd.");
		
		

	}

}
