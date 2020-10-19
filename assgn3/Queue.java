package assgn3;
import assgn3.Stack;

public class Queue<T>{
    
	Stack <T> st1, st2;
	
	public Queue()
	{
		 st1 = new Stack <T>();
		 st2 = new Stack <T>();
	}
	
	public boolean enqueue(T data)
	{
		 return st1.push(data);
	}
	
	public boolean dequeue() throws Exception
	{   
		boolean flag;
	
		if(st1.isEmpty() && st2.isEmpty())
		{  
			System.out.println("Queue is empty.");
			return false;
		}
		else {
			if(st2.isEmpty())
			{
				while(!st1.isEmpty())
				{
					st2.push(st1.peek());
					st1.pop();
				}
			}
			st2.pop();
			return true;
		}
	}
	
	public T peek() throws Exception
	{
		if(st1.isEmpty() && st2.isEmpty())
		{
			System.out.println("Queue is empty.");
			throw new Exception();
			
		}
		else if(st2.isEmpty() && !st1.isEmpty())
				return st1.getElementbyindex(0);
	    else
				return st2.peek();			
	}
	
	public void display() throws Exception {
		if(st1.isEmpty() && st2.isEmpty())
		{
			System.out.println("Queue is empty.");			
		}
		else {
			System.out.printf("Queue: ");
			
			if(st2.isEmpty() && !st1.isEmpty()) {
				st1.display();
			}
			
			else if(!st2.isEmpty() && st1.isEmpty()) {
				for(int i=st2.getIndex(st2.peek()); i>-1;i--) 
				       System.out.printf("%s ",st2.getElementbyindex(i));		
			}
			
			else if(!st2.isEmpty() && !st2.isEmpty()) {
				for(int i=st2.getIndex(st2.peek()); i>-1;i--) 
					System.out.printf("%s ",st2.getElementbyindex(i));
				st1.display();
			}
		}
	}	
	
}