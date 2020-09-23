package assgn2;
import java.util.Scanner;

public class DriverRoom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter height: ");
		double h = sc.nextDouble();
		System.out.printf("Enter width: ");
		double w = sc.nextDouble();
		System.out.printf("Enter breadth: ");
		double b = sc.nextDouble();
		sc.close();
		
		//creating object of Room class.
		Room r = new Room();
		
		r.setHeight(h);
		r.setWidth(w);
		r.setBreadth(b);
				
		double vol = r.getVolume();
		System.out.println("Volume of the room is " + vol + " cubic units.");					

	}

}

class Room{
	
    private double height;
	private double width;
	private double breadth;
	
	public Room() {
		height=0.0;
		width=0.0;
		breadth=0.0;
	}
	
	public Room(double height,double width,double breadth) {
	   this.height = height;
	   this.width = width;
	   this.breadth = breadth;
	}
	
	public Room(Room other) {
		height = other.height;
		width = other.width;
		breadth = other.breadth;
	}
	
	//Setter methods
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	//Getter methods
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public double getBreadth() {
		return breadth;
	}
	
	//Calculate volume of the room
	public double getVolume() {
		
		return height*width*breadth;
		
	}	
	
}