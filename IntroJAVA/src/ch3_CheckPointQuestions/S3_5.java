package ch3_CheckPointQuestions;

public class S3_5 {

	public static void main(String[] args) {
		
		//  3.5.1
		int x = 3;
		int y = 2;
		int z;
		
		x = 3;
		y = 4;
		
		if(x > 2) {
			if(y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else {
			System.out.println("x is " + x);
		}
		
		//3.5.2
		
		if (x > 2)
			  if (y > 2) {
			    int m = x + y;
			    System.out.println("m is " + m);
			  }
			else
			  System.out.println("x is " + x);
		
			

	}

}
