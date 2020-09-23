package assgn1;
import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		
		System.out.printf("Enter Balance: ");
		Scanner sc = new Scanner(System.in);
		double bal = sc.nextDouble();
		System.out.printf("Enter rate of interest: ");
		double rate = sc.nextDouble();
		System.out.printf("Enter no. of years: ");
		int time = sc.nextInt();
		sc.close();
		
		CalculateBalance obj = new CalculateBalance();
		
		obj.setValues(bal, rate, time );
		
		obj.findBalance();		

	}

}


class CalculateBalance
{
	private double ibal,irate;
	private int itime;
	
	public void CalculateBalance() {
		ibal=0;
		irate=0;
		itime=0;
	}
	public void CalculateBalance(double ibal,double irate,int itime) {
		this.ibal=ibal;
		this.irate=irate;
		this.itime=itime;
	}
	public void CalculateBalance(CalculateBalance other) 
	{
		ibal = other.ibal;
		irate = other.irate;
		itime = other.itime;
	}
	
	//Setter method
	public void setValues(double ibal,double irate,int itime) {
		this.ibal=ibal;
		this.irate=irate;
		this.itime=itime;
		
	}
	
	//getter methods
	public double getBal() {
		return ibal;		
	}
	public double getRate() {
		return irate;		
	}
	public double getTime() {
		return itime;
	}	
	
	//Find Balance
	public void findBalance() {
		System.out.println("\nYear No.\t"+"Previous Balance\t"+"Interest\t"+"Current Balance\n");
	    double cBal=ibal,cInt;
	    
		for (int i=1;i<=itime;i++)
		{   
		    System.out.printf("%d\t\t%.2f\t\t\t",i,cBal);
		    cInt = (cBal * irate) / 100;
		    cBal += cInt;
		    System.out.printf("%.2f\t\t%.2f\n",cInt,cBal);
		    			
		}
	}
	
}