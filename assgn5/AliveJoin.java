package assgn5;

public class AliveJoin implements Runnable {
	
   String name;
   Thread t;
   
   public AliveJoin(String name) {
	   this.name = name;
	   t = new Thread(this,name);
	   t.start();	   
   }
   
   public void run() {
	   try {
		   System.out.println("Name: " + name);
		   Thread.sleep(1000);
	   }catch (InterruptedException e) {
		   System.out.println(name + " interrupted.");
	   }
	   System.out.println(name + " exiting.");
   }
}
