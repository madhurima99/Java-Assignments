package assgn5;


class Deadlock{
	void lock() {
		String name;
		synchronized(String.class) {			
			name = Thread.currentThread().getName();
			System.out.println("Name: "+ name + " Inside lock string block.");

		synchronized(Integer.class) {
			name = Thread.currentThread().getName();
			System.out.println("Name: "+ name + " Inside lock integer block.");
		}
		}
			
	}
	void reverselock() {
		String name;
		synchronized(Integer.class) {
			name = Thread.currentThread().getName();
			System.out.println("Name: " + name +"Inside reverselock integer block.");
		synchronized(String.class) {
			name = Thread.currentThread().getName();
			System.out.println("Name: "+ name +"Inside reverselock string block.");
		}
		}
	}
}

public class DemoDeadlock {
	public static void main(String[] args) {
		Deadlock d  = new Deadlock();
			
		Thread t1 = new Thread("FirstThread") {
			public void run() {
				d.lock();
			}
		};
		
		Thread t2 = new Thread("SecondThread") {
			public void run() {
				d.reverselock();
			}
		};
		
		t1.start();  
	    t2.start(); 
	}	

}

