package assgn4;

public class ArrayExc {
	
	public static void array() {		
			int ar[] = {1,2,3,4,5,6,7,8,9,10};
		    ar[15]=25;
	}
	
	public static void main(String[] args) {
		try {
			try {
				array();
				System.out.println("Array insert successful.");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Rethrowing exception caught.");
				throw e;
			}
		}
		catch(Exception e) {
			System.out.println("Exception: " + e);
     		System.out.println("Origin of the exception caught: " + e.getStackTrace()[0]);
		}

	}

}
