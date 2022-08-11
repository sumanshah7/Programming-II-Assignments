
public class Circle extends Shape{
	
	private double radius;
	
	public Circle() {
		super("Circle", 0.0, 0.0);
		radius = 1.0;
	}
	
	public Circle(double x, double y, double radius) {
		super("Circle", x, y);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", with radius " + radius;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Circle) {
			Circle otherCircle = (Circle)other; 
			return super.equals(other) && radius == otherCircle.radius;
		}
		return false;
	}
	
	
}
