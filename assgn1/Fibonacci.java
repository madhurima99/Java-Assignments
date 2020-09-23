package assgn1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
        System.out.println("Enter no. of terms: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		CalculateFibo cal = new CalculateFibo();
		cal.fibo(n+1);
		
		System.out.println("Fabonacci series:  " );
		
		//printing position
		System.out.printf("\nn\t\t");
		for(int i=1;i<n+1;i++) {
			System.out.printf("%d\t\t",i);
		}
		
		//printing f(n)
		System.out.printf("\n\nf(n)\t\t");
		for(int i=1;i<n+1;i++) {
			System.out.printf("%d\t\t",cal.fib[i]);
		}
		
		//printing f(n+1)
		System.out.printf("\n\nf(n+1)\t\t");
		for(int i=2;i<n+2;i++) {
			System.out.printf("%d\t\t",cal.fib[i]);
		}
		
		//printing golden ratio
		System.out.printf("\n\nf(n+1)/f(n)	");
		for(int i=2;i<n+2;i++) {
			double r = (double) cal.fib[i] / cal.fib[i-1];
			System.out.printf("%f	",r);
		}
		
		
		
		sc.close();
		

	}

}

class CalculateFibo
{
	private final double PHI = 1.6180339; 
    
    
    int fib[] = new int[25];
    
	public void fibo(int n) {
		
		
			int i=2;
			fib[1]=1;						
			while(i<=n) {
				
				if(i<6) {
					
					fib[i]=fib[i-1]+fib[i-2];
					i++;
					continue;
					
				}
				
				//Using Golden ratio
				fib[i]=(int)Math.round(fib[i-1] * PHI);
				i++;  
						
		}
		
	}
	
}
