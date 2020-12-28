package assgn5;

public class RunnableThread  implements Runnable{

	Thread t;
	public RunnableThread() {
		
		t = new Thread(this, "Child Thread");	
	}
	
	public void run() {
		try {
		   System.out.println("Child: " + t);
		   Thread.sleep(500);
		}catch(InterruptedException e) {
			 System.out.println("Child interrupted.");			
		}
	  System.out.println("Exiting child thread.");
	}

}
