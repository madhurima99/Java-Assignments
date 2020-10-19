package assgn3;

public class LinkedList {

	//class Node
	private class Node {
		  
		private int data;
		private Node next;
		
		private	Node() {
			data = 0;
			next = null;
		}
		
	}	
	
    private Node head;
	
	public LinkedList() {
		head=null;
	}
	
	public boolean insertInAscending(int item) {
		
		Node node = new Node();
		node.data = item;
		node.next = null;
		
		if(search(item)) {
			System.out.println("Item already exist.");
			return false;
		}
		
		if(head==null) {
			head = node;//insert head
			return true;
		}
		else {
			if(item < head.data) {
				//insert at the beginning
				node.next = head;
				head = node;
				return true;
			}
			else {
				Node temp = head;				
				while(temp.next!=null && !(item < temp.next.data && item > temp.data))
					 temp = temp.next;
				
				if(temp.next==null) {//insert at end
					temp.next = node;
					return true;
				}
				else {//insert in-between
					node.next = temp.next;
					temp.next = node;
					return true;
				}				
			}
		}
	}
	
	
	public boolean delete(int item) {
		
		Node temp = head;
		Node n = head;
		
		if(head==null) {
			System.out.println("Linked list empty.");
			return false;
		}
		
		if(item==head.data && head.next==null) {//delete single node
			head=null;
			return true;
		}
		else {
			if(item==head.data) {//delete first node
				head=head.next;
				temp=null;
				return true;
			}
			else {
			while(temp.next!=null) {
				if(item==temp.data) {//delete in-between nodes
					n.next=temp.next;
					temp=null;
					return true;
				}
				else {
					n=temp;
					temp=temp.next;
				}
			}
			
			if(item==temp.data){//to delete last node
				  n.next=null;
				  temp=null;
				  return true;
			}
			else
				  return false;
			}
		}
		
		
	}
	
	
	public boolean search(int item) {
		
		Node temp = head;
		if(head==null) {
			System.out.println("Linked list empty.");
			return false;
		}
		
		if(item==head.data)
			return true;		
		else {
			while(temp.next!=null) {
				if(item==temp.data)
					return true;
				temp=temp.next;			
		     }
		}
		
		if(item==temp.data)
			return true;
		return false;		
		
	}
	
	
	public void display() {
        Node node = head;
		
        if(head==null)
        	System.out.println("Linked list empty.");
        else{
        	
        	    System.out.printf("Linked list: ");
				while(node.next!=null)
				{
					System.out.printf("%d-->",node.data);
					node = node.next;
				}
				System.out.printf("%d\n",node.data);
        }
	}
	
	
}
