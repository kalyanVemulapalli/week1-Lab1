import java.util.Scanner;

public class AgeGuess {
	
	 public static void main(String[] args) {
		 
		 

		 
	    Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter name");

	    String name = myObj.nextLine();  // Read user input
	    System.out.println("Name is: " + name);  // Output user input
	 	 
	    int ageGuess = myObj.nextInt();
	    System.out.println("ageGuess is: " + ageGuess);
	    
	    
	  }
	}

