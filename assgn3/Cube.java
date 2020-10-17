package assgn3;

import assgn3.Square;

public class Cube extends Square {
	
	public double depth;    
	
	public Cube() {		
		depth = 0;
		height = 0;
		width = 0;
		surfacearea = calsurfacearea();
	}
	
	public Cube(double depth, double height, double width) {
		this.depth = depth;
		this.height = height;
		this.width = width;
		surfacearea = calsurfacearea();
	}
	
	public Cube(Cube other) {
		depth = other.depth;
		height = other.height;
        width = other.width;        
        surfacearea= other.surfacearea; 
		
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getDepth() {
    	return depth;
    }
	
	public double calsurfacearea() {
    	return 2 * ( depth*height + height*width + width*depth );
    }

}
