package assgn2;
import java.util.Scanner;

public class DriverFraction {

	public static void main(String[] args) {
             
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first fraction: ");
		System.out.printf("Enter numerator: ");
		int num1 = sc.nextInt();
		System.out.printf("Enter denominator: ");
		int den1 = sc.nextInt();
		System.out.println("\nEnter second fraction: ");
		System.out.printf("Enter numerator: ");
		int num2 = sc.nextInt();
		System.out.printf("Enter denominator: ");
		int den2 = sc.nextInt();
		
		sc.close();
		
		Fraction f1 = new Fraction(num1,den1);
		Fraction f2 = new Fraction(num2,den2);
		
		if(f1.equals(f2))
		   System.out.println("\nThe two fractions are equal.");
		else
		System.out.println("\nThe two fractions are not equal.");		
		
		Fraction f_add = new Fraction();
		f_add = Fraction.add(f1, f2);
		System.out.println("Addition result= " + f_add.toString() + " or " + String.format("%.2f",f_add.getValue()));
		
		Fraction f_sub = new Fraction();
		f_sub = Fraction.sub(f1, f2);
		System.out.println("Subtraction result= " + f_sub.toString() + " or " + String.format("%.2f",f_sub.getValue()));
		
		Fraction f_mul = new Fraction();
		f_mul = Fraction.multiply(f1, f2);
		System.out.println("Multiplication result= " + f_mul.toString() + " or " + String.format("%.2f",f_mul.getValue()));
		
		Fraction f_div = new Fraction();
		f_div = Fraction.divide(f1, f2);
		System.out.println("Division result= " + f_div.toString() + " or " + String.format("%.2f", f_div.getValue()));
		

	}
	

}
class Fraction
{
	//instance variables
	private int num;
	private int den;
	
	//default constructor
	public Fraction()
	{	
		num = 0;
		den = 1;
	}
	
	//parameterized constructor
	public Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}
	
	//copy constructor
	public Fraction(Fraction other)
	{
		num = other.num;
		den = other.den;
	}
	
	
	//method returns num
	public int getNum()
	{
		return num;
	}
	
	//method returns den
	public int getDen()
	{
		return den;
	}
	
	//method set the value of num
	public void setNum(int num)
	{
		this.num = num;
	}
	
	//method set the value of den
	public void setDen(int den)
	{
		this.den = den;
	}
	
	//add two Fraction objects	
	public static Fraction add(Fraction a, Fraction b)
	{
			Fraction c = new Fraction();
					
			c.num = a.num * b.den + b.num * a.den;
			c.den = a.den * b.den;
			int d = gcd(c.num, c.den);
			c.num/=d;
			c.den/=d;
			
			return c;
	}
	
	//subtract two Fraction objects
	public static Fraction sub(Fraction a, Fraction b)
	{
			Fraction c = new Fraction();
					
			c.num = a.num * b.den - b.num * a.den;
			c.den = a.den * b.den;
			int d = gcd(c.num, c.den);
			c.num/=d;
			c.den/=d;
			
			return c;
	}
	
	//multiply two fraction objects
	public static Fraction multiply(Fraction a, Fraction b)
	{
			Fraction c = new Fraction();
					
			c.num = a.num * b.num;
			c.den = a.den * b.den;
			int d = gcd(c.num, c.den);
			c.num/=d;
			c.den/=d;
			
			return c;
	}
	
	//divide two fraction objects
	public static Fraction divide(Fraction a, Fraction b)
	{
				Fraction c = new Fraction();
						
				c.num = a.num * b.den;
				c.den = a.den * b.num;
				int d = gcd(c.num, c.den);
				c.num/=d;
				c.den/=d;
				
				return c;
	}
	
	//helper method: return gcd of a and b
	private static int gcd(int a, int b)
	{
		if(a%b==0)
			return b;
		return gcd(b, a%b);
	}
	
	//returns the double value of the Fraction
	public double getValue()
	{
		return (double)num/den;
	}
	
	
	//equal
	@Override
	public boolean equals(Object obj) {
		Fraction fobj = (Fraction) obj;
		if(this.num==fobj.num && this.den==fobj.den)
			return true;
		else 
			return false;
	}
	
	
	//return the fraction as String
	@Override
	public String toString()
	{
		return num + "/" + den;
	}
}

