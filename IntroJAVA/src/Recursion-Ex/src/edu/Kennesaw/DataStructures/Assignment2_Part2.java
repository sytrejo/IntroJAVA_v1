package edu.Kennesaw.DataStructures;

public class Assignment2_Part2 {
	
	public static void recursiveMethod(int n) {
        if (n <= 0) {
            return;
        }
        
        String indentation = "";

        // Output the message with the specified indentation
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                indentation += " "; // Append a space for each indentation level
                
            }
            System.out.println(indentation + "This was written by call number " + i);
    
        }


        // Output the message with decreased indentation level
        for (int i = 0; i < n; i++) {
        	indentation = indentation.substring(1); // Remove a space for each indentation level
            System.out.println(indentation + "This was ALSO written by call number " + (n - i));
        }
            
          

	}
	
	public static void main(String[] args) {
		
		recursiveMethod(4);
	}
}
