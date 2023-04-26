package ch3_CheckPointQuestions;

public class S3_6 {

	public static void main(String[] args) {
		/**
		 * Rewrite the following statement using a Boolean expression:
		 * 
		 * if(count & 10 == 0)
		 * 		newLine = true;
		 * else
		 * 		newLine = false;
		 */
		int count = 5;
		
		Boolean newLine = (count % 10) == 0;
		System.out.println(newLine);
		
		//3.6.3
		
		//Are the following statements correct? Which one is better?
		
		int age = 15;
				//(a)
				if (age < 16) 
				  System.out.println
				    ("Cannot get a driver's license"); 
				if (age >= 16) 
				  System.out.println
				    ("Can get a driver's license"); 

				//(b)
				if (age < 16) 
				  System.out.println
				    ("Cannot get a driver's license"); 
				else 
				  System.out.println
				    ("Can get a driver's license");  
				
			//Both are correct b is better.
				
		//3.6.4
				
				//What is the output of the following code if number is 14, 15, or 30?
				
				int number = 14;
						//(a)
						if (number % 2 == 0) 
						  System.out.println
						    (number + " is even"); 
						if (number % 5 == 0)
						  System.out.println
						    (number + " is multiple of 5"); 

						//(b)
						if (number % 2 == 0) 
						  System.out.println
						    (number + " is even"); 
						else if (number % 5 == 0)
						  System.out.println
						    (number + " is multiple of 5"); 
						
//			For (a) if number is 14, the output is
//			            14 is even
//			if number is 15, the output is
//			            15 is multiple of 5
//			if number is 30, the output is
//			            30 is even
//			            30 is multiple of 5
//			For (b) if number is 14, the output is
//			            14 is even
//			If number is 15, the output is
//			            15 is multiple of 5
//			if number is 30, the output is
//			            30 is even	
						

	}

}
