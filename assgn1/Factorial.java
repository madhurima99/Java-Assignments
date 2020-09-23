package assgn1;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter an integer: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = Calculate.fact(n);
		
		System.out.println("Factorial of " + n + " is " + result+".");
		
		sc.close();
		
		
	}

}

class Calculate{
    
    	
	public static int fact(int n)
	{
		if (n>=1)
			return n * fact(n-1);
		else
			return 1;
	}
	
}