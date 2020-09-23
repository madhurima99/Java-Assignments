package assgn1;
import java.util.Scanner;

public class MinMaxArray {
	
	public static void main(String[] args) {
	
	
	System.out.println("Enter no. of elements: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int a[] = new int[n];
	System.out.println("Enter the elements: ");
	for(int i=0 ; i<n ; i++) {
		a[i] = sc.nextInt();
	}
	
	sc.close();
	
	System.out.println("Minimum number is  "+ FindMinMax.min(a));
	System.out.println("Maximum number is  "+ FindMinMax.max(a));
	
	
	}

}

class FindMinMax{
	
	public static int min(int a[]) {
		int min=a[0];
		for(int i : a) {
			if(min>=i)			
				min=i;
		}
		return min;
	}
	
	public static int max(int a[]) {
		int max=a[0];
		for(int i : a) {
			if(max<=i)			
				max=i;
		}
		return max;
	}
	
	
	
	
}
	
