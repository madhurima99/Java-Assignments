package assgn3;
import assgn3.Cube;
import java.util.Scanner;

public class DemoSquare {

	public static void main(String[] args) {
		
		double h,w,d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Square/rectangle area:-");
		System.out.printf("Enter height:  ");
		h = sc.nextDouble();
		System.out.printf("Enter width:  ");
		w = sc.nextDouble();		
		Square sq = new Square(h,w);
		System.out.printf("Surface area of square/rectangle = %5.3f sq. units\n", sq.getSurfacearea());
		
		System.out.println("Cube/cuboid surface area:-");
		System.out.printf("Enter depth:  ");
		d = sc.nextDouble();
		Cube cb = new Cube(d,h,w);
		System.out.printf("Surface area of cube/cuboid = %5.3f cube units", cb.getSurfacearea());
		
		sc.close();
	
	}

}
