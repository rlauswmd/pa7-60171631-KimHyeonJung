
public abstract class Shape implements Drawable {//60171631 ������
	double x,y;//��ǥ
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;

	} 
	public abstract double getArea();//����
	public abstract double getlength();//�ѷ�
}
