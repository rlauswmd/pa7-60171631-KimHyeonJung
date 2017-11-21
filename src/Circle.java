
public class Circle extends Shape{
	double radius;//반지름
	public void draw(){
		
	}//오버라이드
	public Circle(double x, double y, double radious) {
		super(x,y);
		this.radius = radious;
	}//오버라이드
	public double getArea() {
		double area = (3.14)*(radius*radius);
		return area;
	}
	public double getlength() {
		double length = (3.14)*(2*radius);
		return length;
	}
}
