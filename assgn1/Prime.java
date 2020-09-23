package assgn1;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int i,flag=0;
		
		
		int n = Integer.parseInt(args[0]);
	
		if(n<=1)  
			  System.out.println(n+" is not a prime number.");      
			  
		else
		{  
			   for(i=2;i<=Math.sqrt(n);i++)
			   {      
			    if(n%i==0)
			    {      
			     System.out.println(n+" is not a prime number.");      
			     flag=1;      
			     break;      
			    }      
			   }   
			   
			   if(flag==0)  
			     System.out.println(n+" is a prime number.");   
		} 
		
	}

}
