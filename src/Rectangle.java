
public class Rectangle extends Shape{
	double z,w;//(x+z,y+w) = �� ���� ��ǥ
	public void draw(){
		System.out.println();
	}//�������̵�
	public Rectangle(double x, double y, double z, double w) {
		super(x,y);
		this.z = z;
		this.w = w;
		
	}//�������̵�
	public double getArea() {
		double area = z*w;
		return area;
	}
	public double getlength() {
		double length = 2*(z+w);
		return length;
	}
}
