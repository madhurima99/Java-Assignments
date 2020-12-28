package assgn5;

public class MainThread {

	
	public static void main(String args[]) {
		
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		
		try {
			for(int n=0;n<5; n++) {
				System.out.println(t.getName()+": "+n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			 
			System.out.println("Main thread interrupted");
		}
		
	}	
}
