package assgn3;

public class Square {
	
	public double height;
	public double width;
	public double surfacearea;
	
	public Square() {
		height = 0;
		width = 0;
		surfacearea=0;
	}
	
	
    public Square(double height, double width) {
    	this.height = height;
    	this.width = width;
    	surfacearea = calsurfacearea();
    	
    }
    
    public Square(Square other) {
        height = other.height;
        width = other.width;
        surfacearea= other.surfacearea; 
    	
    }
    
    public void setHeight(double height) {
    	this.height = height;
    	surfacearea = calsurfacearea();
    }
    
    public void setWidth(double width) {
    	this.width = width;
    	surfacearea = calsurfacearea();
    }
    
    public double getHeight() {
    	return height;
    }
    
    public double getWidth() {
    	return width;
    }
    
    public double getSurfacearea() {
    	return surfacearea;
    }
    
    public double calsurfacearea() {
    	return (height * width);
    } 
    
    
}
