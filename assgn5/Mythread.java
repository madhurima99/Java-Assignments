package assgn5;

public class Mythread extends Thread {

	public Mythread() {
		this.setName("child");
		System.out.println("Child thread: " + this);
		start();
	}
	
	public void run() {
		try {
			for(int i=0; i<2; i++) {
				System.out.println("Child thread: "+ i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Child thread interrupted.");
		}
		
		System.out.println("Exiting child thread.");		
	}	
}

