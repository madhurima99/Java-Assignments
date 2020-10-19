package assgn3;

public class Stack<T> {
	
	private T a[];
	private int top;
	final int MAX = 5;
	
	public Stack() {
		a = (T[])new Object[MAX];
		top = -1;
	}
	
	public boolean push(T item) {
		if(!isFull()) {
			top++;
			a[top]=item;
			return true;
		}
		else {
			System.out.println("Stack overflow");
			return false;
		}		
	}
	
	public boolean pop() {
		if(!isEmpty()) {
			top--;
			return true;
		}
		else {
			System.out.println("Stack underflow.");
			return false;
		}			
		
	}
	
	public T peek() throws Exception
	{
		if(!isEmpty()){
			T tmp = a[top];
			return tmp;
		}
		throw new Exception();
	}
	
	public void display() {
		if(!isEmpty()) {
			//System.out.printf("Stack: ");
			for(int i=0; i<=top;i++)
				System.out.printf("%s ", a[i]);
		}
		else
			System.out.println("Stack empty.");
		
	}	
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull() {
		return top==MAX-1;
	}

	public int getIndex(T item) {
		for(int i=0; i < MAX-1;i++ ) {
			if(item==a[i])
				return i;
		}
		return 0;
	}
	
	public T getElementbyindex(int i) {
		return a[i];
	}
	
}
