package assgn5;

public class DemoRunnableThread {
	
	public static void main(String args[]) {
		
		RunnableThread r = new RunnableThread();
		Thread th = new Thread(r);
		th.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main interrupted.");
		}
		System.out.println("Exiting main thread.");
	}	

}
