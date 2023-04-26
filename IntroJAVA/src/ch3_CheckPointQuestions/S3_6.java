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

	}

}
