package assgn4;

public class DivException {
	
	public static void divide() {
		int d = 0;
		int q = 25/d;
	}
	public static void main(String[] args) {
		try {
			divide();
			System.out.println("This will not be printed.");
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero.");
			System.out.println("Origin of the exception caught:\n" + e.getStackTrace()[0]);			
		}
	}

}
