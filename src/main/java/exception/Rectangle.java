package exception;

public class Rectangle extends Shape {

	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	double length = 0.0, width = 0.0;

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + getColor() + "and area is : " + area();
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.color;
	}

}
