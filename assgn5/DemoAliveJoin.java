package assgn5;

public class DemoAliveJoin {
   
public static void main(String args[]) {
		
		AliveJoin ob1 = new AliveJoin("First");
		AliveJoin ob2 = new AliveJoin("Second");
		
		System.out.println("First thread is alive: "
				+ ob1.t.isAlive());
		System.out.println("Second thread is alive: "
				+ ob2.t.isAlive());
		try {
			System.out.println("Waiting for child threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main interrupted.");
		}
		
		System.out.println("First thread is alive: "
				+ ob1.t.isAlive());
		System.out.println("Second thread is alive: "
				+ ob2.t.isAlive());
		System.out.println("Exiting main thread.");
	}

}
