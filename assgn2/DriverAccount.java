package assgn2;
import java.util.Scanner;

public class DriverAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter Account holder's name: ");
		String name = sc.nextLine();
		System.out.printf("Enter Account no.: ");
		long accNo = sc.nextLong();
		System.out.printf("Enter Account type: ");
		char acctype = sc.next().charAt(0);
		System.out.printf("Enter Balance: ");
		double bal = sc.nextDouble();
		
		Account acc = new Account();
		
		acc.setName(name);
		acc.setAccNo(accNo);
		acc.setAccType(acctype);
		acc.setBal(bal);
		
		System.out.println("Current Account object:" + acc.toString());
		
		System.out.printf("Enter amount to deposit: ");
		double dep = sc.nextDouble();
		acc.deposit(dep);
		System.out.println("Current Balance:" + acc.getBal());
		
		System.out.printf("Enter amount to withdraw: ");
		double draw = sc.nextDouble();
		acc.withdraw(draw);
		System.out.println("Current Balance:" + acc.getBal());	
       
		sc.close();
	}

}
class Account{
	private String name;
	private long accNo;
	private char acctype;
	private double bal;
	public static int transaction=0;
	
	//constructors
	public Account() {
		name = "";
		accNo = 0;
		acctype = ' ';
		bal = 0.0;
	}
	public Account(String name,long accNo,char acctype,double bal) {
	    this.name = name;
		this.accNo = accNo;
		this.acctype = acctype;
		this.bal = bal;
	}
	public Account(Account other) {
		name = other.name;
		accNo = other.accNo;
		acctype = other.acctype;
		bal = other.bal;
	}
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public void setAccType(char acctype) {
		this.acctype = acctype;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	//getter method
	public String getName() {
		return name;
	}
	public long getAccNo() {
		return accNo;
	}
	public char getAccType() {
		return acctype;
	}
	public double getBal() {
		return bal;
	}
	
	//Deposit method
	public void deposit(double val) {
		bal += val;
		transaction++;
	}
	
	//withdraw method
	public void withdraw(double val) {
		bal -= val;
		transaction++;
	}
	
	//return object
	@Override
	public String toString(){ 
	return name + ", " + accNo + ", " + acctype + ", " + bal;
	}  
	
}
