package assgn3;
import java.util.Scanner;

import assgn3.Queue;

public class DemoQueue {

	public static void main(String[] args) throws Exception {
		
		Queue<Integer> que = new Queue<>();
		
		int item;
		boolean flag;
		
		while (true)
	    {   
			System.out.println("\n----------------------MENU---------------------");
	        System.out.println("1.Enqueue element to queue");
	        System.out.println("2.Dequeue element from queue ");
	        System.out.println("3.Display all elements of queue");
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
		                flag = que.enqueue(item);
		                if(flag)
		                	System.out.println("Enqueue successful.");
		                else 
		                	System.out.println("Enqueue failed.");        	
		                
		                break;
	            case 2:
	                  flag = que.dequeue();
	                  if(flag)
		                	System.out.println("Dequeue successful.");
		               else 
		                	System.out.println("Dequeue failed.");        	
		                
		               break;
	            case 3:
	                   que.display();
	                   break;
	            case 4:
	            	System.out.println("Top element= "+ que.peek());
	                break;
	            case 5:
	            	System.exit(1);
	            default:
	            	System.out.println("Wrong choice.");
	        } /* End of switch */
	    } /* End of while */	
		
		
		

	}

}
