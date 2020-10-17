package assgn3;
import assgn3.Stack;

public class Queue<T> extends Stack<T> {
	
	private T a[];
	private int front;
	private int rear;
	final int MAX = 5;
	
	public Queue() {
		a = (T[])new Object[MAX];
		front = -1;
		rear = -1;
	}
	
	public boolean enqueue(T item) {
		
	    if(!isFull())
	    {
	        if (front == - 1)
	        /*If queue is initially empty */
	                 front = 0;
	        rear++;
	        a[rear] = item;
	        return true;
	    }
	    else {
	    	System.out.println("Queue Overflow.");
			return false;	    	
	    }
		
	}	
	
	public boolean dequeue() {
		
		if(!isEmpty()) {
	        front++;
	        
	        if(front-rear==1) {
	        	front=-1;
	        	rear=-1;
	        }
	        	
	        return true;
		}
		else {
			System.out.println("Queue underflow.");
			return false;
		}
		
	}
	
	public T peek() throws Exception
	{
		if(!isEmpty()){
			T tmp = a[rear];
			return tmp;
		}
		throw new Exception();
	}
	
	public void display() {
		if(!isEmpty()) {
			System.out.printf("Queue: ");
			for(int i=front; i<=rear;i++)
				System.out.printf("%s ", a[i]);
		}
		else
			System.out.println("Queue empty.");
		
	}	
	
	public boolean isEmpty()
	{   if(front==-1 || front > rear)
		   return true;
	    return false;
	}	
	
	public boolean isFull() {
		return rear==MAX-1;
	}	

}
