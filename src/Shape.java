
public abstract class Shape implements Drawable {//60171631 ±èÇöÁß
	double x,y;//ÁÂÇ¥
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;

	} 
	public abstract double getArea();//³ĞÀÌ
	public abstract double getlength();//µÑ·¹
}
