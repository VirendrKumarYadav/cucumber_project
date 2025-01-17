package exception;

public class Circle extends Shape{

	double radius=0.0;
	
	public Circle(String color, double radius)
    {

        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

	@Override
	double area() {
		// TODO Auto-generated method stub
	  return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is " + getColor()
        + "and area is : " + area();
	}

	@Override
	public
	String getColor() {
		// TODO Auto-generated method stub
		return super.color;
	}
}
