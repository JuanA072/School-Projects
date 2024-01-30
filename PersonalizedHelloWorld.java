import java.util.Scanner;

public class PersonalizedHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);// scanner name
		System.out.println("Hello what is your name?");
		
		
		String name = sc.nextLine(); // read user input
		
	System.out.println("Hello there " + name.toUpperCase());
	
	if(name.isEmpty()) {
		System.out.println("Nothing was entered. Please try again"); //scans for user input if blank sends error message.
		} 
	}
	
	}


