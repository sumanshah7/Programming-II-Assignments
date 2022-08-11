
public class MyRectangle2D {
	//Specifying the center of the rectangle x and y
	//Specifying height and width of the rectangle
	private double x, y;
	private double height, width;
	
	
	//No-args constructor that creates a default rectangle with (0,0) for (x,y) and 1 for width and height
	public MyRectangle2D() {
		this.x=0;
		this.y=0;
		this.height=1;
		this.width=1;
	}
	
	//A constructor to specify x,y,height and width of rectangle
	public MyRectangle2D(double x,double y, double height, double width) {
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
	}
	
	
	//Get method for X-axis
	public double getX() {
		return x;
	}
	
	//Set method for X-axis
	public void setX(double x) {
		this.x=x;
	}
	
	//Get method for Y-axis
	public double getY() {
		return y;
	}
	
	//Set method for Y-axis
	public void setY(double y) {
		this.y=y;
	}
	
	//Get method for height
	public double getHeight() {
		return height;
	}
	
	//Set method for height
	public void setHeight(double height) {
		this.height=height;
	}
	
	//Get method for width
	public double getWidth() {
		return width;
	}
	
	//Set method for width
	public void setWidth(double width) {
		this.width=width;
	}
	
	//Returns the area of rectangle
	public void getArea() {
		double area = height*width; 
	}
	
	//Returns the perimeter of rectangle
	public void getPerimeter() {
		double area = 2*width+2*height; 
	}
	
	//Returns True if point is inside the rectangle and False if not
	public boolean contain(double x, double y) {
		if((x>= (this.x - (this.width/2))&& x<=((this.width/2)+this.x))  && (y>=(this.y-(this.height/2)) && y<=((this.height/2)+this.y)) {
			return true;
		}
		
		return false;
	}
	
	
}
