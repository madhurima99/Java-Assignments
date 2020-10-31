package assgn4;

public class NullPointExc {
	public static void main(String[] args) {
	      
		try{
		     Object ref = null;
	         ref.toString();
		}
		catch(NullPointerException e) {
			System.out.println("Null point exception caught.");
		}
		finally {
			System.out.println("If object ref is null, then create appropriate object ref.\nIgnore if already done.");
		}
	   
	}
}
