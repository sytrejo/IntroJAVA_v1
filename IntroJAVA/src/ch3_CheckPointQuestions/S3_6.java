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

	}

}
