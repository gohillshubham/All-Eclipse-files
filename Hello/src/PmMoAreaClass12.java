class Shape1{
	void Area() {
		System.out.println("Area of the given shape for 1 argument");
	}
	void Area(int r) {
		double b = 3.14*r*r;
		System.out.println("Area of the circle is: "+b);
	}
	void Area(int a,int b) {
		int c  = a*b;
		System.out.println("Area of the Rectangle is: "+c);
	}
	void Area(double l,double b) {
		double c = (l*b)/2;
		System.out.println("Area of the Triangle is: "+c);
	}
}
public class PmMoAreaClass12 {
	public static void main(String[] args) {
		Shape1 c;
		c = new Shape1();
		c.Area();
		c.Area(5);
		c.Area(10,5);
		c.Area(5.0,5.0);
	}
}
