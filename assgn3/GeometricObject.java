package assgn3;
import java.util.Scanner;

public abstract class GeometricObject {
	
	private String color;
	private double wgt;
	
	public GeometricObject() {
		color = "white";
		wgt = 1.0;		
	}
	
	public String getColor() {
		return color;
	}
	
	public double getWeight() {
		return wgt;
	}
	
    abstract double findarea();    
    abstract double findCircumference();
}

class Triangle extends GeometricObject{
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1,double side2,double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double findCircumference() {
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 +side3 > side2)
		       return side1 + side2 + side3;
		return 0.0;
	}
	
	public double findarea() {
		double s = 0.5 * findCircumference();
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
	}	
	
}

class DemoGeometricObject{
	
	public static void main(String[] args) {
		
		double a,b,c;		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter side1 = ");
		a = sc.nextDouble();
		System.out.printf("Enter side2 = ");
		b = sc.nextDouble();
		System.out.printf("Enter side3 = ");
		c = sc.nextDouble();
		
		Triangle tri = new Triangle(a,b,c);
		if (tri.findCircumference()!=0.0 || tri.findarea()!=0.0 ) {
			System.out.printf("Triangle Circumference = %4.3f units\n",tri.findCircumference());
			System.out.printf("Triangle Area = %4.3f sq. units\n",tri.findarea());
		}				
		else
			System.out.println("Triangle not possible.");
		sc.close();
	}
	
}

