package assgn5;
import java.util.ArrayList;

class Q
{    
	ArrayList<Character> buffer = new ArrayList<Character>();
	boolean busy = false; 
	char temp;
	synchronized void get(){
		if(!busy)
			try{
				wait();
			}catch(InterruptedException e){
			 System.out.println("Consumer: Interrupted Exception");
			}
		    
		    
		    temp = buffer.remove(0);
			System.out.println("Consumer: " + temp);
			System.out.println("Buffer: " + buffer);
			busy = false;
			notify();
			
		}
		synchronized void put(char n){
			if(busy)
				try{
					wait(); 
				} catch (InterruptedException e) {
					System.out.println("Producer:  Interupted Exception");
				}
				buffer.add(n);
				busy = true; 
				System.out.println("Producer: " + n);
				System.out.println("Buffer: " + buffer);
				notify();
		}
}


class Producer extends Thread
{
	Q q;
	Producer (Q q) 
	{ 
		this.q=q; 
		start();
	}
	public void run(){
		for(int i=0; i<5; i++)
			q.put((char)(i+65));
	}
}

class Consumer extends Thread
{
	Q q;
	Consumer (Q q) 
	{ 
		this.q=q; 
		start();
	}
	public void run(){
		for(int i=0; i<5; i++)
			q.get();
	}
}

public class DemoProducerConsumer{
	public static void main (String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}


