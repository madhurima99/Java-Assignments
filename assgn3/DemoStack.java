package assgn3;
import java.util.Scanner;

import assgn3.Stack;

public class DemoStack {

	public static void main(String[] args) throws Exception {
		
		Stack<Integer> stk1 = new Stack<>();
		int item;
		boolean flag;
		
		while (true)
	    {   
			System.out.println("\n----------------------MENU---------------------");
	        System.out.println("1.Push element to stack");
	        System.out.println("2.Pop element from stack ");
	        System.out.println("3.Display all elements of stack");
	        System.out.println("4.peek ");
	        System.out.println("5.Exit");
	        System.out.println("-------------------------------------------------");
	        System.out.printf("\nEnter your choice : ");
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        System.out.printf("\n");
	        
	        
	        
	        switch (choice)
	        {
	            case 1:
		            	System.out.printf("Enter item: ");
		            	item = sc.nextInt();
		                flag = stk1.push(item);
		                if(flag)
		                	System.out.println("Push successful.");
		                else 
		                	System.out.println("Push failed.");        	
		                
		                break;
	            case 2:
	                  flag = stk1.pop();
	                  if(flag)
		                	System.out.println("Pop successful.");
		               else 
		                	System.out.println("Pop failed.");        	
		                
		               break;
	            case 3:
	                   stk1.display();
	                   break;
	            case 4:
	            	System.out.println("Top element= "+ stk1.peek());
	                break;
	            case 5:
	            	System.exit(1);
	            default:
	            	System.out.println("Wrong choice.");
	        } /* End of switch */
	    } /* End of while */		
		

	}

}
