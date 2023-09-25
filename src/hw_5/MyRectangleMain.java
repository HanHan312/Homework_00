package hw_5;

public class MyRectangleMain {
	public static void main(String[]args) {
		
		MyRectangle p1=new MyRectangle();
		p1.setWidth(10);
		p1.setDepth(20);
		System.out.println(p1.getArea());
		
		MyRectangle p2=new MyRectangle(10,20);
		System.out.println(p2.getArea());
		
		
		
	}
}
