//
//class Bike {
//	void run() {
//		System.out.println("running");
//	}
//}
//
//public class JavaClassDay12 extends Bike {
//	void run() {
//		System.out.println("running safely Splender");
//	}
//	public static void main(String[] args) {
//		Bike b = new JavaClassDay12();
//		b.run();
//		b= new Bike();
//		b.run();
//	}
//}


class Shape{
	void draw() {
		System.out.println("Started drawing");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Started drawing Rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Started drawing Circle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Started drawing Triangle");
	}
}
public class JavaClassDay12{
	public static void main(String[] args) {
		Shape s;
		s =new Circle();
		s.draw();
		s =new Triangle();
		s.draw();
		s=new Rectangle();
		s.draw();
	}
}
