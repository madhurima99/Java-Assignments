package assgn3;

import java.util.Scanner;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		int item;
		boolean flag;
		LinkedList list = new LinkedList();
		
		while (true)
	    {   
			System.out.println("\n----------------------MENU---------------------");
	        System.out.println("1.Insert element to linked list");
	        System.out.println("2.Delete element from linked list ");
	        System.out.println("3.Display all elements of linked list");
	        System.out.println("4.Search ");
	        System.out.println("5.Exit");
	        System.out.println("-------------------------------------------------");
	        System.out.printf("\nEnter your choice : ");
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        System.out.printf("\n");
	        
	        
	        
	        switch (choice)
	        {
	            case 1:
		            	System.out.printf("Enter item to insert: ");
		            	item = sc.nextInt();
		                flag = list.insertInAscending(item);
		                if(flag)
		                	System.out.println("Insert successful.");
		                else 
		                	System.out.println("Insert failed.");        	
		                
		                break;
	            case 2:
	            	  System.out.printf("Enter item to delete: ");
	            	  item = sc.nextInt();
	                  flag = list.delete(item);
	                  if(flag)
		                	System.out.println("Delete successful.");
		              else 
		                	System.out.println("Delete failed.");        	
		                
		               break;
	            case 3:
	                   list.display();
	                   break;
	            case 4:
	            	  System.out.printf("Enter item to search: ");
	            	  item = sc.nextInt();
	                  flag = list.delete(item);
	                  if(flag)
		                	System.out.println(item + " is present.");
		               else 
		                	System.out.println(item + " is not present.");
	                break;
	            case 5:
	            	System.exit(1);
	            default:
	            	System.out.println("Wrong choice.");
	        } /* End of switch */
	    } /* End of while */
   }
}
