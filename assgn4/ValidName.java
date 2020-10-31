package assgn4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidName {
	
	public static String checkvalidName(String name) throws InputMismatchException {
		//checking if there's any alphanumeric char present and all chars are alphabets.
		if(name.matches(".*\\w.*") && name.matches("^[\sa-zA-Z]*$") )
			return name;
		else
			throw new  InputMismatchException();			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter name: ");
		String name = sc.nextLine();
		sc.close();
		try {
			name = checkvalidName(name);
			System.out.println("You entered: "+ name);
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid name.");
			System.out.println("Exception: "+ e);
		}
     
	}

}
