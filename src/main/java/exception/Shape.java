package exception;

public abstract class Shape {

	String color = "";

	abstract double area();

	public abstract String toString();

	public abstract String getColor();

	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}
}
