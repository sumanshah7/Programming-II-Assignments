
public class Shape {
	private String name;
	private double x, y;
	
	public Shape() {
		
	}
	
	public Shape(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public String getName() {
		return name;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return name +  " at (" + x + ", " + y + ")";
	}
	
	public static void main(String[] args) {
		Shape s = new Shape();
		System.out.println(s);
	}
}
