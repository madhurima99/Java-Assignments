package assgn2;
import java.util.Scanner;

public class DriverArea {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//square
		System.out.println("Calculate area of a square:-");
		System.out.printf("Enter length of side: ");
		double s = sc.nextDouble();
		System.out.printf("Area of the square=%5.4f sq. units\n", CalArea.area(s));
		
		//rectangle
		System.out.println("\nCalculate area of a rectangle:-");
		System.out.printf("Enter length: ");
		double ln = sc.nextDouble();
		System.out.printf("Enter breadth: ");
		double br = sc.nextDouble();
		System.out.printf("Area of the rectangle=%5.4f sq. units\n",CalArea.area(ln,br));
		
		//triangle
		System.out.println("\nCalculate area of a triangle:-");
		System.out.printf("Enter sideA: ");
		double a = sc.nextDouble();
		System.out.printf("Enter sideB: ");
		double b = sc.nextDouble();
		System.out.printf("Enter sideC: ");
		double c = sc.nextDouble();
		double ar= CalArea.area(a,b,c);
		if(ar!=0)
		  System.out.printf("Area of the triangle=%5.4f sq. units", ar);
		else 
			System.out.println("The triangle is impossible . ");
		
		sc.close();
		

	}

}

class CalArea{
	
	//square area
	public static double area(double side) {
		return side*side;
	}
	
	//rectangle area
	public static double area(double length,double breadth) {
		return length*breadth;
	}
	
	//triangle area
	public static double area(double sideA, double sideB, double sideC) {
		
		if(sideA + sideB > sideC && sideB + sideC > sideA && sideA +sideC > sideB) {
			double p = (sideA + sideB + sideC) / 2;       
	       return( Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)));
		}
		else
			return 0.0;
		
		
	}
	
}