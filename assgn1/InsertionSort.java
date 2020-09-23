package assgn1;
import java.util.Scanner;

public class InsertionSort {
	
	
    
	//Main method
	public static void main(String[] args) {
		
		System.out.println("Enter no. of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n+1];
		System.out.println("Enter the elements: ");
		
		a[0]= (int) Double.NEGATIVE_INFINITY;
		for(int i=1 ; i<=n ; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();		
	    
		System.out.println("UnSorted Array:");
		for(int i=1 ; i<=n ; i++){    
            System.out.print(a[i]+" ");    
        } 
		
		//Sorting sort = new Sorting();
		
		Sorting.insertionSort(a,n);
		
		System.out.println("\nSorted Array:");    
        for(int i=1 ; i<=n ; i++){    
            System.out.print(a[i]+" ");    
        }
		

	}
	
	

}


class Sorting{
   	
	
	//sort function
			public static void  insertionSort(int a[],int n) {  
		        int temp,p;
		        for(int k=2;k<=n;k++)
		        {
		           temp=a[k];
		           p=k-1;
		           while(temp<a[p])
		           {
		             a[p+1]=a[p];
		             p=p-1;
		           }
		           a[p+1]=temp;
		         }
		       
		    }
			
			
	
}

