package chapter2_CheckPointQuestions;

public class S2_6 {

	public static void main(String[] args) {
		 int i = j = k = 2;
		 System.out.println(i + " " + j + " " + k);
		 
	/*
	 * Note that the statement int i = j = k = 2 in line 3 only declares i. j and k are not declared. The following line would declare i, j, and k:
			int i, j, k;
			To fix the error, change line 3 to
			int j, k;
			int i = j = k = 2;
			or
			int i = 2;
			int j = 2;
			int k = 2;
			or
			int i = 2, j = 2, k = 2;
	 */

	}

}
