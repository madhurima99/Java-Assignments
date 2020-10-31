package assgn4;
import java.util.Scanner;

public class MathException extends Exception{
       
	public int num;
	public MathException(int a) {
		num = a;
	}
	@Override
	public String toString() {
		return "MathException caught [" + num  + "]";
	}	
}

class OverFlowException extends MathException{

	public OverFlowException(int a) {
		super(a);
	}
	
	@Override
	public String toString() {
		return "OverFlowException caught [" + num  + "]";
	}
}

class UnderFlowException extends MathException{

	public UnderFlowException(int a) {
		super(a);
	}
	
	@Override
	public String toString() {
		return "UnderFlowException caught [" + num  + "]";
	}
}

class DemoMathExc{
	static void compare(int a) throws OverFlowException, UnderFlowException {
		System.out.println("Called compare(" + a + ")");
		try{
		   if(a != 100)
		      throw new MathException(a);
		   System.out.println("No exception found.");
		}
		catch(MathException e) {
			if(a>100)
				throw new OverFlowException(a);
			else 
				throw new UnderFlowException(a);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter number: ");
		int a = sc.nextInt();
		sc.close();
		try {
			compare(a);
		}
		catch(OverFlowException e) {
			System.out.println(a + " is greater than 100.");
			System.out.println("Exception: " + e);
		}
		catch(UnderFlowException e) {
			System.out.println(a + " is lesser than 100.");
			System.out.println("Exception: " + e);
		}
		
	}
}