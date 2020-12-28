package assgn5;

public class DemoMythread {

	public static void main(String[] args) {
		
		new Mythread();
		System.out.println("Main thread: " + Thread.currentThread());
		
		try {
			for(int i=0; i<2 ; i++) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("Exiting main thread.");
	}

}
