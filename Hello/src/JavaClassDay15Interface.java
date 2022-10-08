
// interface ContantValues{
//	int x=10;
//	int y=20;
//}
//class Values implements ContantValues{
//	int a=x;
//	int b=y;
//	void m1() {
//		System.out.println("value of a "+a);
//		System.out.println("value of a "+b);
//	}
//	void sum() {
//		int s =x+y;
//		System.out.println("sum "+s);
//	}
//}
// class Sub implements ContantValues{
//	 void sub() {
//		 int p = y-x;
//		 System.out.println("sub "+p);
//	 }
// }
//
// public class JavaClassDay15Interface{
//	
//	public static void main(String[] args) {
//		Values a = new Values();
//		a.m1();
//		a.sum();
//		Sub s = new Sub();
//		s.sub();
//	}
//}






interface Drawable{
	void draw();

static int cubic(int x) {return x*x*x;}
}
class Rectangle1 implements Drawable{
	public void draw() {
		System.out.println("Draw Reactangle");
	}
}
//public class JavaClassDay15Interface{
//	
//	public static void main(String[] args) {
//		Drawable d = new Rectangle1();
//		d.draw();
//		System.out.println(Drawable.cubic(3));
//	}
//}


interface Printable{
	void print();
}
interface Showable{
	void Show();
}
public class JavaClassDay15Interface implements Printable,Showable{
	public void print() {
		System.out.println("Hello");
	}
	public void Show() {
		System.out.println("Show");
	}
	
	public static void main(String[] args) {
		JavaClassDay15Interface d = new JavaClassDay15Interface();
		d.print();
		d.Show();
		
	}
}
	