package hw_5;

public class MyRectangle {
	private double width;
	private double depth;
	
	public void setWidth(double weidth) {
		this.width=weidth;
	}
	
	public void setDepth(double depth) {
		this.depth=depth;
	}
	public double getArea() {
		return width*depth;
		
	}
	public MyRectangle() {
		
	}
	public  MyRectangle(double weidth,double depth) {
		this.width=weidth;
		this.depth=depth;
	}
	
}

